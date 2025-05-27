package io.cavia.homenet.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class KorStock150Dto {
    /**
     * 예탁원정보(상장정보일정)Dto입니다
     */
    @JsonProperty("output1")
    private List<KorStock150Output> output;


    public KorStock150Dto() {
    }

    public KorStock150Dto(List<KorStock150Output> output) {
        this.output = output;

    }

    public List<KorStock150Output> getOutput() {
        return output;
    }

    public void setOutput(List<KorStock150Output> output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "KorStock150Dto{" +
                "output=" + output +
                '}';
    }
}
