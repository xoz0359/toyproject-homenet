package io.cavia.homenet.service;

import io.cavia.homenet.client.ApiWebSocketClient;
import io.cavia.homenet.client.ApiWebSocketHandler;
import io.cavia.homenet.client.RestWebClient;
import io.cavia.homenet.dto.response.KorStock047Output;
import io.cavia.homenet.mapper.KorStockRestRequestMapper;
import io.cavia.homenet.repository.StocksDefaltRepository;

import org.springframework.data.domain.PageRequest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

@Component
public class StockDataCollectorImpl implements StockDataCollector {


    private final ApiWebSocketClient webSocketClient;
    private final ApiWebSocketHandler apiWebSocketHandler;
    private final RestWebClient restWebClient;
    private final StocksDefaltRepository stockDefaltRepository;
    private final KorStockRestRequestMapper korStockRestRequestMapper;

    private HashMap<String, Integer> stockCodeMap;

    private final int ONE_MINUTES_IN_MILLIS = 1000*60;
    private final String KOSDAQ = "1001";
    private final String PRICE_AND_TRADE_VOLUME = "3";

    public StockDataCollectorImpl(ApiWebSocketClient webSocketClient,
                                  ApiWebSocketHandler apiWebSocketHandler,
                                  RestWebClient restWebClient,
                                  StocksDefaltRepository stockDefaltRepository,
                                  KorStockRestRequestMapper korStockRestRequestMapper){

        this.webSocketClient = webSocketClient;
        this.apiWebSocketHandler = apiWebSocketHandler;
        this.restWebClient = restWebClient;
        this.stockDefaltRepository = stockDefaltRepository;
        this.korStockRestRequestMapper = korStockRestRequestMapper;
    }

    @Override
    @Scheduled(cron = "0 10 9 * * ?")
    public void collect() {
        stockCodeMap = new HashMap<String, Integer>();
        List<KorStock047Output> list047 = restWebClient.searchStockInfo047(KOSDAQ, PRICE_AND_TRADE_VOLUME).getOutput();

        for (int i = 0; i < 20; i++) {
            System.out.println(list047.get(i));
            stockDefaltRepository.save(korStockRestRequestMapper.toStock(list047.get(i), LocalDateTime.now()));
            stockDefaltRepository.findAllByOrderByIdDesc(PageRequest.of(0, 20))
                    .forEach(j -> stockCodeMap.put(j.getCode(), j.getId()));
        }

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
            e.printStackTrace();
        }
    }

    public HashMap<String, Integer> getStockCodeMap() {
        return stockCodeMap;
    }
}
