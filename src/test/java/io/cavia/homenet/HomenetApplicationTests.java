package io.cavia.homenet;

import io.cavia.homenet.client.ApiWebSocketClient;
import io.cavia.homenet.client.ApiWebSocketHandler;
import io.cavia.homenet.client.RestWebClient;
import io.cavia.homenet.dto.response.KorStock047Output;
import io.cavia.homenet.mapper.QotesMapper;
import io.cavia.homenet.mapper.TradersMapper;
import io.cavia.homenet.mapper.KorStockRestRequestMapper;
import io.cavia.homenet.repository.QuotesDefaultRepository;
import io.cavia.homenet.repository.StocksDefaultRepository;
import io.cavia.homenet.repository.TradesDefaultRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class HomenetApplicationTests {

	@Autowired
	private ApiWebSocketClient webSocketClient;
	@Autowired
	private ApiWebSocketHandler apiWebSocketHandler;
	@Autowired
	private TradersMapper tradersMapper;
	@Autowired
	private QotesMapper qotesMapper;
	@Autowired
	private RestWebClient restWebClient;
	@Autowired
	private StocksDefaultRepository stockDefaltRepository;
	@Autowired
	private KorStockRestRequestMapper korStockRestRequestMapper;
	@Autowired
	private ApiWebSocketClient apiWebSocketClient;
	@Autowired
	private QuotesDefaultRepository quotesRepository;
	@Autowired
	private TradesDefaultRepository tradesDefaultRepository;

	private HashMap<String, Integer> stockCodeMap = new HashMap<String, Integer>();



	@Test
	void test() {
		List<KorStock047Output> list047 = restWebClient.searchStockInfo047("1001", "3").getOutput();

		for(int i = 0; i < 20; i++){
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
			Thread.sleep(1800000);
			for (int i = 0; i < 20; i++) {
				webSocketClient.unsubscribeWebSocket(list047.get(i).getCode(), ApiWebSocketClient.TR_ID_EXECUTION_PRICE);
				webSocketClient.unsubscribeWebSocket(list047.get(i).getCode(), ApiWebSocketClient.TR_ID_QUOTED_PRICE);
			}
			Thread.sleep(1000);
			webSocketClient.disconnect();
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public HashMap<String, Integer> getStockCodeMap() {
		return stockCodeMap;
	}

	@Test
	public void singcronizedIdWithRowCount(){
		long num1 = stockDefaltRepository.findMaxId();
		System.out.println("MaxID : " + num1);
		stockDefaltRepository.resetAutoIncrement(stockDefaltRepository.findMaxId());
		System.out.println("변환 후 MaxID : " + stockDefaltRepository.findMaxId());

		quotesRepository.resetAutoIncrement(quotesRepository.findMaxId());
		tradesDefaultRepository.resetAutoIncrement(tradesDefaultRepository.findMaxId());
	}
}
