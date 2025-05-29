package io.cavia.homenet.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;

public class KorMarketFlow075Output {

    @JsonProperty("stck_bsop_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd")
    private Date stckBsopDate;          // 주식 영업 일자

    @JsonProperty("bstp_nmix_prpr")
    private BigDecimal bstpNmixPrpr;          // 업종 지수 현재가

    @JsonProperty("bstp_nmix_prdy_vrss")
    private BigDecimal bstpNmixPrdyVrss;      // 업종 지수 전일 대비

    @JsonProperty("prdy_vrss_sign")
    private String prdyVrssSign;          // 전일 대비 부호

    @JsonProperty("bstp_nmix_prdy_ctrt")
    private BigDecimal bstpNmixPrdyCtrt;      // 업종 지수 전일 대비율

    @JsonProperty("bstp_nmix_oprc")
    private BigDecimal bstpNmixOprc;          // 업종 지수 시가2

    @JsonProperty("bstp_nmix_hgpr")
    private BigDecimal bstpNmixHgpr;          // 업종 지수 최고가

    @JsonProperty("bstp_nmix_lwpr")
    private BigDecimal bstpNmixLwpr;          // 업종 지수 최저가

    @JsonProperty("stck_prdy_clpr")
    private BigDecimal stckPrdyClpr;          // 주식 전일 종가

    @JsonProperty("frgn_ntby_qty")
    private Long frgnNtbyQty;           // 외국인 순매수 수량

    @JsonProperty("frgn_reg_ntby_qty")
    private Long frgnRegNtbyQty;        // 외국인 등록 순매수 수량

    @JsonProperty("frgn_nreg_ntby_qty")
    private Long frgnNregNtbyQty;       // 외국인 비등록 순매수 수량

    @JsonProperty("prsn_ntby_qty")
    private Long prsnNtbyQty;           // 개인 순매수 수량

    @JsonProperty("orgn_ntby_qty")
    private Long orgnNtbyQty;           // 기관계 순매수 수량

    @JsonProperty("scrt_ntby_qty")
    private Long scrtNtbyQty;           // 증권 순매수 수량

    @JsonProperty("ivtr_ntby_qty")
    private Long ivtrNtbyQty;           // 투자신탁 순매수 수량

    @JsonProperty("pe_fund_ntby_vol")
    private Long peFundNtbyVol;         // 사모 펀드 순매수 거래량

    @JsonProperty("bank_ntby_qty")
    private Long bankNtbyQty;           // 은행 순매수 수량

    @JsonProperty("insu_ntby_qty")
    private Long insuNtbyQty;           // 보험 순매수 수량

    @JsonProperty("mrbn_ntby_qty")
    private Long mrbnNtbyQty;           // 종금 순매수 수량

    @JsonProperty("fund_ntby_qty")
    private Long fundNtbyQty;           // 기금 순매수 수량

    @JsonProperty("etc_ntby_qty")
    private Long etcNtbyQty;            // 기타 순매수 수량

    @JsonProperty("etc_orgt_ntby_vol")
    private Long etcOrgtNtbyVol;        // 기타 단체 순매수 거래량

    @JsonProperty("etc_corp_ntby_vol")
    private Long etcCorpNtbyVol;        // 기타 법인 순매수 거래량

    @JsonProperty("frgn_ntby_tr_pbmn")
    private Long frgnNtbyTrPbmn;        // 외국인 순매수 거래 대금

    @JsonProperty("frgn_reg_ntby_pbmn")
    private Long frgnRegNtbyPbmn;       // 외국인 등록 순매수 대금

    @JsonProperty("frgn_nreg_ntby_pbmn")
    private Long frgnNregNtbyPbmn;      // 외국인 비등록 순매수 대금

    @JsonProperty("prsn_ntby_tr_pbmn")
    private Long prsnNtbyTrPbmn;        // 개인 순매수 거래 대금

    @JsonProperty("orgn_ntby_tr_pbmn")
    private Long orgnNtbyTrPbmn;        // 기관계 순매수 거래 대금

    @JsonProperty("scrt_ntby_tr_pbmn")
    private Long scrtNtbyTrPbmn;        // 증권 순매수 거래 대금

    @JsonProperty("ivtr_ntby_tr_pbmn")
    private Long ivtrNtbyTrPbmn;        // 투자신탁 순매수 거래 대금

    @JsonProperty("pe_fund_ntby_tr_pbmn")
    private Long peFundNtbyTrPbmn;      // 사모 펀드 순매수 거래 대금

    @JsonProperty("bank_ntby_tr_pbmn")
    private Long bankNtbyTrPbmn;        // 은행 순매수 거래 대금

