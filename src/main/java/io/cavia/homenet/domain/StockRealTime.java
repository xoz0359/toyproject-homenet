package io.cavia.homenet.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "stock_real_time")
public class StockRealTime {

    @Id @GeneratedValue
    @Column(name = "id")
    private Long id;

    // 유가증권 단축 종목코드, 9자리 String
    @Column(name = "mksc_shrn_iscd", length = 9, nullable = false)
    private String mkscShrnIscd; // 유가증권 단축 종목코드

    // 주식 체결 시간, 6자리 String (HHMMSS)
    @Column(name = "stck_cntg_hour", length = 6, nullable = false)
    private String stckCntgHour; // 주식 체결 시간

    // 주식 현재가 (체결가격)
    @Column(name = "stck_prpr", nullable = false)
    private Integer stckPrpr; // 주식 현재가

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

    // 매도호가1
    @Column(name = "askp1", nullable = false)
    private Integer askp1; // 매도호가1

    // 매수호가1
    @Column(name = "bidp1", nullable = false)
    private Integer bidp1; // 매수호가1

    // 체결 거래량
    @Column(name = "cntg_vol", nullable = false)
    private Long cntgVol; // 체결 거래량

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

    // 정적VI발동기준가
    @Column(name = "vi_stnd_prc", nullable = false)
    private Integer viStndPrc; // 정적VI발동기준가


    public StockRealTime() {
    }

    public StockRealTime(String mkscShrnIscd, String stckCntgHour, Integer stckPrpr, String prdyVrssSign, Integer prdyVrss,
                         BigDecimal prdyCtrt, BigDecimal wghnAvrgStckPrc, Integer stckOprc, Integer stckHgpr, Integer stckLwpr,
                         Integer askp1, Integer bidp1, Long cntgVol, Long acmlVol, Long acmlTrPbmn, Integer selnCntgCsnu,
                         Integer shnuCntgCsnu, Integer ntbyCntgCsnu, BigDecimal cttr, Long selnCntgSmtn, Long shnuCntgSmtn,
                         String ccldDvsn, BigDecimal shnuRate, BigDecimal prdyVolVrssAcmlVolRate, String oprcHour,
                         String oprcVrssPrprSign, Integer oprcVrssPrpr, String hgprHour, String hgprVrssPrprSign,
                         Integer hgprVrssPrpr, String lwprHour, String lwprVrssPrprSign, Integer lwprVrssPrpr, String bsopDate,
                         String newMkopClsCode, String trhtYn, Long askpRsqn1, Long bidpRsqn1, Long totalAskpRsqn,
                         Long totalBidpRsqn, BigDecimal volTnrt, Long prdySmnsHourAcmlVol, BigDecimal prdySmnsHourAcmlVolRate,
                         String hourClsCode, String mrktTrtmClsCode, Integer viStndPrc) {

        this.mkscShrnIscd = mkscShrnIscd;
        this.stckCntgHour = stckCntgHour;
        this.stckPrpr = stckPrpr;
        this.prdyVrssSign = prdyVrssSign;
        this.prdyVrss = prdyVrss;
        this.prdyCtrt = prdyCtrt;
        this.wghnAvrgStckPrc = wghnAvrgStckPrc;
        this.stckOprc = stckOprc;
        this.stckHgpr = stckHgpr;
        this.stckLwpr = stckLwpr;
        this.askp1 = askp1;
        this.bidp1 = bidp1;
        this.cntgVol = cntgVol;
        this.acmlVol = acmlVol;
        this.acmlTrPbmn = acmlTrPbmn;
        this.selnCntgCsnu = selnCntgCsnu;
        this.shnuCntgCsnu = shnuCntgCsnu;
        this.ntbyCntgCsnu = ntbyCntgCsnu;
        this.cttr = cttr;
        this.selnCntgSmtn = selnCntgSmtn;
        this.shnuCntgSmtn = shnuCntgSmtn;
        this.ccldDvsn = ccldDvsn;
        this.shnuRate = shnuRate;
        this.prdyVolVrssAcmlVolRate = prdyVolVrssAcmlVolRate;
        this.oprcHour = oprcHour;
        this.oprcVrssPrprSign = oprcVrssPrprSign;
        this.oprcVrssPrpr = oprcVrssPrpr;
        this.hgprHour = hgprHour;
        this.hgprVrssPrprSign = hgprVrssPrprSign;
        this.hgprVrssPrpr = hgprVrssPrpr;
        this.lwprHour = lwprHour;
        this.lwprVrssPrprSign = lwprVrssPrprSign;
        this.lwprVrssPrpr = lwprVrssPrpr;
        this.bsopDate = bsopDate;
        this.newMkopClsCode = newMkopClsCode;
        this.trhtYn = trhtYn;
        this.askpRsqn1 = askpRsqn1;
        this.bidpRsqn1 = bidpRsqn1;
        this.totalAskpRsqn = totalAskpRsqn;
        this.totalBidpRsqn = totalBidpRsqn;
        this.volTnrt = volTnrt;
        this.prdySmnsHourAcmlVol = prdySmnsHourAcmlVol;
        this.prdySmnsHourAcmlVolRate = prdySmnsHourAcmlVolRate;
        this.hourClsCode = hourClsCode;
        this.mrktTrtmClsCode = mrktTrtmClsCode;
        this.viStndPrc = viStndPrc;
    }

