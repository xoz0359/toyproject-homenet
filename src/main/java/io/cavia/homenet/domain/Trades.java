package io.cavia.homenet.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Trades")
public class Trades {

    @Id @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "stock_id", nullable = false)
    private Integer stockId;

    /*// 유가증권 단축 종목코드, 9자리 String
    @Column(name = "mksc_shrn_iscd", length = 9, nullable = false)
    private String mkscShrnIscd; // 유가증권 단축 종목코드*/

  /*  // 주식 체결 시간, 6자리 String (HHMMSS)
    @Column(name = "stck_cntg_hour", length = 6, nullable = false)
    private String stckCntgHour; // 주식 체결 시간*/

    // 주식 현재가 (체결가격)
    @Column(name = "stck_prpr", nullable = false)
    private Integer stckPrpr; // 주식 현재가

    /*
    // 전일 대비 부호 (1: 상한, 2: 상승, 3: 보합, 4: 하한, 5: 하락)
    @Column(name = "prdy_vrss_sign", length = 1, nullable = false)
    private String prdyVrssSign; // 전일 대비 부호


    // 전일 대비 가격
    @Column(name = "prdy_vrss", nullable = false)
    private Integer prdyVrss; // 전일 대비


    // 전일 대비율 (%)
    @Column(name = "prdy_ctrt", precision = 8, scale = 2, nullable = false)
    private BigDecimal prdyCtrt; // 전일 대비율


    // 가중 평균 주식가격
    @Column(name = "wghn_avrg_stck_prc", precision = 8, scale = 2, nullable = false)
    private BigDecimal wghnAvrgStckPrc; // 가중 평균 주식 가격

    // 주식 시가
    @Column(name = "stck_oprc", nullable = false)
    private Integer stckOprc; // 주식 시가

    // 주식 최고가
    @Column(name = "stck_hgpr", nullable = false)
    private Integer stckHgpr; // 주식 최고가

    // 주식 최저가
    @Column(name = "stck_lwpr", nullable = false)
    private Integer stckLwpr; // 주식 최저가
    */
    // 매도호가1
    @Column(name = "askp1", nullable = false)
    private Integer askp1; // 매도호가1

    // 매수호가1
    @Column(name = "bidp1", nullable = false)
    private Integer bidp1; // 매수호가1

    @Column(name = "cntg_vol", nullable = false)
    private Long cntgVol; // 체결 거래량

    /*
    // 누적 거래량
    @Column(name = "acml_vol", nullable = false)
    private Long acmlVol; // 누적 거래량

    // 누적 거래 대금
    @Column(name = "acml_tr_pbmn", nullable = false)
    private Long acmlTrPbmn; // 누적 거래 대금

    // 매도 체결 건수
    @Column(name = "seln_cntg_csnu", nullable = false)
    private Integer selnCntgCsnu; // 매도 체결 건수

    // 매수 체결 건수
    @Column(name = "shnu_cntg_csnu", nullable = false)
    private Integer shnuCntgCsnu; // 매수 체결 건수

    // 순매수 체결 건수
    @Column(name = "ntby_cntg_csnu", nullable = false)
    private Integer ntbyCntgCsnu; // 순매수 체결 건수

    // 체결강도
    @Column(name = "cttr", precision = 8, scale = 2, nullable = false)
    private BigDecimal cttr; // 체결강도

    // 총 매도 수량
    @Column(name = "seln_cntg_smtn", nullable = false)
    private Long selnCntgSmtn; // 총 매도 수량

    // 총 매수 수량
    @Column(name = "shnu_cntg_smtn", nullable = false)
    private Long shnuCntgSmtn; // 총 매수 수량

    // 체결구분 (1: 매수, 3: 장전, 5: 매도)
    @Column(name = "ccld_dvsn", length = 1, nullable = false)
    private String ccldDvsn; // 체결구분

    // 매수비율 (%)
    @Column(name = "shnu_rate", precision = 8, scale = 2, nullable = false)
    private BigDecimal shnuRate; // 매수비율

    // 전일 거래량 대비 등락율
    @Column(name = "prdy_vol_vrss_acml_vol_rate", precision = 8, scale = 2, nullable = false)
    private BigDecimal prdyVolVrssAcmlVolRate; // 전일 거래량 대비 등락율

    // 시가 시간
    @Column(name = "oprc_hour", length = 6, nullable = false)
    private String oprcHour; // 시가 시간

    // 시가대비구분 (1: 상한, 2: 상승, 3: 보합, 4: 하한, 5: 하락)
    @Column(name = "oprc_vrss_prpr_sign", length = 1, nullable = false)
    private String oprcVrssPrprSign; // 시가대비구분

    // 시가대비
    @Column(name = "oprc_vrss_prpr", nullable = false)
    private Integer oprcVrssPrpr; // 시가대비

    // 최고가 시간
    @Column(name = "hgpr_hour", length = 6, nullable = false)
    private String hgprHour; // 최고가 시간

    // 고가대비구분 (1: 상한, 2: 상승, 3: 보합, 4: 하한, 5: 하락)
    @Column(name = "hgpr_vrss_prpr_sign", length = 1, nullable = false)
    private String hgprVrssPrprSign; // 고가대비구분

    // 고가대비
    @Column(name = "hgpr_vrss_prpr", nullable = false)
    private Integer hgprVrssPrpr; // 고가대비

    // 최저가 시간
    @Column(name = "lwpr_hour", length = 6, nullable = false)
    private String lwprHour; // 최저가 시간

    // 저가대비구분 (1: 상한, 2: 상승, 3: 보합, 4: 하한, 5: 하락)
    @Column(name = "lwpr_vrss_prpr_sign", length = 1, nullable = false)
    private String lwprVrssPrprSign; // 저가대비구분

    // 저가대비
    @Column(name = "lwpr_vrss_prpr", nullable = false)
    private Integer lwprVrssPrpr; // 저가대비


    // 영업 일자, 8자리 YYYYMMDD
    @Column(name = "bsop_date", length = 8, nullable = false)
    private String bsopDate; // 영업 일자

    // 신 장운영 구분 코드 (상세 주석은 테이블 참고)
    @Column(name = "new_mkop_cls_code", length = 2, nullable = false)
    private String newMkopClsCode; // 신 장운영 구분 코드

    // 거래정지 여부 (Y: 정지, N: 정상)
    @Column(name = "trht_yn", length = 1, nullable = false)
    private String trhtYn; // 거래정지 여부

    // 매도호가 잔량1
    @Column(name = "askp_rsqn1", nullable = false)
    private Long askpRsqn1; // 매도호가 잔량1

    // 매수호가 잔량1
    @Column(name = "bidp_rsqn1", nullable = false)
    private Long bidpRsqn1; // 매수호가 잔량1

    // 총 매도호가 잔량
    @Column(name = "total_askp_rsqn", nullable = false)
    private Long totalAskpRsqn; // 총 매도호가 잔량

    // 총 매수호가 잔량
    @Column(name = "total_bidp_rsqn", nullable = false)
    private Long totalBidpRsqn; // 총 매수호가 잔량

    // 거래량 회전율
    @Column(name = "vol_tnrt", precision = 8, scale = 2, nullable = false)
    private BigDecimal volTnrt; // 거래량 회전율

    // 전일 동시간 누적 거래량
    @Column(name = "prdy_smns_hour_acml_vol", nullable = false)
    private Long prdySmnsHourAcmlVol; // 전일 동시간 누적 거래량

    // 전일 동시간 누적 거래량 비율
    @Column(name = "prdy_smns_hour_acml_vol_rate", precision = 8, scale = 2, nullable = false)
    private BigDecimal prdySmnsHourAcmlVolRate; // 전일 동시간 누적 거래량 비율

    // 시간 구분 코드 (0: 장중, A: 장후예상 등)
    @Column(name = "hour_cls_code", length = 1, nullable = false)
    private String hourClsCode; // 시간 구분 코드

    // 임의종료구분코드
    @Column(name = "mrkt_trtm_cls_code", length = 1, nullable = false)
    private String mrktTrtmClsCode; // 임의종료구분코드
    */

    // 정적VI발동기준가
    @Column(name = "vi_stnd_prc", nullable = false)
    private Integer viStndPrc; // 정적VI발동기준가

    // 생성시간
    @Column(name = "created_at", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdAt;



    public Trades() {
    }

    public Trades(Integer stockId, Integer stckPrpr, Integer askp1, Integer bidp1, Long cntgVol, Integer viStndPrc, LocalDateTime createdAt) {
        this.stockId = stockId;
        this.stckPrpr = stckPrpr;
        this.askp1 = askp1;
        this.bidp1 = bidp1;
        this.cntgVol = cntgVol;
        this.viStndPrc = viStndPrc;
        this.createdAt = createdAt;
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stocksId) {
        this.stockId = stocksId;
    }

    public Integer getStckPrpr() {
        return stckPrpr;
    }

    public void setStckPrpr(Integer stckPrpr) {
        this.stckPrpr = stckPrpr;
    }

    public Integer getAskp1() {
        return askp1;
    }

    public void setAskp1(Integer askp1) {
        this.askp1 = askp1;
    }

    public Integer getBidp1() {
        return bidp1;
    }

    public void setBidp1(Integer bidp1) {
        this.bidp1 = bidp1;
    }

    public Long getCntgVol() {
        return cntgVol;
    }

    public void setCntgVol(Long cntgVol) {
        this.cntgVol = cntgVol;
    }

    public Integer getViStndPrc() {
        return viStndPrc;
    }

    public void setViStndPrc(Integer viStndPrc) {
        this.viStndPrc = viStndPrc;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "StockRealTime{" +
                "id=" + id +
                ", stockId=" + stockId +
                ", stckPrpr=" + stckPrpr +
                ", viStndPrc=" + viStndPrc +
                ", createdAt=" + createdAt +
                '}';
    }
}


