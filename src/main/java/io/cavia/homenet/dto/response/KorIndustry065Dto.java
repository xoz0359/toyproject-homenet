package io.cavia.homenet.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KorIndustry065Dto {
    /**
     * 국내업종 일자별 지수Dto입니다
     */
    @JsonProperty("output1")
    private KorIndustry065Output output;


    public KorIndustry065Dto() {
    }

    public KorIndustry065Output getOutput() {
        return output;
    }

    public void setOutput(KorIndustry065Output output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "KorIndustry065Dto{" +
                "output=" + output +
                '}';
    }
}
