package io.cavia.homenet.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KorStock213Output1 implements StockDtoOutput {

    @JsonProperty("stck_prdy_clqr")
    private String stckPrdyClqr;
    @JsonProperty("stck_prpr")
    private String stckPrpr;
    @JsonProperty("stck_hgpr")
    private String stckHgpr;
    @JsonProperty("acml_vol")
    private String acmlVol;

    public KorStock213Output1() {
    }

    public KorStock213Output1(String stckPrdyClqr, String stckPrpr, String stckHgpr, String acml_vol) {
        this.stckPrdyClqr = stckPrdyClqr;
        this.stckPrpr = stckPrpr;
        this.stckHgpr = stckHgpr;
        this.acmlVol = acml_vol;
    }

    public String getStckPrdyClqr() {
        return stckPrdyClqr;
    }

    public void setStckPrdyClqr(String stckPrdyClqr) {
        this.stckPrdyClqr = stckPrdyClqr;
    }

    public String getStckPrpr() {
        return stckPrpr;
    }

    public void setStckPrpr(String stckPrpr) {
        this.stckPrpr = stckPrpr;
    }

    public String getStckHgpr() {
        return stckHgpr;
    }

    public void setStckHgpr(String stckHgpr) {
        this.stckHgpr = stckHgpr;
    }

    public String getAcmlVol() {
        return acmlVol;
    }

    public void setAcmlVol(String acmlVol) {
        this.acmlVol = acmlVol;
    }
}
