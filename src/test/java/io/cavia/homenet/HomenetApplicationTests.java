package io.cavia.homenet;

import io.cavia.homenet.client.ApiWebSocketClient;
import io.cavia.homenet.client.ApiWebSocketHandler;
import io.cavia.homenet.client.RestWebClient;
import io.cavia.homenet.domain.Stock;
import io.cavia.homenet.dto.response.KorStock047Output;
import io.cavia.homenet.mapper.KorOrderRealTimeMapper;
import io.cavia.homenet.mapper.KorStockRealTimeMapper;
import io.cavia.homenet.mapper.KorStockRestRequestMapper;
import io.cavia.homenet.repository.StockDefaltRepository;
import io.cavia.homenet.repository.VStockDefaltRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;

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
	private KorStockRealTimeMapper korStockRealTimeMapper;
	@Autowired
	private KorOrderRealTimeMapper korOrderRealTimeMapper;
	@Autowired
	private RestWebClient restWebClient;
	@Autowired
	private VStockDefaltRepository stockDefaltRepository;
	@Autowired
	private KorStockRestRequestMapper korStockRestRequestMapper;
	@Autowired
	private ApiWebSocketClient apiWebSocketClient;

	private HashMap<String, Long> stockCodeMap = new HashMap<>();



	@Transactional
	@Test
	void test() {
		List<KorStock047Output> list047 = restWebClient.searchStockInfo047("1001", "3").getOutput();

		for(int i = 0; i < 20; i++){
			System.out.println(list047.get(i));
			stockDefaltRepository.save(korStockRestRequestMapper.toStock(list047.get(i), LocalDateTime.now()));
			stockDefaltRepository.findAllByOrderByCreatedAtDesc(PageRequest.of(0, 20))
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

	public HashMap<String, Long> getStockCodeMap() {
		return stockCodeMap;
	}
}
