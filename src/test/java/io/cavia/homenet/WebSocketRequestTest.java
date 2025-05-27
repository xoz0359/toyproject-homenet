package io.cavia.homenet;

import io.cavia.homenet.client.ApiOAuthManager;
import io.cavia.homenet.client.ApiWebSocketClient;
import io.cavia.homenet.client.ApiWebSocketHandler;
import io.cavia.homenet.mapper.KorOrderRealTimeMapper;
import io.cavia.homenet.mapper.KorStockRealTimeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WebSocketRequestTest {

    @Autowired
    private ApiWebSocketHandler apiWebSocketHandler;
    @Autowired
    private KorStockRealTimeMapper korStockRealTimeMapper;
    @Autowired
    private KorOrderRealTimeMapper korOrderRealTimeMapper;
    @Autowired
    private ApiWebSocketClient webSocketClient;


    private String code = "005930";
    public static final String TR_ID_EXECUTION_PRICE = "H0STCNT0";
    public static final String TR_ID_QUOTED_PRICE = "H0STASP0";

    @Test
    public void RequestAndParsingTest() throws InterruptedException {
        String[] codes = "035720, 035900, 068270, 207940, 247540, 293490, 091990, 365340, 278280, 263750, 122870, 041510, 196170, 299900, 052260, 086520, 102710, 067160, 090460, 084850".split(",");


           webSocketClient.connectToWebSocket();
            Thread.sleep(1000);
            for(String code : codes) {
                System.out.println("code: " + code);
                webSocketClient.subscribeWebSocket(code, TR_ID_EXECUTION_PRICE);
                webSocketClient.subscribeWebSocket(code, TR_ID_QUOTED_PRICE);
            }

            Thread.sleep(300000);

            for(String code : codes) {
                webSocketClient.unsubscribeWebSocket(code, TR_ID_EXECUTION_PRICE);
                webSocketClient.unsubscribeWebSocket(code, TR_ID_QUOTED_PRICE);
            }
        Thread.sleep(1000);
            webSocketClient.disconnect();
    }

    @Test
    void webSocketConnection() throws InterruptedException {
        String stockCode = "196170, 247540, 028300, 086520, 277810, 087010, 214450, 145020, 141080, 214150, 298380, 000250, 058470, 041510, 035900, 257720, 263750, 068760, 310210";
        String[] Codes = stockCode.split(", ");
        webSocketClient.connectToWebSocket();
        Thread.sleep(1000);
        for (String code : Codes){
            webSocketClient.subscribeWebSocket(code, ApiWebSocketClient.TR_ID_EXECUTION_PRICE);
            webSocketClient.subscribeWebSocket(code, ApiWebSocketClient.TR_ID_QUOTED_PRICE);
        }
        Thread.sleep(1000 * 1000);
        for (String code : Codes){
            webSocketClient.unsubscribeWebSocket(code, ApiWebSocketClient.TR_ID_EXECUTION_PRICE);
            webSocketClient.unsubscribeWebSocket(code, ApiWebSocketClient.TR_ID_QUOTED_PRICE);
        }
        Thread.sleep(1000);
        webSocketClient.disconnect();
    }

}