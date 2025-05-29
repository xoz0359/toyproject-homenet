package io.cavia.homenet.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class KorMarketFlow075Dto {

    /**
     * 시장별 투자자 매매동향(일자)Dto입니다
     */
    @JsonProperty("output")
    private List<KorMarketFlow075Output> output;

    public KorMarketFlow075Dto() {
    }

    public List<KorMarketFlow075Output> getOutput() {
        return output;
    }

    public void setOutput(List<KorMarketFlow075Output> output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "KorMarketFlow075Dto{" +
                "output=" + output +
                '}';
    }
}
