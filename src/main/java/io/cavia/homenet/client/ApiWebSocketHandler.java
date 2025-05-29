package io.cavia.homenet.client;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cavia.homenet.domain.ViRealTime;
import io.cavia.homenet.mapper.KorOrderRealTimeMapper;
import io.cavia.homenet.mapper.KorStockRealTimeMapper;
import io.cavia.homenet.repository.OrderRealTimeRepository;
import io.cavia.homenet.repository.StockRealTimeRepository;
import io.cavia.homenet.repository.ViRealTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.stream.IntStream;

public class ApiWebSocketHandler extends TextWebSocketHandler {

    private final ObjectMapper objectMapper = new ObjectMapper();
    @Autowired
    private OrderRealTimeRepository orderRealTimeRepository;
    @Autowired
    private KorOrderRealTimeMapper korOrderRealTimeMapper;
    @Autowired
    private StockRealTimeRepository stockRealTimeRepository;
    @Autowired
    private KorStockRealTimeMapper korStockRealTimeMapper;
    @Autowired
    private ViRealTimeRepository viRealTimeRepository;


    public ApiWebSocketHandler() {
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        // 웹소켓 연결 성공 시 호출됩니다.
        System.out.println("웹소켓 서버에 성공적으로 연결되었습니다. 세션 ID: " + session.getId());
    }

    /**
     * 연결된 웹소켓 세션으로 메시지를 응답받으면 호출되는 메서드
     * PINGPONG 응답처리, JSON 응답처리, 문자열 데이터 처리를 함(체결가 문자열 데이터 등)
     *
     * @param session
     * @param message
     * @throws Exception
     */
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String receivedData = message.getPayload();
        System.out.println("receivedData: " + receivedData);

        if (receivedData.startsWith("{") && receivedData.endsWith("}")) {
            JsonNode rootNode = objectMapper.readTree(receivedData);
            JsonNode headerNode = rootNode.path("header");
            String trId = "";

            if (!headerNode.isMissingNode()) { // "header" 필드가 존재하는지 확인
                trId = headerNode.path("tr_id").asText(); // "tr_id" 값을 텍스트로 가져옵니다. 없으면 빈 문자열.
                System.out.println("추출된 tr_id: " + trId);

                if ("PINGPONG".equals(trId)) {
                    String pong = "pong";
                    session.sendMessage(new TextMessage(pong));
                    System.out.println("서버로 메시지 전송 : " + pong);
                }
            }
            return;
        }
        // TODO 받아온 receivedData 문자열을 분류해서 DB에 저장하는 코드 작성
        String[] datas = receivedData.split("\\^");
        if (datas[0].indexOf("H0STCNT0") != -1) {
            datas[0] = datas[0].substring(datas[0].lastIndexOf("|"));
            if (datas.length % 46 == 0) {
                for (int i = 0; i < datas.length; i += 46) {
                    stockRealTimeRepository.save(korStockRealTimeMapper.toEntity(
                            IntStream.rangeClosed(i, i + 45)
                                    .mapToObj(j -> datas[j])
                                    .toArray(String[]::new)));
                }
            }
        } else if (datas[0].indexOf("H0STASP0") != -1) {
            datas[0] = datas[0].substring(datas[0].lastIndexOf("|"));
            if (datas.length % 59 == 0) {
                for (int i = 0; i < datas.length; i += 59) {
                    orderRealTimeRepository.save(korOrderRealTimeMapper.toEntity(
                            IntStream.rangeClosed(i, i + 58)
                                    .mapToObj(j -> datas[j])
                                    .toArray(String[]::new)));
                }
            } else if (datas[0].indexOf("H0STMKO0") != -1) {
                datas[0] = datas[0].substring(datas[0].lastIndexOf("|"));
                if (datas.length % 11 == 0) {
                    for (int i = 0; i < datas.length; i += 11) {
                        viRealTimeRepository.save(
                                new ViRealTime(
                                        datas[i],
                                        datas[i + 1],
                                        datas[i + 2],
                                        datas[i + 3],
                                        datas[i + 4],
                                        datas[i + 5],
                                        datas[i + 6],
                                        datas[i + 7],
                                        datas[i + 8],
                                        datas[i + 9],
                                        datas[i + 10]
                                ));
                    }
                }
            }
        }
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        // 전송 오류 발생 시 호출됩니다.
        System.err.println("웹소켓 전송 오류 발생: " + exception.getMessage());
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        // 웹소켓 연결 종료 시 호출됩니다.
        System.out.println("웹소켓 연결이 종료되었습니다. 세션 ID: " + session.getId() + ", 상태: " + status);
    }
}
