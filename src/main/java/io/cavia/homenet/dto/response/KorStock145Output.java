package io.cavia.homenet.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;

public class KorStock145Output implements StockDtoOutput {

    @JsonProperty("divi_kind")
    private String diviKind;
    @JsonProperty("divi_rate")
    private BigDecimal diviRate;
    @JsonProperty("stk_divi_rate")
    private BigDecimal stkDiviRate;
    @JsonProperty("divi_pay_dt")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    private Date diviPayDt;

    public KorStock145Output() {
    }

    public KorStock145Output(String diviKind, BigDecimal diviRate, BigDecimal stkDiviRate, Date diviPayDt) {
        this.diviKind = diviKind;
        this.diviRate = diviRate;
        this.stkDiviRate = stkDiviRate;
        this.diviPayDt = diviPayDt;
    }

    public String getDiviKind() {
        return diviKind;
    }

    public void setDiviKind(String diviKind) {
        this.diviKind = diviKind;
    }

    public BigDecimal getDiviRate() {
        return diviRate;
    }

    public void setDiviRate(BigDecimal diviRate) {
        this.diviRate = diviRate;
    }

    public BigDecimal getStkDiviRate() {
        return stkDiviRate;
    }

    public void setStkDiviRate(BigDecimal stkDiviRate) {
        this.stkDiviRate = stkDiviRate;
    }

    public Date getDiviPayDt() {
        return diviPayDt;
    }

    public void setDiviPayDt(Date diviPayDt) {
        this.diviPayDt = diviPayDt;
    }

    @Override
    public String toString() {
        return "KorStock145Output{" +
                "diviKind='" + diviKind + '\'' +
                ", diviRate='" + diviRate + '\'' +
                ", stkDiviRate='" + stkDiviRate + '\'' +
                ", diviPayDt='" + diviPayDt + '\'' +
                '}';
    }
}
