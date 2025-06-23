package io.cavia.homenet.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KorMarketIsOpen040Output {

    @JsonProperty("opnd_yn")
    private String open;

    public KorMarketIsOpen040Output() {
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    @Override
    public String toString() {
        return "KorMarketIsOpen040Output{" +
                "open='" + open + '\'' +
                '}';
    }
}
