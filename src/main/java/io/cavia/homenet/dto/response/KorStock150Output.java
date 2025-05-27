package io.cavia.homenet.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class KorStock150Output implements StockDtoOutput {

    @JsonProperty("tot_issue_stk_qty")
    private Long totIssueStkQty;
    @JsonProperty("list_dt")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd")
    private Date listDt;

    public KorStock150Output() {
    }

    public KorStock150Output(Long totIssueStkQty, Date listDt) {
        this.totIssueStkQty = totIssueStkQty;
        this.listDt = listDt;
    }

    public Long getTotIssueStkQty() {
        return totIssueStkQty;
    }

    public void setTotIssueStkQty(Long totIssueStkQty) {
        this.totIssueStkQty = totIssueStkQty;
    }

    public Date getListDt() {
        return listDt;
    }

    public void setListDt(Date listDt) {
        this.listDt = listDt;
    }

    @Override
    public String toString() {
        return "KorStock150Output{" +
                "totIssueStkQty='" + totIssueStkQty + '\'' +
                ", listDt='" + listDt + '\'' +
                '}';
    }
}
