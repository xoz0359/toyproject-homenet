package io.cavia.homenet.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class KorStock213Output2 implements StockDtoOutput {
    /**
     * 마지막 컬럼의 세터가 작동하면 내부적으로 문자열을 조합해 LocalDateTime객체를 선언합니다
     */
    @JsonProperty("stck_bsop_date")
    private String stckBsopDate;

    @JsonProperty("stck_cntg_hour")
    private String stckCntgHour;

    private LocalDateTime stckCntgDt;

    @JsonProperty("stck_prpr")
    private Integer stckPrpr;

    @JsonProperty("stck_oprc")
    private Integer stckOprc;

    @JsonProperty("stck_hgpr")
    private Integer stckHgpr;

    @JsonProperty("stck_lwpr")
    private Integer stckLwpr;

    @JsonProperty("cntg_vol")
    private Long cntgVol;

    @JsonProperty("acml_vol")
    private Long acmlVol;

    @JsonProperty("acml_tr_pbmn")
    private Long acmlTrPbmn;

    public KorStock213Output2() {
    }

    public String getStckBsopDate() {
        return stckBsopDate;
    }

    public void setStckBsopDate(String stckBsopDate) {
        this.stckBsopDate = stckBsopDate;
    }

    public String getStckCntgHour() {
        return stckCntgHour;
    }

    public void setStckCntgHour(String stckCntgHour) {
        this.stckCntgHour = stckCntgHour;
    }

    public LocalDateTime getStckCntgDt() {
        return stckCntgDt;
    }

    public void setStckCntgDt() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        this.stckCntgDt = LocalDateTime.parse(this.stckBsopDate + this.stckCntgHour, formatter);
    }

    public Integer getStckPrpr() {
        return stckPrpr;
    }

    public void setStckPrpr(Integer stckPrpr) {
        this.stckPrpr = stckPrpr;
    }

    public Integer getStckOprc() {
        return stckOprc;
    }

    public void setStckOprc(Integer stckOprc) {
        this.stckOprc = stckOprc;
    }

    public Integer getStckHgpr() {
        return stckHgpr;
    }

    public void setStckHgpr(Integer stckHgpr) {
        this.stckHgpr = stckHgpr;
    }

    public Integer getStckLwpr() {
        return stckLwpr;
    }

    public void setStckLwpr(Integer stckLwpr) {
        this.stckLwpr = stckLwpr;
    }

    public Long getCntgVol() {
        return cntgVol;
    }

    public void setCntgVol(Long cntgVol) {
        this.cntgVol = cntgVol;
    }

    public Long getAcmlVol() {
        return acmlVol;
    }

    public void setAcmlVol(Long acmlVol) {
        this.acmlVol = acmlVol;
    }

    public Long getAcmlTrPbmn() {
        return acmlTrPbmn;
    }

    public void setAcmlTrPbmn(Long acmlTrPbmn) {
        this.acmlTrPbmn = acmlTrPbmn;
        setStckCntgDt();
    }

    @Override
    public String toString() {
        return "KorStock213Output2{" +
                "stckBsopDate=" + stckBsopDate +
                ", stckCntgHour='" + stckCntgHour + '\'' +
                ", stckCntgDt=" + stckCntgDt +
                ", stckPrpr=" + stckPrpr +
                ", stckOprc=" + stckOprc +
                ", stckHgpr=" + stckHgpr +
                ", stckLwpr=" + stckLwpr +
                ", cntgVol=" + cntgVol +
                ", acmlVol=" + acmlVol +
                ", acmlTrPbmn=" + acmlTrPbmn +
                '}';
    }
}
