package io.cavia.homenet.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KorStock047Output {

    @JsonProperty("hts_kor_isnm")
    private String name;

    @JsonProperty("mksc_shrn_iscd")
    private String code;

    public KorStock047Output() {
    }

    public KorStock047Output(String htsKorIsnm, String code) {
        this.name = htsKorIsnm;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }



}
