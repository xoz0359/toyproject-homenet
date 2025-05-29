package io.cavia.homenet.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class KorIndustry063Output implements StockDtoOutput {

    @JsonProperty("bstp_nmix_prpr")
    private BigDecimal bstpNmixPrpr;
    @JsonProperty("bstp_nmix_prdy_vrss")
    private BigDecimal bstpNmixPrdyVrss;
    @JsonProperty("prdy_vrss_sign")
    private String PrdyVrssSign;
    @JsonProperty("bstp_nmix_prdy_ctrt")
    private BigDecimal bstpNmixPrdyCtrt;

    public KorIndustry063Output() {
    }

    public BigDecimal getBstpNmixPrpr() {
        return bstpNmixPrpr;
    }

    public void setBstpNmixPrpr(BigDecimal bstpNmixPrpr) {
        this.bstpNmixPrpr = bstpNmixPrpr;
    }

    public BigDecimal getBstpNmixPrdyVrss() {
        return bstpNmixPrdyVrss;
    }

    public void setBstpNmixPrdyVrss(BigDecimal bstpNmixPrdyVrss) {
        this.bstpNmixPrdyVrss = bstpNmixPrdyVrss;
    }

    public String getPrdyVrssSign() {
        return PrdyVrssSign;
    }

    public void setPrdyVrssSign(String prdyVrssSign) {
        PrdyVrssSign = prdyVrssSign;
    }

    public BigDecimal getBstpNmixPrdyCtrt() {
        return bstpNmixPrdyCtrt;
    }

    public void setBstpNmixPrdyCtrt(BigDecimal bstpNmixPrdyCtrt) {
        this.bstpNmixPrdyCtrt = bstpNmixPrdyCtrt;
    }

    @Override
    public String toString() {
        return "KorIndustry063Output{" +
                "bstpNmixPrpr=" + bstpNmixPrpr +
                ", bstpNmixPrdyVrss=" + bstpNmixPrdyVrss +
                ", PrdyVrssSign='" + PrdyVrssSign + '\'' +
                ", bstpNmixPrdyCtrt=" + bstpNmixPrdyCtrt +
                '}';
    }
}