    @JsonProperty("insu_ntby_tr_pbmn")
    private Long insuNtbyTrPbmn;        // 보험 순매수 거래 대금

    @JsonProperty("mrbn_ntby_tr_pbmn")
    private Long mrbnNtbyTrPbmn;        // 종금 순매수 거래 대금

    @JsonProperty("fund_ntby_tr_pbmn")
    private Long fundNtbyTrPbmn;        // 기금 순매수 거래 대금

    @JsonProperty("etc_ntby_tr_pbmn")
    private Long etcNtbyTrPbmn;         // 기타 순매수 거래 대금

    @JsonProperty("etc_orgt_ntby_tr_pbmn")
    private Long etcOrgtNtbyTrPbmn;     // 기타 단체 순매수 거래 대금

    @JsonProperty("etc_corp_ntby_tr_pbmn")
    private Long etcCorpNtbyTrPbmn;

    public KorMarketFlow075Output() {
    }

    public Date getStckBsopDate() {
        return stckBsopDate;
    }

    public void setStckBsopDate(Date stckBsopDate) {
        this.stckBsopDate = stckBsopDate;
    }

    public BigDecimal getBstpNmixPrpr() {
        return bstpNmixPrpr;
    }

    public void setBstpNmixPrpr(BigDecimal bstpNmixPrpr) {
        this.bstpNmixPrpr = bstpNmixPrpr;
    }

    public BigDecimal getBstpNmixPrdyVrss() {
        return bstpNmixPrdyVrss;
    }

    public void setBstpNmixPrdyVrss(BigDecimal bstpNmixPrdyVrss) {
        this.bstpNmixPrdyVrss = bstpNmixPrdyVrss;
    }

    public String getPrdyVrssSign() {
        return prdyVrssSign;
    }

    public void setPrdyVrssSign(String prdyVrssSign) {
        this.prdyVrssSign = prdyVrssSign;
    }

    public BigDecimal getBstpNmixPrdyCtrt() {
        return bstpNmixPrdyCtrt;
    }

    public void setBstpNmixPrdyCtrt(BigDecimal bstpNmixPrdyCtrt) {
        this.bstpNmixPrdyCtrt = bstpNmixPrdyCtrt;
    }

    public BigDecimal getBstpNmixOprc() {
        return bstpNmixOprc;
    }

    public void setBstpNmixOprc(BigDecimal bstpNmixOprc) {
        this.bstpNmixOprc = bstpNmixOprc;
    }

    public BigDecimal getBstpNmixHgpr() {
        return bstpNmixHgpr;
    }

    public void setBstpNmixHgpr(BigDecimal bstpNmixHgpr) {
        this.bstpNmixHgpr = bstpNmixHgpr;
    }

    public BigDecimal getBstpNmixLwpr() {
        return bstpNmixLwpr;
    }

    public void setBstpNmixLwpr(BigDecimal bstpNmixLwpr) {
        this.bstpNmixLwpr = bstpNmixLwpr;
    }

    public BigDecimal getStckPrdyClpr() {
        return stckPrdyClpr;
    }

    public void setStckPrdyClpr(BigDecimal stckPrdyClpr) {
        this.stckPrdyClpr = stckPrdyClpr;
    }

    public Long getFrgnNtbyQty() {
        return frgnNtbyQty;
    }

    public void setFrgnNtbyQty(Long frgnNtbyQty) {
        this.frgnNtbyQty = frgnNtbyQty;
    }

    public Long getFrgnRegNtbyQty() {
        return frgnRegNtbyQty;
    }

    public void setFrgnRegNtbyQty(Long frgnRegNtbyQty) {
        this.frgnRegNtbyQty = frgnRegNtbyQty;
    }

    public Long getFrgnNregNtbyQty() {
        return frgnNregNtbyQty;
    }

    public void setFrgnNregNtbyQty(Long frgnNregNtbyQty) {
        this.frgnNregNtbyQty = frgnNregNtbyQty;
    }

    public Long getPrsnNtbyQty() {
        return prsnNtbyQty;
    }

    public void setPrsnNtbyQty(Long prsnNtbyQty) {
        this.prsnNtbyQty = prsnNtbyQty;
    }

    public Long getOrgnNtbyQty() {
        return orgnNtbyQty;
    }

    public void setOrgnNtbyQty(Long orgnNtbyQty) {
        this.orgnNtbyQty = orgnNtbyQty;
    }

    public Long getScrtNtbyQty() {
        return scrtNtbyQty;
    }

    public void setScrtNtbyQty(Long scrtNtbyQty) {
        this.scrtNtbyQty = scrtNtbyQty;
    }

    public Long getIvtrNtbyQty() {
        return ivtrNtbyQty;
    }

