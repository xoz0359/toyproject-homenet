package io.cavia.homenet.dto.response;

public class KorStock213Output2 implements StockDtoOutput {
    private String stckPrdyClqr;

    public KorStock213Output2() {
    }

    public KorStock213Output2(String stckPrdyClqr) {
        this.stckPrdyClqr = stckPrdyClqr;
    }

    public String getStckPrdyClqr() {
        return stckPrdyClqr;
    }

    public void setStckPrdyClqr(String stckPrdyClqr) {
        this.stckPrdyClqr = stckPrdyClqr;
    }
}
