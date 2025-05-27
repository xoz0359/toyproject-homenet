package io.cavia.homenet.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class KorStock213Output1 implements StockDtoOutput {

    @JsonProperty("prdy_vrss")
    private Integer prdyVrss;

    @JsonProperty("prdy_vrss_sign")
    private Integer prdyVrssSign;

    @JsonProperty("prdy_ctrt")
    private BigDecimal prdyCtrt;

    @JsonProperty("stck_prdy_clpr")
    private Integer stckPrdyClpr;

    @JsonProperty("acml_vol")
    private Long acmlVol;

    @JsonProperty("acml_tr_pbmn")
    private Long acmlTrPbmn;

    @JsonProperty("hts_kor_isnm")
    private String htsKorIsnm;

    @JsonProperty("stck_prpr")
    private Integer stckPrpr;

    public KorStock213Output1() {}

    public Integer getPrdyVrss() {
        return prdyVrss;
    }

    public void setPrdyVrss(Integer prdyVrss) {
        this.prdyVrss = prdyVrss;
    }

    public Integer getPrdyVrssSign() {
        return prdyVrssSign;
    }

    public void setPrdyVrssSign(Integer prdyVrssSign) {
        this.prdyVrssSign = prdyVrssSign;
    }

    public BigDecimal getPrdyCtrt() {
        return prdyCtrt;
    }

    public void setPrdyCtrt(BigDecimal prdyCtrt) {
        this.prdyCtrt = prdyCtrt;
    }

    public Integer getStckPrdyClpr() {
        return stckPrdyClpr;
    }

    public void setStckPrdyClpr(Integer stckPrdyClpr) {
        this.stckPrdyClpr = stckPrdyClpr;
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

    public String getHtsKorIsnm() {
        return htsKorIsnm;
    }

    public void setHtsKorIsnm(String htsKorIsnm) {
        this.htsKorIsnm = htsKorIsnm;
    }

    public Integer getStckPrpr() {
        return stckPrpr;
    }

    public void setStckPrpr(Integer stckPrpr) {
        this.stckPrpr = stckPrpr;
    }

    @Override
    public String toString() {
        return "KorStock213Output1{" +
                "prdyVrss=" + prdyVrss +
                ", prdyVrssSign=" + prdyVrssSign +
                ", prdyCtrt=" + prdyCtrt +
                ", stckPrdyClpr=" + stckPrdyClpr +
                ", acmlVol=" + acmlVol +
                ", acmlTrPbmn=" + acmlTrPbmn +
                ", htsKorIsnm='" + htsKorIsnm + '\'' +
                ", stckPrpr=" + stckPrpr +
                '}';
    }
}
