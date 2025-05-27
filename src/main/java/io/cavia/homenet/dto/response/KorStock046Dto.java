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
    private Long frgnFakeNtbyQty;
    @JsonProperty("orgn_fake_ntby_qty")
    private Long orgnFakeNtbyQty;
    @JsonProperty("sum_fake_ntby_qty")
    private Long sumFakeNtbyQty;

    public KorStock046Dto() {
    }

    public KorStock046Dto(List<KorStock046Output> output, Long frgnFakeNtbyQty, Long orgnFakeNtbyQty, Long sumFakeNtbyQty) {
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
        return "KorStock046Dto{" +
            "output=" + output +
            ", frgnFakeNtbyQty='" + frgnFakeNtbyQty + '\'' +
            ", orgnFakeNtbyQty='" + orgnFakeNtbyQty + '\'' +
            ", sumFakeNtbyQty='" + sumFakeNtbyQty + '\'' +
            '}';
    }
}
