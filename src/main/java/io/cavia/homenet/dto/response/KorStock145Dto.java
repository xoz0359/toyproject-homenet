package io.cavia.homenet.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class KorStock145Dto {
    /**
     * 예탁원정보(배당일정)Dto입니다
     * diviKind: 배당종류
     * diviRate: 현금배당률
     * stkdiviRate: 주식배당률
     * divi_pay_dt: 배당지급일
     */
    @JsonProperty("output1")
    private List<KorStock145Output> output;

    public KorStock145Dto() {
    }

    public KorStock145Dto(List<KorStock145Output> output) {
        this.output = output;
    }

    public List<KorStock145Output> getOutput() {
        return output;
    }

    public void setOutput(List<KorStock145Output> output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "KorStock145Dto{" +
                "output=" + output +
                '}';
    }
}
