package io.cavia.homenet.dto.response;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class KorIndustry065Output implements StockDtoOutput {

    @JsonProperty("bstp_nmix_prpr")
    private BigDecimal bstpNmixPrpr;

    public KorIndustry065Output() {
    }

    public BigDecimal getBstpNmixPrpr() {
        return bstpNmixPrpr;
    }

    public void setBstpNmixPrpr(BigDecimal bstpNmixPrpr) {
        this.bstpNmixPrpr = bstpNmixPrpr;
    }

    @Override
    public String toString() {
        return "KorIndustry065Output{" + "bstpNmixPrpr=" + bstpNmixPrpr + '}';
    }
}