    public String getMkscShrnIscd() {
        return mkscShrnIscd;
    }

    public void setMkscShrnIscd(String mkscShrnIscd) {
        this.mkscShrnIscd = mkscShrnIscd;
    }

    public String getStckCntgHour() {
        return stckCntgHour;
    }

    public void setStckCntgHour(String stckCntgHour) {
        this.stckCntgHour = stckCntgHour;
    }

    public Integer getStckPrpr() {
        return stckPrpr;
    }

    public void setStckPrpr(Integer stckPrpr) {
        this.stckPrpr = stckPrpr;
    }

    public String getPrdyVrssSign() {
        return prdyVrssSign;
    }

    public void setPrdyVrssSign(String prdyVrssSign) {
        this.prdyVrssSign = prdyVrssSign;
    }

    public Integer getPrdyVrss() {
        return prdyVrss;
    }

    public void setPrdyVrss(Integer prdyVrss) {
        this.prdyVrss = prdyVrss;
    }

    public BigDecimal getPrdyCtrt() {
        return prdyCtrt;
    }

    public void setPrdyCtrt(BigDecimal prdyCtrt) {
        this.prdyCtrt = prdyCtrt;
    }

    public BigDecimal getWghnAvrgStckPrc() {
        return wghnAvrgStckPrc;
    }

    public void setWghnAvrgStckPrc(BigDecimal wghnAvrgStckPrc) {
        this.wghnAvrgStckPrc = wghnAvrgStckPrc;
    }

    public Integer getStckOprc() {
        return stckOprc;
    }

    public void setStckOprc(Integer stckOprc) {
        this.stckOprc = stckOprc;
    }

    public Integer getStckHgpr() {
        return stckHgpr;
    }

    public void setStckHgpr(Integer stckHgpr) {
        this.stckHgpr = stckHgpr;
    }

    public Integer getStckLwpr() {
        return stckLwpr;
    }

