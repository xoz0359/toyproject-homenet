package io.cavia.homenet.service;

import io.cavia.homenet.client.ApiWebSocketClient;
import io.cavia.homenet.client.ApiWebSocketHandler;
import io.cavia.homenet.client.RestWebClient;
import io.cavia.homenet.domain.Quotes;
import io.cavia.homenet.domain.Stocks;
import io.cavia.homenet.domain.Trades;
import io.cavia.homenet.dto.response.KorStock047Output;
import io.cavia.homenet.mapper.KorStockRestRequestMapper;
import io.cavia.homenet.repository.ApiOAuthRepository;
import io.cavia.homenet.repository.QuotesDefaultRepository;
import io.cavia.homenet.repository.StocksDefaultRepository;
import io.cavia.homenet.repository.TradesDefaultRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional
@Service
public class SummaryStocksDataServiceImpl implements SummaryStocksDataService {

    private final StocksDefaultRepository stockDefaultRepository;
    private final TradesDefaultRepository tradesDefaultRepository;
    private final QuotesDefaultRepository quotesDefaultRepository;
    private final ApiOAuthRepository apiOAuthRepository;
    private final ApiWebSocketClient webSocketClient;
    private final ApiWebSocketHandler apiWebSocketHandler;
    private final RestWebClient restWebClient;
    private final KorStockRestRequestMapper korStockRestRequestMapper;

    private final int ONE_MINUTES_IN_MILLIS = 1000*60;
    private final String KOSDAQ = "1001";
    private final String PRICE_AND_TRADE_VOLUME = "3";

    public SummaryStocksDataServiceImpl(StocksDefaultRepository stockDefaultRepository,
                                        TradesDefaultRepository tradesDefaultRepository,
                                        QuotesDefaultRepository quotesDefaultRepository,
                                        ApiOAuthRepository apiOAuthRepository,
                                        ApiWebSocketClient webSocketClient,
                                        ApiWebSocketHandler apiWebSocketHandler,
                                        RestWebClient restWebClient,
                                        KorStockRestRequestMapper korStockRestRequestMapper) {
        this.stockDefaultRepository = stockDefaultRepository;
        this.tradesDefaultRepository = tradesDefaultRepository;
        this.quotesDefaultRepository = quotesDefaultRepository;
        this.apiOAuthRepository = apiOAuthRepository;
        this.webSocketClient = webSocketClient;
        this.apiWebSocketHandler = apiWebSocketHandler;
        this.restWebClient = restWebClient;
        this.korStockRestRequestMapper = korStockRestRequestMapper;
    }

    @Override
    public void deleteApiToken() {
        apiOAuthRepository.deleteAllByCredentialOwner();
    }

    @Override
    public void collectStockDatas() {

        if(restWebClient
                .searchMarketIsOpen040()
                .getOutput()
                .get(0)
                .getOpen()
                .equals("N")
        ) return;

        synchronizedIdWithRowCount();

        // 거래대금 상위 20개 종목을 담을 맵
        Map<String, Integer> stockCodeMap = new HashMap<>();

        // 실시간 거래대금 상위 20개 종목 조회 요청
        List<KorStock047Output> list047 = restWebClient.searchStockInfo047(KOSDAQ, PRICE_AND_TRADE_VOLUME).getOutput();

        // 선별 종목들을 DB에 저장하고 stockCodeMap에 저장
        for (int i = 0; i < 20; i++) {
            System.out.println(list047.get(i));
            stockDefaultRepository.save(korStockRestRequestMapper.toStock(list047.get(i), LocalDateTime.now()));
            stockDefaultRepository.findAllByOrderByIdDesc(PageRequest.of(0, 20))
                    .forEach(j -> stockCodeMap.put(j.getCode(), j.getId()));
        }

        // 저장한 Map을 ApiWebSocketHandler에 주입
        apiWebSocketHandler.setStockCodeMap(stockCodeMap);

        try {
            webSocketClient.connectToWebSocket();
            Thread.sleep(1000);
            for (int i = 0; i < 20; i++) {
                webSocketClient.subscribeWebSocket(list047.get(i).getCode(), ApiWebSocketClient.TR_ID_EXECUTION_PRICE);
                webSocketClient.subscribeWebSocket(list047.get(i).getCode(), ApiWebSocketClient.TR_ID_QUOTED_PRICE);
            }
            Thread.sleep(ONE_MINUTES_IN_MILLIS * 30);
            for (int i = 0; i < 20; i++) {
                webSocketClient.unsubscribeWebSocket(list047.get(i).getCode(), ApiWebSocketClient.TR_ID_EXECUTION_PRICE);
                webSocketClient.unsubscribeWebSocket(list047.get(i).getCode(), ApiWebSocketClient.TR_ID_QUOTED_PRICE);
            }
            Thread.sleep(1000);
            webSocketClient.disconnect();
        } catch (Exception e) {
            throw new RuntimeException("API 웹소켓 연결 중 예외 발생: " + e.getMessage(), e);
        }
    }

    @Override
    public List<Stocks> getStocksAll() {
        return stockDefaultRepository.findAllByOrderByIdAsc();
    }

    @Override
    public List<Trades> getTradesByStockId(int stockId) {
        return tradesDefaultRepository.findAllByStockIdOrderByIdAsc(stockId);
    }

    @Override
    public List<Quotes> getQuotesByStockId(int stockId) {
        return quotesDefaultRepository.findAllByStockIdOrderByIdAsc(stockId);
    }

    @Override
    public void deleteStocks(int stockId) {
        stockDefaultRepository.deleteById(stockId);
        tradesDefaultRepository.deleteAllByStockId(stockId);
        quotesDefaultRepository.deleteAllByStockId(stockId);
    }

    @Override
    public void synchronizedIdWithRowCount(){
        stockDefaultRepository.resetAutoIncrement(stockDefaultRepository.findMaxId());
        quotesDefaultRepository.resetAutoIncrement(quotesDefaultRepository.findMaxId());
        tradesDefaultRepository.resetAutoIncrement(tradesDefaultRepository.findMaxId());
    }
}
