package io.cavia.homenet.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class KorStock047Dto {

    private List<KorStock047Output> output;

    public KorStock047Dto() {
    }

    public KorStock047Dto(List<KorStock047Output> output) {
        this.output = output;
    }

    public List<KorStock047Output> getOutput() {
        return output;
    }

    public void setOutput(List<KorStock047Output> output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "KorStock047Dto{" +
                "output=" + output +
                '}';
    }
}
