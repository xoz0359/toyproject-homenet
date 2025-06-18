package io.cavia.homenet.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cavia.homenet.domain.OrderRealTime;
import io.cavia.homenet.domain.StockRealTime;
import io.cavia.homenet.repository.OrderRealTimeRepository;
import io.cavia.homenet.repository.StockRealTimeRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

@Component
public class CaviaWebSocketHandler extends TextWebSocketHandler {

    private final StockRealTimeRepository stockRealTimeRepository;

    private final OrderRealTimeRepository orderRealTimeRepository;

    private final ObjectMapper objectMapper;

    // thread 처리를 위해 CopyOnWriteArraySet을 사용합니다
    // 해당 컬렉션은 데이터의 수정, 추가가 이루어질 때 기존 배열을 통째로 읽어와서
    // 수정된 배열로 교체하기 때문에
    // 수정 중인 배열을 다른 thread에서 읽거나 수정해도 영향을 받지 않습니다
    // 이는 모든 thread가 불변 상태의 배열 주소를 참조하고 수정이 일어날 때 배열의 주소를 새로 생성하여 작동하기 때문입니다
    // 이로 인해 CopyOnWriteArraySet은 Thread safe를 보장합니다
    private static final Set<WebSocketSession> sessions = new CopyOnWriteArraySet<>();

    public CaviaWebSocketHandler(StockRealTimeRepository stockRealTimeRepository, OrderRealTimeRepository orderRealTimeRepository, ObjectMapper objectMapper) {
        this.stockRealTimeRepository = stockRealTimeRepository;
        this.orderRealTimeRepository = orderRealTimeRepository;
        this.objectMapper = objectMapper;
    }

    // HTTP 연결이 시작될 때 콜백 메서드
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        sessions.add(session);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        sessions.remove(session);
    }

    // 메세지가 전송될 때 콜백 메서드
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) {
        // 클라이언트 메시지 처리 (echo, broadcast, 기타 로직 등)
        String payload = message.getPayload();
        List<StockRealTime> SRTs = stockRealTimeRepository.findByStockId(Long.parseLong(payload));
        List<OrderRealTime> ORTs = orderRealTimeRepository.findByStockId(Long.parseLong(payload));
        try {
            List<Long> stockBaseTime = new ArrayList<Long>();
                stockBaseTime.add(SRTs
                    .get(0)
                    .getCreatedAt()
                    .atZone(ZoneId.systemDefault())
                    .toInstant()
                    .toEpochMilli()
                );

            Thread thread1 = new Thread(() -> {
                SRTs.forEach(srt -> {
                    try{
                        if (!session.isOpen()) return;
                        long relTime = srt
                                .getCreatedAt()
                                .atZone(ZoneId.systemDefault())
                                .toInstant()
                                .toEpochMilli();

                        long timeDifference = relTime - stockBaseTime.get(0);
                        stockBaseTime.set(0, relTime);
                        Thread.sleep(timeDifference);






                        String SRTJson = objectMapper.writeValueAsString(srt);
                        // 메시지 전송 부분 동기화
                        synchronized (session) {
                            session.sendMessage(new TextMessage(SRTJson));
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                });
            });


            List<Long> orderBaseTime = new ArrayList<Long>();
            orderBaseTime.add(ORTs
                    .get(0)
                    .getCreatedAt()
                    .atZone(ZoneId.systemDefault())
                    .toInstant()
                    .toEpochMilli()
            );

            Thread thread2 = new Thread(() -> {
                ORTs.forEach(ort -> {
                    try {
                        if (!session.isOpen()) return;
                        long relTime = ort
                                .getCreatedAt()
                                .atZone(ZoneId.systemDefault())
                                .toInstant()
                                .toEpochMilli();

                        long timeDifference = relTime - orderBaseTime.get(0);
                        orderBaseTime.set(0, relTime);
                        Thread.sleep(timeDifference);;

                        String ORTJson = objectMapper.writeValueAsString(ort);

                        // 메시지 전송 부분 동기화
                        synchronized (session) {
                            session.sendMessage(new TextMessage(ORTJson));
                        }

                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                });

            });
                thread1.start();
                thread2.start();
        }catch (Exception e3){
            e3.printStackTrace();
        }
        // 세션 종료하기
        // 세션 종료 요청 메세지 감지시 session.close()를 호출
        // afterConnectionClosed가 콜백되고 세션 종료됨

        // 헤더 정보에 접근하기
        // session.getHandshakeHeaders()
        // 세션의 접속자 정보를 Map으로 반환
        // Map의 key는 String으로 접근 키를 표현하고, value는 List로 접근 키의 값들을 표현합니다
        // 헤더 정보는 여러 개의 값을 가질 수 있으므로 List로 반환됩니다

        // 인증 토큰 가져오기
        // String authHeader = session.getHandshakeHeaders().getFirst("Authorization");

        // 세션의 접속자 ID를 가져오기
        // session.getId()
        // 세션의 접속자 ID를 반환합니다

    }


    // 브로드캐스트는 사용 계획이 없어서 일단은 미구현


}
