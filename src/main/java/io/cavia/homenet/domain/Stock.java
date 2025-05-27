package io.cavia.homenet.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "stock")
public class Stock {
    /**
     * 주식 정적 데이터를 담은 테이블 stock입니다.
     * colume 정보
     * id: pk입니다.
     * pdno: 종목코드 입니다.
     * prdt_name: 종목명 입니다.
     * std_idst_clsf_cd_name: 업종코드 입니다.
     * tot_issueStk_qty: 시가총액 입니다. (총 상장 주식 수 * 현재가)
     * list_dt: 상장일 입니다.
     * divi_kind: 배당종류 입니다.
     * divi_rate: 현금배당률 입니다.
     * stk_divi_rate: 주식배당률 입니다.
     * divi_pay_dt: 배당지급일 입니다.
     */
    @Column(name = "id")
    @Id @GeneratedValue
    private Long id;

    // 기본 조회정보
    @Column(name = "pdno")
    private String pdno;
    @Column(name = "prdt_name")
    private String prdtName;
    @Column(name = "std_idst_clsf_cd_name")
    private String stdIdstClsfCdName;

    // 상장정보
    @Column(name = "tot_issue_stk_qty")
    private Long totIssueStkQty;
    @Column(name = "list_dt")
    private Date listDt;

    // 배당정보
    @Column(name = "divi_kind")
    private String diviKind;
    @Column(name = "divi_rate")
    private BigDecimal diviRate;
    @Column(name = "stk_divi_rate")
    private BigDecimal stkDiviRate;
    @Column(name = "divi_pay_dt")
    private Date diviPayDt;

    // 외인, 기관 추정가집계
    @Column(name = "frgn_fake_ntby_qty")
    private Long frgnFakeNtbyQty;
    @Column(name = "orgn_fake_ntby_qty")
    private Long orgnFakeNtbyQty;
    @Column(name = "sum_fake_ntby_qty")
    private Long sumFakeNtbyQty;


    public Stock() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPdno() {
        return pdno;
    }

    public void setPdno(String pdno) {
        this.pdno = pdno;
    }

    public String getPrdtName() {
        return prdtName;
    }

    public void setPrdtName(String prdtName) {
        this.prdtName = prdtName;
    }

    public String getStdIdstClsfCdName() {
        return stdIdstClsfCdName;
    }

    public void setStdIdstClsfCdName(String stdIdstClsfCd) {
        this.stdIdstClsfCdName = stdIdstClsfCd;
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

    public Long getFrgnFakeNtbyQty() {
        return frgnFakeNtbyQty;
    }

    public void setFrgnFakeNtbyQty(Long frgnFakeNtbyQty) {
        this.frgnFakeNtbyQty = frgnFakeNtbyQty;
    }

    public Long getOrgnFakeNtbyQty() {
        return orgnFakeNtbyQty;
    }

    public void setOrgnFakeNtbyQty(Long orgnFakeNtbyQty) {
        this.orgnFakeNtbyQty = orgnFakeNtbyQty;
    }

    public Long getSumFakeNtbyQty() {
        return sumFakeNtbyQty;
    }

    public void setSumFakeNtbyQty(Long sumFakeNtbyQty) {
        this.sumFakeNtbyQty = sumFakeNtbyQty;
    }

}
