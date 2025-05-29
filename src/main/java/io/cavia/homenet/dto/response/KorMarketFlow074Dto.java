package io.cavia.homenet.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class KorMarketFlow074Dto {
    /**
     * 시장별 투자자 매매동향(시세)Dto입니다
     */
    @JsonProperty("output")
    private List<KorMarketFlow074Output> output;

    public KorMarketFlow074Dto() {}

    public List<KorMarketFlow074Output> getOutput() {
        return output;
    }

    public void setOutput(List<KorMarketFlow074Output> output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "KorMarketFlow074Dto{" +
                "output=" + output +
                '}';
    }
}
