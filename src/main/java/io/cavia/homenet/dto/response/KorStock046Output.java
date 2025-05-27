package io.cavia.homenet.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KorStock046Output implements StockDtoOutput {

    @JsonProperty("frgn_fake_ntby_qty")
    private Long frgnFakeNtbyQty;
    @JsonProperty("orgn_fake_ntby_qty")
    private Long orgnFakeNtbyQty;
    @JsonProperty("sum_fake_ntby_qty")
    private Long sumFakeNtbyQty;

    public KorStock046Output() {
    }

    public KorStock046Output(Long frgnFakeNtbyQty, Long orgnFakeNtbyQty, Long sumFakeNtbyQty) {
        this.frgnFakeNtbyQty = frgnFakeNtbyQty;
        this.orgnFakeNtbyQty = orgnFakeNtbyQty;
        this.sumFakeNtbyQty = sumFakeNtbyQty;
    }

    public Long getFrgnFakeNtbyQty() {
        return frgnFakeNtbyQty;
    }

    public void setFrgnFakeNtbyQty(Long frgnFakeNtbyQty) {
        this.frgnFakeNtbyQty = frgnFakeNtbyQty;
    }

    public Long getOrgnFakeNtbyQty() {
        return orgnFakeNtbyQty;
    }

    public void setOrgnFakeNtbyQty(Long orgnFakeNtbyQty) {
        this.orgnFakeNtbyQty = orgnFakeNtbyQty;
    }

    public Long getSumFakeNtbyQty() {
        return sumFakeNtbyQty;
    }

    public void setSumFakeNtbyQty(Long sumFakeNtbyQty) {
        this.sumFakeNtbyQty = sumFakeNtbyQty;
    }

    @Override
    public String toString() {
        return "KorStock046Output{" +
            "frgnFakeNtbyQty='" + frgnFakeNtbyQty + '\'' +
            ", orgnFakeNtbyQty='" + orgnFakeNtbyQty + '\'' +
            ", sumFakeNtbyQty='" + sumFakeNtbyQty + '\'' +
            '}';
    }
}
