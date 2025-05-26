package io.cavia.homenet.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class KorStock046Dto {
    /**
     * 종목별 외인기관 추정가집계Dto입니다
     */
    @JsonProperty("output2")
    private List<KorStock046Output> output;
    @JsonProperty("frgn_fake_ntby_qty")
    private String frgnFakeNtbyQty;
    @JsonProperty("orgn_fake_ntby_qty")
    private String orgnFakeNtbyQty;
    @JsonProperty("sum_fake_ntby_qty")
    private String sumFakeNtbyQty;

    public KorStock046Dto() {
    }

    public KorStock046Dto(List<KorStock046Output> output, String frgnFakeNtbyQty, String orgnFakeNtbyQty, String sumFakeNtbyQty) {
        this.output = output;
        this.frgnFakeNtbyQty = frgnFakeNtbyQty;
        this.orgnFakeNtbyQty = orgnFakeNtbyQty;
        this.sumFakeNtbyQty = sumFakeNtbyQty;
    }

    public List<KorStock046Output> getOutput() {
        return output;
    }

    public void setOutput(List<KorStock046Output> output) {
        this.output = output;
    }

    public String getFrgnFakeNtbyQty() {
        return frgnFakeNtbyQty;
    }

    public void setFrgnFakeNtbyQty(String frgnFakeNtbyQty) {
        this.frgnFakeNtbyQty = frgnFakeNtbyQty;
    }

    public String getOrgnFakeNtbyQty() {
        return orgnFakeNtbyQty;
    }

    public void setOrgnFakeNtbyQty(String orgnFakeNtbyQty) {
        this.orgnFakeNtbyQty = orgnFakeNtbyQty;
    }

    public String getSumFakeNtbyQty() {
        return sumFakeNtbyQty;
    }

    public void setSumFakeNtbyQty(String sumFakeNtbyQty) {
        this.sumFakeNtbyQty = sumFakeNtbyQty;
    }

    @Override
    public String toString() {
        return "KorStock046Dto{" +
            "output=" + output +
            ", frgnFakeNtbyQty='" + frgnFakeNtbyQty + '\'' +
            ", orgnFakeNtbyQty='" + orgnFakeNtbyQty + '\'' +
            ", sumFakeNtbyQty='" + sumFakeNtbyQty + '\'' +
            '}';
    }
}
