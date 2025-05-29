package io.cavia.homenet.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KorIndustry063Dto {
    /**
     * 국내업종 현재 지수Dto입니다
     */
    @JsonProperty("output")
    private KorIndustry063Output output;

    public KorIndustry063Dto() {
    }

    public KorIndustry063Output getOutput() {
        return output;
    }

    public void setOutput(KorIndustry063Output output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "KorIndustry063Dto{" +
            "output=" + output +
            '}';
    }
}
