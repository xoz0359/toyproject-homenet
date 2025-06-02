package io.cavia.homenet.service;

import io.cavia.homenet.client.ApiWebSocketClient;
import io.cavia.homenet.client.ApiWebSocketHandler;
import io.cavia.homenet.domain.StockRealTime;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

@Component
public class RealTimeDataCache {

    // @Component 어노테이션 부착시 스프링에서 해당 클래스를 싱글톤 패턴으로 관리하는 것을 이용해서
    // 현재 클래스의 private 변수로 데이터 캐시를 시도해보겠습니다

    // 캐싱 전략
    // 실시간 거래 발생시 발생하는 틱 데이터를 최근 10만개까지만 캐시 공간에 저장
    // 틱 데이터 기준 10만개가 넘어가면 bach 처리 후 db에 새 정보 저장
    // 또는 10만개가 채워지기 전에도 특정 시간마다 스케줄링해서 한 번에 DB에 저장

    // 각 종목 코드를 키로 갖는 ConcurrentHashMap<String, ConcurrentLinkedDeque<StockRealTime>> (Thread-Safe)의 형태로 데이터 캐싱
    // 실시간으로 쓰기 작업과 조회 작업이 동시에 발생하기 때문에 일단은 Thread safe 결성
    // 각 의미 있는 봉 데이터도 위 구조대로 병렬적인 구조로 생성해서 캐싱

    private Map StockRealTime = new ConcurrentHashMap<String, ConcurrentLinkedDeque<StockRealTime>>();
    private Map Stock5Tick = new ConcurrentHashMap<String, ConcurrentLinkedDeque<StockRealTime>>();
    private Map Stock5Min = new ConcurrentHashMap<String, ConcurrentLinkedDeque<StockRealTime>>();
    private Map Stock30Min = new ConcurrentHashMap<String, ConcurrentLinkedDeque<StockRealTime>>();
    private Map Stock1hour = new ConcurrentHashMap<String, ConcurrentLinkedDeque<StockRealTime>>();





    private final ApiWebSocketClient apiWebSocketClient;
    private final ApiWebSocketHandler apiWebSocketHandler;

    public RealTimeDataCache(ApiWebSocketClient apiWebSocketClient, ApiWebSocketHandler apiWebSocketHandler) {
        this.apiWebSocketClient = apiWebSocketClient;
        this.apiWebSocketHandler = apiWebSocketHandler;
    }


}
