package io.cavia.homenet.dto.response;

public class KorIndeustry065Output implements StockDtoOutput {

    private String bstpNmixPrpr;

    public KorIndeustry065Output() {
    }

    public KorIndeustry065Output(String bstpNmixPrpr) {
        this.bstpNmixPrpr = bstpNmixPrpr;
    }

    public String getBstpNmixPrpr() {
        return bstpNmixPrpr;
    }

    public void setBstpNmixPrpr(String bstpNmixPrpr) {
        this.bstpNmixPrpr = bstpNmixPrpr;
    }
}