    public void setIvtrNtbyQty(Long ivtrNtbyQty) {
        this.ivtrNtbyQty = ivtrNtbyQty;
    }

    public Long getPeFundNtbyVol() {
        return peFundNtbyVol;
    }

    public void setPeFundNtbyVol(Long peFundNtbyVol) {
        this.peFundNtbyVol = peFundNtbyVol;
    }

    public Long getBankNtbyQty() {
        return bankNtbyQty;
    }

    public void setBankNtbyQty(Long bankNtbyQty) {
        this.bankNtbyQty = bankNtbyQty;
    }

    public Long getInsuNtbyQty() {
        return insuNtbyQty;
    }

    public void setInsuNtbyQty(Long insuNtbyQty) {
        this.insuNtbyQty = insuNtbyQty;
    }

    public Long getMrbnNtbyQty() {
        return mrbnNtbyQty;
    }

    public void setMrbnNtbyQty(Long mrbnNtbyQty) {
        this.mrbnNtbyQty = mrbnNtbyQty;
    }

    public Long getFundNtbyQty() {
        return fundNtbyQty;
    }

    public void setFundNtbyQty(Long fundNtbyQty) {
        this.fundNtbyQty = fundNtbyQty;
    }

    public Long getEtcNtbyQty() {
        return etcNtbyQty;
    }

    public void setEtcNtbyQty(Long etcNtbyQty) {
        this.etcNtbyQty = etcNtbyQty;
    }

    public Long getEtcOrgtNtbyVol() {
        return etcOrgtNtbyVol;
    }

    public void setEtcOrgtNtbyVol(Long etcOrgtNtbyVol) {
        this.etcOrgtNtbyVol = etcOrgtNtbyVol;
    }

    public Long getEtcCorpNtbyVol() {
        return etcCorpNtbyVol;
    }

    public void setEtcCorpNtbyVol(Long etcCorpNtbyVol) {
        this.etcCorpNtbyVol = etcCorpNtbyVol;
    }

    public Long getFrgnNtbyTrPbmn() {
        return frgnNtbyTrPbmn;
    }

    public void setFrgnNtbyTrPbmn(Long frgnNtbyTrPbmn) {
        this.frgnNtbyTrPbmn = frgnNtbyTrPbmn;
    }

    public Long getFrgnRegNtbyPbmn() {
        return frgnRegNtbyPbmn;
    }

    public void setFrgnRegNtbyPbmn(Long frgnRegNtbyPbmn) {
        this.frgnRegNtbyPbmn = frgnRegNtbyPbmn;
    }

    public Long getFrgnNregNtbyPbmn() {
        return frgnNregNtbyPbmn;
    }

    public void setFrgnNregNtbyPbmn(Long frgnNregNtbyPbmn) {
        this.frgnNregNtbyPbmn = frgnNregNtbyPbmn;
    }

    public Long getPrsnNtbyTrPbmn() {
        return prsnNtbyTrPbmn;
    }

    public void setPrsnNtbyTrPbmn(Long prsnNtbyTrPbmn) {
        this.prsnNtbyTrPbmn = prsnNtbyTrPbmn;
    }

    public Long getOrgnNtbyTrPbmn() {
        return orgnNtbyTrPbmn;
    }

    public void setOrgnNtbyTrPbmn(Long orgnNtbyTrPbmn) {
        this.orgnNtbyTrPbmn = orgnNtbyTrPbmn;
    }

    public Long getScrtNtbyTrPbmn() {
        return scrtNtbyTrPbmn;
    }

    public void setScrtNtbyTrPbmn(Long scrtNtbyTrPbmn) {
        this.scrtNtbyTrPbmn = scrtNtbyTrPbmn;
    }

    public Long getIvtrNtbyTrPbmn() {
        return ivtrNtbyTrPbmn;
    }

    public void setIvtrNtbyTrPbmn(Long ivtrNtbyTrPbmn) {
        this.ivtrNtbyTrPbmn = ivtrNtbyTrPbmn;
    }

    public Long getPeFundNtbyTrPbmn() {
        return peFundNtbyTrPbmn;
    }

    public void setPeFundNtbyTrPbmn(Long peFundNtbyTrPbmn) {
        this.peFundNtbyTrPbmn = peFundNtbyTrPbmn;
    }

    public Long getBankNtbyTrPbmn() {
        return bankNtbyTrPbmn;
    }

    public void setBankNtbyTrPbmn(Long bankNtbyTrPbmn) {
        this.bankNtbyTrPbmn = bankNtbyTrPbmn;
    }

    public Long getInsuNtbyTrPbmn() {
        return insuNtbyTrPbmn;
    }