    public void setStckLwpr(Integer stckLwpr) {
        this.stckLwpr = stckLwpr;
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

    public Long getAcmlVol() {
        return acmlVol;
    }

    public void setAcmlVol(Long acmlVol) {
        this.acmlVol = acmlVol;
    }

    public Long getAcmlTrPbmn() {
        return acmlTrPbmn;
    }

    public void setAcmlTrPbmn(Long acmlTrPbmn) {
        this.acmlTrPbmn = acmlTrPbmn;
    }

    public Integer getSelnCntgCsnu() {
        return selnCntgCsnu;
    }

    public void setSelnCntgCsnu(Integer selnCntgCsnu) {
        this.selnCntgCsnu = selnCntgCsnu;
    }

    public Integer getShnuCntgCsnu() {
        return shnuCntgCsnu;
    }

    public void setShnuCntgCsnu(Integer shnuCntgCsnu) {
        this.shnuCntgCsnu = shnuCntgCsnu;
    }

    public Integer getNtbyCntgCsnu() {
        return ntbyCntgCsnu;
    }

    public void setNtbyCntgCsnu(Integer ntbyCntgCsnu) {
        this.ntbyCntgCsnu = ntbyCntgCsnu;
    }

    public BigDecimal getCttr() {
        return cttr;
    }

    public void setCttr(BigDecimal cttr) {
        this.cttr = cttr;
    }

    public Long getSelnCntgSmtn() {
        return selnCntgSmtn;
    }

    public void setSelnCntgSmtn(Long selnCntgSmtn) {
        this.selnCntgSmtn = selnCntgSmtn;
    }

    public Long getShnuCntgSmtn() {
        return shnuCntgSmtn;
    }

    public void setShnuCntgSmtn(Long shnuCntgSmtn) {
        this.shnuCntgSmtn = shnuCntgSmtn;
    }

    public String getCcldDvsn() {
        return ccldDvsn;
    }

    public void setCcldDvsn(String ccldDvsn) {
        this.ccldDvsn = ccldDvsn;
    }

    public BigDecimal getShnuRate() {
        return shnuRate;
    }

    public void setShnuRate(BigDecimal shnuRate) {
        this.shnuRate = shnuRate;
    }

    public BigDecimal getPrdyVolVrssAcmlVolRate() {
        return prdyVolVrssAcmlVolRate;
    }

    public void setPrdyVolVrssAcmlVolRate(BigDecimal prdyVolVrssAcmlVolRate) {
        this.prdyVolVrssAcmlVolRate = prdyVolVrssAcmlVolRate;
    }

    public String getOprcHour() {
        return oprcHour;
    }

    public void setOprcHour(String oprcHour) {
        this.oprcHour = oprcHour;
    }

    public String getOprcVrssPrprSign() {
        return oprcVrssPrprSign;
    }

    public void setOprcVrssPrprSign(String oprcVrssPrprSign) {
        this.oprcVrssPrprSign = oprcVrssPrprSign;
    }

    public Integer getOprcVrssPrpr() {
        return oprcVrssPrpr;
    }

    public void setOprcVrssPrpr(Integer oprcVrssPrpr) {
        this.oprcVrssPrpr = oprcVrssPrpr;
    }

    public String getHgprHour() {
        return hgprHour;
    }

    public void setHgprHour(String hgprHour) {
        this.hgprHour = hgprHour;
    }

    public String getHgprVrssPrprSign() {
        return hgprVrssPrprSign;
    }

    public void setHgprVrssPrprSign(String hgprVrssPrprSign) {
        this.hgprVrssPrprSign = hgprVrssPrprSign;
    }

    public Integer getHgprVrssPrpr() {
        return hgprVrssPrpr;
    }

    public void setHgprVrssPrpr(Integer hgprVrssPrpr) {
        this.hgprVrssPrpr = hgprVrssPrpr;
    }

    public String getLwprHour() {
        return lwprHour;
    }

    public void setLwprHour(String lwprHour) {
        this.lwprHour = lwprHour;
    }

    public String getLwprVrssPrprSign() {
        return lwprVrssPrprSign;
    }

    public void setLwprVrssPrprSign(String lwprVrssPrprSign) {
        this.lwprVrssPrprSign = lwprVrssPrprSign;
    }

    public Integer getLwprVrssPrpr() {
        return lwprVrssPrpr;
    }

    public void setLwprVrssPrpr(Integer lwprVrssPrpr) {
        this.lwprVrssPrpr = lwprVrssPrpr;
    }

    public String getBsopDate() {
        return bsopDate;
    }

    public void setBsopDate(String bsopDate) {
        this.bsopDate = bsopDate;
    }

    public String getNewMkopClsCode() {
        return newMkopClsCode;
    }

    public void setNewMkopClsCode(String newMkopClsCode) {
        this.newMkopClsCode = newMkopClsCode;
    }

    public String getTrhtYn() {
        return trhtYn;
    }

    public void setTrhtYn(String trhtYn) {
        this.trhtYn = trhtYn;
    }

    public Long getAskpRsqn1() {
        return askpRsqn1;
    }

    public void setAskpRsqn1(Long askpRsqn1) {
        this.askpRsqn1 = askpRsqn1;
    }

    public Long getBidpRsqn1() {
        return bidpRsqn1;
    }

    public void setBidpRsqn1(Long bidpRsqn1) {
        this.bidpRsqn1 = bidpRsqn1;
    }

    public Long getTotalAskpRsqn() {
        return totalAskpRsqn;
    }

    public void setTotalAskpRsqn(Long totalAskpRsqn) {
        this.totalAskpRsqn = totalAskpRsqn;
    }

    public Long getTotalBidpRsqn() {
        return totalBidpRsqn;
    }

    public void setTotalBidpRsqn(Long totalBidpRsqn) {
        this.totalBidpRsqn = totalBidpRsqn;
    }

    public BigDecimal getVolTnrt() {
        return volTnrt;
    }

    public void setVolTnrt(BigDecimal volTnrt) {
        this.volTnrt = volTnrt;
    }

    public Long getPrdySmnsHourAcmlVol() {
        return prdySmnsHourAcmlVol;
    }

    public void setPrdySmnsHourAcmlVol(Long prdySmnsHourAcmlVol) {
        this.prdySmnsHourAcmlVol = prdySmnsHourAcmlVol;
    }

    public BigDecimal getPrdySmnsHourAcmlVolRate() {
        return prdySmnsHourAcmlVolRate;
    }

    public void setPrdySmnsHourAcmlVolRate(BigDecimal prdySmnsHourAcmlVolRate) {
        this.prdySmnsHourAcmlVolRate = prdySmnsHourAcmlVolRate;
    }

    public String getHourClsCode() {
        return hourClsCode;
    }

    public void setHourClsCode(String hourClsCode) {
        this.hourClsCode = hourClsCode;
    }

    public String getMrktTrtmClsCode() {
        return mrktTrtmClsCode;
    }

    public void setMrktTrtmClsCode(String mrktTrtmClsCode) {
        this.mrktTrtmClsCode = mrktTrtmClsCode;
    }

    public Integer getViStndPrc() {
        return viStndPrc;
    }

    public void setViStndPrc(Integer viStndPrc) {
        this.viStndPrc = viStndPrc;
    }

    @Override
    public String toString() {
        return "StockRealTime{" +
            "mkscShrnIscd='" + mkscShrnIscd + '\'' +
            ", stckCntgHour='" + stckCntgHour + '\'' +
            ", stckPrpr=" + stckPrpr +
            ", prdyVrssSign='" + prdyVrssSign + '\'' +
            ", prdyVrss=" + prdyVrss +
            ", prdyCtrt=" + prdyCtrt +
            ", wghnAvrgStckPrc=" + wghnAvrgStckPrc +
            ", stckOprc=" + stckOprc +
            ", stckHgpr=" + stckHgpr +
            ", stckLwpr=" + stckLwpr +
            ", askp1=" + askp1 +
            ", bidp1=" + bidp1 +
            ", cntgVol=" + cntgVol +
            ", acmlVol=" + acmlVol +
            ", acmlTrPbmn=" + acmlTrPbmn +
            ", selnCntgCsnu=" + selnCntgCsnu +
            ", shnuCntgCsnu=" + shnuCntgCsnu +
            ", ntbyCntgCsnu=" + ntbyCntgCsnu +
            ", cttr=" + cttr +
            ", selnCntgSmtn=" + selnCntgSmtn +
            ", shnuCntgSmtn=" + shnuCntgSmtn +
            ", ccldDvsn='" + ccldDvsn + '\'' +
            ", shnuRate=" + shnuRate +
            ", prdyVolVrssAcmlVolRate=" + prdyVolVrssAcmlVolRate +
            ", oprcHour='" + oprcHour + '\'' +
            ", oprcVrssPrprSign='" + oprcVrssPrprSign + '\'' +
            ", oprcVrssPrpr=" + oprcVrssPrpr +
            ", hgprHour='" + hgprHour + '\'' +
            ", hgprVrssPrprSign='" + hgprVrssPrprSign + '\'' +
            ", hgprVrssPrpr=" + hgprVrssPrpr +
            ", lwprHour='" + lwprHour + '\'' +
            ", lwprVrssPrprSign='" + lwprVrssPrprSign + '\'' +
            ", lwprVrssPrpr=" + lwprVrssPrpr +
            ", bsopDate='" + bsopDate + '\'' +
            ", newMkopClsCode='" + newMkopClsCode + '\'' +
            ", trhtYn='" + trhtYn + '\'' +
            ", askpRsqn1=" + askpRsqn1 +
            ", bidpRsqn1=" + bidpRsqn1 +
            ", totalAskpRsqn=" + totalAskpRsqn +
            ", totalBidpRsqn=" + totalBidpRsqn +
            ", volTnrt=" + volTnrt +
            ", prdySmnsHourAcmlVol=" + prdySmnsHourAcmlVol +
            ", prdySmnsHourAcmlVolRate=" + prdySmnsHourAcmlVolRate +
            ", hourClsCode='" + hourClsCode + '\'' +
            ", mrktTrtmClsCode='" + mrktTrtmClsCode + '\'' +
            ", viStndPrc=" + viStndPrc +
            '}';
    }
}

