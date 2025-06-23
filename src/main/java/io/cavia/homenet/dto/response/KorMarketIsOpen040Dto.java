package io.cavia.homenet.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class KorMarketIsOpen040Dto {

    @JsonProperty("output")
    private List<KorMarketIsOpen040Output> output;

    public KorMarketIsOpen040Dto() {
    }

    public List<KorMarketIsOpen040Output> getOutput() {
        return output;
    }

    public void setOutput(List<KorMarketIsOpen040Output> output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "KorMarketIsOpen040Dto{" +
                "output=" + output +
                '}';
    }
}