    public void setInsuNtbyTrPbmn(Long insuNtbyTrPbmn) {
        this.insuNtbyTrPbmn = insuNtbyTrPbmn;
    }

    public Long getMrbnNtbyTrPbmn() {
        return mrbnNtbyTrPbmn;
    }

    public void setMrbnNtbyTrPbmn(Long mrbnNtbyTrPbmn) {
        this.mrbnNtbyTrPbmn = mrbnNtbyTrPbmn;
    }

    public Long getFundNtbyTrPbmn() {
        return fundNtbyTrPbmn;
    }

    public void setFundNtbyTrPbmn(Long fundNtbyTrPbmn) {
        this.fundNtbyTrPbmn = fundNtbyTrPbmn;
    }

    public Long getEtcNtbyTrPbmn() {
        return etcNtbyTrPbmn;
    }

    public void setEtcNtbyTrPbmn(Long etcNtbyTrPbmn) {
        this.etcNtbyTrPbmn = etcNtbyTrPbmn;
    }

    public Long getEtcOrgtNtbyTrPbmn() {
        return etcOrgtNtbyTrPbmn;
    }

    public void setEtcOrgtNtbyTrPbmn(Long etcOrgtNtbyTrPbmn) {
        this.etcOrgtNtbyTrPbmn = etcOrgtNtbyTrPbmn;
    }

    public Long getEtcCorpNtbyTrPbmn() {
        return etcCorpNtbyTrPbmn;
    }

    public void setEtcCorpNtbyTrPbmn(Long etcCorpNtbyTrPbmn) {
        this.etcCorpNtbyTrPbmn = etcCorpNtbyTrPbmn;
    }

    @Override
    public String toString() {
        return "KorMarketFlow075Output{" +
                "stckBsopDate=" + stckBsopDate +
                ", bstpNmixPrpr=" + bstpNmixPrpr +
                ", bstpNmixPrdyVrss=" + bstpNmixPrdyVrss +
                ", prdyVrssSign='" + prdyVrssSign + '\'' +
                ", bstpNmixPrdyCtrt=" + bstpNmixPrdyCtrt +
                ", bstpNmixOprc=" + bstpNmixOprc +
                ", bstpNmixHgpr=" + bstpNmixHgpr +
                ", bstpNmixLwpr=" + bstpNmixLwpr +
                ", stckPrdyClpr=" + stckPrdyClpr +
                ", frgnNtbyQty=" + frgnNtbyQty +
                ", frgnRegNtbyQty=" + frgnRegNtbyQty +
                ", frgnNregNtbyQty=" + frgnNregNtbyQty +
                ", prsnNtbyQty=" + prsnNtbyQty +
                ", orgnNtbyQty=" + orgnNtbyQty +
                ", scrtNtbyQty=" + scrtNtbyQty +
                ", ivtrNtbyQty=" + ivtrNtbyQty +
                ", peFundNtbyVol=" + peFundNtbyVol +
                ", bankNtbyQty=" + bankNtbyQty +
                ", insuNtbyQty=" + insuNtbyQty +
                ", mrbnNtbyQty=" + mrbnNtbyQty +
                ", fundNtbyQty=" + fundNtbyQty +
                ", etcNtbyQty=" + etcNtbyQty +
                ", etcOrgtNtbyVol=" + etcOrgtNtbyVol +
                ", etcCorpNtbyVol=" + etcCorpNtbyVol +
                ", frgnNtbyTrPbmn=" + frgnNtbyTrPbmn +
                ", frgnRegNtbyPbmn=" + frgnRegNtbyPbmn +
                ", frgnNregNtbyPbmn=" + frgnNregNtbyPbmn +
                ", prsnNtbyTrPbmn=" + prsnNtbyTrPbmn +
                ", orgnNtbyTrPbmn=" + orgnNtbyTrPbmn +
                ", scrtNtbyTrPbmn=" + scrtNtbyTrPbmn +
                ", ivtrNtbyTrPbmn=" + ivtrNtbyTrPbmn +
                ", peFundNtbyTrPbmn=" + peFundNtbyTrPbmn +
                ", bankNtbyTrPbmn=" + bankNtbyTrPbmn +
                ", insuNtbyTrPbmn=" + insuNtbyTrPbmn +
                ", mrbnNtbyTrPbmn=" + mrbnNtbyTrPbmn +
                ", fundNtbyTrPbmn=" + fundNtbyTrPbmn +
                ", etcNtbyTrPbmn=" + etcNtbyTrPbmn +
                ", etcOrgtNtbyTrPbmn=" + etcOrgtNtbyTrPbmn +
                ", etcCorpNtbyTrPbmn=" + etcCorpNtbyTrPbmn +
                '}';
    }
}
