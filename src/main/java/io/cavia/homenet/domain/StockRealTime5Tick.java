package io.cavia.homenet.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class StockRealTime5Tick {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    // 유가증권 단축 종목코드, 9자리 String
    @Column(name = "mksc_shrn_iscd", length = 9, nullable = false)
    private String mkscShrnIscd; // 유가증권 단축 종목코드

    // 주식 현재가 (체결가격)
    @Column(name = "stck_prpr", nullable = false)
    private Integer stckPrpr; // 주식 현재가

    // 체결 거래량
    @Column(name = "cntg_vol", nullable = false)
    private Long cntgVol; // 체결 거래량

    // 주식 체결 시간, 6자리 String (HHMMSS)
    @Column(name = "stck_cntg_hour", length = 6, nullable = false)
    private String stckCntgHour; // 주식 체결 시간

    // 정적VI발동기준가
    @Column(name = "vi_stnd_prc", nullable = false)
    private Integer viStndPrc; // 정적VI발동기준가

}
