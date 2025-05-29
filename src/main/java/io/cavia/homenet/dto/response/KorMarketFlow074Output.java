package io.cavia.homenet.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KorMarketFlow074Output implements StockDtoOutput {
    
    @JsonProperty("frgn_seln_vol")
    private Long frgnSelnVol;  // 외국인 매도 거래량

    @JsonProperty("frgn_shnu_vol")
    private Long frgnShnuVol;  // 외국인 매수2 거래량

    @JsonProperty("frgn_ntby_qty")
    private Long frgnNtbyQty;  // 외국인 순매수 수량

    @JsonProperty("frgn_seln_tr_pbmn")
    private Long frgnSelnTrPbmn;  // 외국인 매도 거래 대금

    @JsonProperty("frgn_shnu_tr_pbmn")
    private Long frgnShnuTrPbmn;  // 외국인 매수2 거래 대금

    @JsonProperty("frgn_ntby_tr_pbmn")
    private Long frgnNtbyTrPbmn;  // 외국인 순매수 거래 대금

    // ------ 개인 ------
    @JsonProperty("prsn_seln_vol")
    private Long prsnSelnVol;  // 개인 매도 거래량

    @JsonProperty("prsn_shnu_vol")
    private Long prsnShnuVol;  // 개인 매수2 거래량

    @JsonProperty("prsn_ntby_qty")
    private Long prsnNtbyQty;  // 개인 순매수 수량

    @JsonProperty("prsn_seln_tr_pbmn")
    private Long prsnSelnTrPbmn;  // 개인 매도 거래 대금

    @JsonProperty("prsn_shnu_tr_pbmn")
    private Long prsnShnuTrPbmn;  // 개인 매수2 거래 대금

    @JsonProperty("prsn_ntby_tr_pbmn")
    private Long prsnNtbyTrPbmn;  // 개인 순매수 거래 대금

    // ------ 기관 ------
    @JsonProperty("orgn_seln_vol")
    private Long orgnSelnVol;  // 기관계 매도 거래량

    @JsonProperty("orgn_shnu_vol")
    private Long orgnShnuVol;  // 기관계 매수2 거래량

    @JsonProperty("orgn_ntby_qty")
    private Long orgnNtbyQty;  // 기관계 순매수 수량

    @JsonProperty("orgn_seln_tr_pbmn")
    private Long orgnSelnTrPbmn;  // 기관계 매도 거래 대금

    @JsonProperty("orgn_shnu_tr_pbmn")
    private Long orgnShnuTrPbmn;  // 기관계 매수2 거래 대금

    @JsonProperty("orgn_ntby_tr_pbmn")
    private Long orgnNtbyTrPbmn;  // 기관계 순매수 거래 대금

    // ------ 증권 ------
    @JsonProperty("scrt_seln_vol")
    private Long scrtSelnVol;  // 증권 매도 거래량

    @JsonProperty("scrt_shnu_vol")
    private Long scrtShnuVol;  // 증권 매수2 거래량

    @JsonProperty("scrt_ntby_qty")
    private Long scrtNtbyQty;  // 증권 순매수 수량

    @JsonProperty("scrt_seln_tr_pbmn")
    private Long scrtSelnTrPbmn;  // 증권 매도 거래 대금

    @JsonProperty("scrt_shnu_tr_pbmn")
    private Long scrtShnuTrPbmn;  // 증권 매수2 거래 대금

    @JsonProperty("scrt_ntby_tr_pbmn")
    private Long scrtNtbyTrPbmn;  // 증권 순매수 거래 대금

    // ------ 투자신탁 ------
    @JsonProperty("ivtr_seln_vol")
    private Long ivtrSelnVol;  // 투자신탁 매도 거래량

    @JsonProperty("ivtr_shnu_vol")
    private Long ivtrShnuVol;  // 투자신탁 매수2 거래량

    @JsonProperty("ivtr_ntby_qty")
    private Long ivtrNtbyQty;  // 투자신탁 순매수 수량

    @JsonProperty("ivtr_seln_tr_pbmn")
    private Long ivtrSelnTrPbmn;  // 투자신탁 매도 거래 대금

    @JsonProperty("ivtr_shnu_tr_pbmn")
    private Long ivtrShnuTrPbmn;  // 투자신탁 매수2 거래 대금

    @JsonProperty("ivtr_ntby_tr_pbmn")
    private Long ivtrNtbyTrPbmn;  // 투자신탁 순매수 거래 대금

    // ------ 사모 펀드 ------
    @JsonProperty("pe_fund_seln_vol")
    private Long peFundSelnVol;  // 사모 펀드 매도 거래량

    @JsonProperty("pe_fund_shnu_vol")
    private Long peFundShnuVol;  // 사모 펀드 매수2 거래량

    @JsonProperty("pe_fund_ntby_vol")
    private Long peFundNtbyVol;  // 사모 펀드 순매수 거래량

    @JsonProperty("pe_fund_seln_tr_pbmn")
    private Long peFundSelnTrPbmn; // 사모 펀드 매도 거래 대금

    @JsonProperty("pe_fund_shnu_tr_pbmn")
    private Long peFundShnuTrPbmn; // 사모 펀드 매수2 거래 대금

    @JsonProperty("pe_fund_ntby_tr_pbmn")
    private Long peFundNtbyTrPbmn; // 사모 펀드 순매수 거래 대금

    // ------ 은행 ------
    @JsonProperty("bank_seln_vol")
    private Long bankSelnVol;  // 은행 매도 거래량

    @JsonProperty("bank_shnu_vol")
    private Long bankShnuVol;  // 은행 매수2 거래량

    @JsonProperty("bank_ntby_qty")
    private Long bankNtbyQty;  // 은행 순매수 수량

    @JsonProperty("bank_seln_tr_pbmn")
    private Long bankSelnTrPbmn; // 은행 매도 거래 대금

    @JsonProperty("bank_shnu_tr_pbmn")
    private Long bankShnuTrPbmn; // 은행 매수2 거래 대금

    @JsonProperty("bank_ntby_tr_pbmn")
    private Long bankNtbyTrPbmn; // 은행 순매수 거래 대금

    // ------ 보험 ------
    @JsonProperty("insu_seln_vol")
    private Long insuSelnVol;  // 보험 매도 거래량

    @JsonProperty("insu_shnu_vol")
    private Long insuShnuVol;  // 보험 매수2 거래량

    @JsonProperty("insu_ntby_qty")
    private Long insuNtbyQty;  // 보험 순매수 수량

    @JsonProperty("insu_seln_tr_pbmn")
    private Long insuSelnTrPbmn;  // 보험 매도 거래 대금

    @JsonProperty("insu_shnu_tr_pbmn")
    private Long insuShnuTrPbmn;  // 보험 매수2 거래 대금

    @JsonProperty("insu_ntby_tr_pbmn")
    private Long insuNtbyTrPbmn;  // 보험 순매수 거래 대금

    // ------ 종금 ------
    @JsonProperty("mrbn_seln_vol")
    private Long mrbnSelnVol;  // 종금 매도 거래량

    @JsonProperty("mrbn_shnu_vol")
    private Long mrbnShnuVol;  // 종금 매수2 거래량

    @JsonProperty("mrbn_ntby_qty")
    private Long mrbnNtbyQty;  // 종금 순매수 수량

    @JsonProperty("mrbn_seln_tr_pbmn")
    private Long mrbnSelnTrPbmn; // 종금 매도 거래 대금

    @JsonProperty("mrbn_shnu_tr_pbmn")
    private Long mrbnShnuTrPbmn; // 종금 매수2 거래 대금

    @JsonProperty("mrbn_ntby_tr_pbmn")
    private Long mrbnNtbyTrPbmn; // 종금 순매수 거래 대금

    // ------ 기금 ------
    @JsonProperty("fund_seln_vol")
    private Long fundSelnVol;  // 기금 매도 거래량

    @JsonProperty("fund_shnu_vol")
    private Long fundShnuVol;  // 기금 매수2 거래량

    @JsonProperty("fund_ntby_qty")
    private Long fundNtbyQty;  // 기금 순매수 수량

    @JsonProperty("fund_seln_tr_pbmn")
    private Long fundSelnTrPbmn; // 기금 매도 거래 대금

    @JsonProperty("fund_shnu_tr_pbmn")
    private Long fundShnuTrPbmn; // 기금 매수2 거래 대금

    @JsonProperty("fund_ntby_tr_pbmn")
    private Long fundNtbyTrPbmn; // 기금 순매수 거래 대금

    // ------ 기타 단체 ------
    @JsonProperty("etc_orgt_seln_vol")
    private Long etcOrgtSelnVol;  // 기타 단체 매도 거래량

    @JsonProperty("etc_orgt_shnu_vol")
    private Long etcOrgtShnuVol;  // 기타 단체 매수2 거래량

    @JsonProperty("etc_orgt_ntby_vol")
    private Long etcOrgtNtbyVol; // 기타 단체 순매수 거래량

    @JsonProperty("etc_orgt_seln_tr_pbmn")
    private Long etcOrgtSelnTrPbmn; // 기타 단체 매도 거래 대금

    @JsonProperty("etc_orgt_shnu_tr_pbmn")
    private Long etcOrgtShnuTrPbmn; // 기타 단체 매수2 거래 대금

    @JsonProperty("etc_orgt_ntby_tr_pbmn")
    private Long etcOrgtNtbyTrPbmn; // 기타 단체 순매수 거래 대금

    // ------ 기타 법인 ------
    @JsonProperty("etc_corp_seln_vol")
    private Long etcCorpSelnVol;   // 기타 법인 매도 거래량

    @JsonProperty("etc_corp_shnu_vol")
    private Long etcCorpShnuVol;   // 기타 법인 매수2 거래량

    @JsonProperty("etc_corp_ntby_vol")
    private Long etcCorpNtbyVol;   // 기타 법인 순매수 거래량

    @JsonProperty("etc_corp_seln_tr_pbmn")
    private Long etcCorpSelnTrPbmn;   // 기타 법인 매도 거래 대금

    @JsonProperty("etc_corp_shnu_tr_pbmn")
    private Long etcCorpShnuTrPbmn;   // 기타 법인 매수2 거래 대금

    @JsonProperty("etc_corp_ntby_tr_pbmn")
    private Long etcCorpNtbyTrPbmn;
    
    public KorMarketFlow074Output() {
    }

    public Long getFrgnSelnVol() {
        return frgnSelnVol;
    }

    public void setFrgnSelnVol(Long frgnSelnVol) {
        this.frgnSelnVol = frgnSelnVol;
    }

    public Long getFrgnShnuVol() {
        return frgnShnuVol;
    }

    public void setFrgnShnuVol(Long frgnShnuVol) {
        this.frgnShnuVol = frgnShnuVol;
    }

    public Long getFrgnNtbyQty() {
        return frgnNtbyQty;
    }

    public void setFrgnNtbyQty(Long frgnNtbyQty) {
        this.frgnNtbyQty = frgnNtbyQty;
    }

    public Long getFrgnSelnTrPbmn() {
        return frgnSelnTrPbmn;
    }

    public void setFrgnSelnTrPbmn(Long frgnSelnTrPbmn) {
        this.frgnSelnTrPbmn = frgnSelnTrPbmn;
    }

    public Long getFrgnShnuTrPbmn() {
        return frgnShnuTrPbmn;
    }

    public void setFrgnShnuTrPbmn(Long frgnShnuTrPbmn) {
        this.frgnShnuTrPbmn = frgnShnuTrPbmn;
    }

    public Long getFrgnNtbyTrPbmn() {
        return frgnNtbyTrPbmn;
    }

    public void setFrgnNtbyTrPbmn(Long frgnNtbyTrPbmn) {
        this.frgnNtbyTrPbmn = frgnNtbyTrPbmn;
    }

    public Long getPrsnSelnVol() {
        return prsnSelnVol;
    }

    public void setPrsnSelnVol(Long prsnSelnVol) {
        this.prsnSelnVol = prsnSelnVol;
    }

    public Long getPrsnShnuVol() {
        return prsnShnuVol;
    }

    public void setPrsnShnuVol(Long prsnShnuVol) {
        this.prsnShnuVol = prsnShnuVol;
    }

    public Long getPrsnNtbyQty() {
        return prsnNtbyQty;
    }

    public void setPrsnNtbyQty(Long prsnNtbyQty) {
        this.prsnNtbyQty = prsnNtbyQty;
    }

    public Long getPrsnSelnTrPbmn() {
        return prsnSelnTrPbmn;
    }

    public void setPrsnSelnTrPbmn(Long prsnSelnTrPbmn) {
        this.prsnSelnTrPbmn = prsnSelnTrPbmn;
    }

    public Long getPrsnShnuTrPbmn() {
        return prsnShnuTrPbmn;
    }

    public void setPrsnShnuTrPbmn(Long prsnShnuTrPbmn) {
        this.prsnShnuTrPbmn = prsnShnuTrPbmn;
    }

    public Long getPrsnNtbyTrPbmn() {
        return prsnNtbyTrPbmn;
    }

    public void setPrsnNtbyTrPbmn(Long prsnNtbyTrPbmn) {
        this.prsnNtbyTrPbmn = prsnNtbyTrPbmn;
    }

    public Long getOrgnSelnVol() {
        return orgnSelnVol;
    }

    public void setOrgnSelnVol(Long orgnSelnVol) {
        this.orgnSelnVol = orgnSelnVol;
    }

    public Long getOrgnShnuVol() {
        return orgnShnuVol;
    }

    public void setOrgnShnuVol(Long orgnShnuVol) {
        this.orgnShnuVol = orgnShnuVol;
    }

    public Long getOrgnNtbyQty() {
        return orgnNtbyQty;
    }

    public void setOrgnNtbyQty(Long orgnNtbyQty) {
        this.orgnNtbyQty = orgnNtbyQty;
    }

    public Long getOrgnSelnTrPbmn() {
        return orgnSelnTrPbmn;
    }

    public void setOrgnSelnTrPbmn(Long orgnSelnTrPbmn) {
        this.orgnSelnTrPbmn = orgnSelnTrPbmn;
    }

    public Long getOrgnShnuTrPbmn() {
        return orgnShnuTrPbmn;
    }

    public void setOrgnShnuTrPbmn(Long orgnShnuTrPbmn) {
        this.orgnShnuTrPbmn = orgnShnuTrPbmn;
    }

    public Long getOrgnNtbyTrPbmn() {
        return orgnNtbyTrPbmn;
    }

    public void setOrgnNtbyTrPbmn(Long orgnNtbyTrPbmn) {
        this.orgnNtbyTrPbmn = orgnNtbyTrPbmn;
    }

    public Long getScrtSelnVol() {
        return scrtSelnVol;
    }

    public void setScrtSelnVol(Long scrtSelnVol) {
        this.scrtSelnVol = scrtSelnVol;
    }

    public Long getScrtShnuVol() {
        return scrtShnuVol;
    }

    public void setScrtShnuVol(Long scrtShnuVol) {
        this.scrtShnuVol = scrtShnuVol;
    }

    public Long getScrtNtbyQty() {
        return scrtNtbyQty;
    }

    public void setScrtNtbyQty(Long scrtNtbyQty) {
        this.scrtNtbyQty = scrtNtbyQty;
    }

    public Long getScrtSelnTrPbmn() {
        return scrtSelnTrPbmn;
    }

    public void setScrtSelnTrPbmn(Long scrtSelnTrPbmn) {
        this.scrtSelnTrPbmn = scrtSelnTrPbmn;
    }

    public Long getScrtShnuTrPbmn() {
        return scrtShnuTrPbmn;
    }

    public void setScrtShnuTrPbmn(Long scrtShnuTrPbmn) {
        this.scrtShnuTrPbmn = scrtShnuTrPbmn;
    }

    public Long getScrtNtbyTrPbmn() {
        return scrtNtbyTrPbmn;
    }

    public void setScrtNtbyTrPbmn(Long scrtNtbyTrPbmn) {
        this.scrtNtbyTrPbmn = scrtNtbyTrPbmn;
    }

    public Long getIvtrSelnVol() {
        return ivtrSelnVol;
    }

    public void setIvtrSelnVol(Long ivtrSelnVol) {
        this.ivtrSelnVol = ivtrSelnVol;
    }

    public Long getIvtrShnuVol() {
        return ivtrShnuVol;
    }

    public void setIvtrShnuVol(Long ivtrShnuVol) {
        this.ivtrShnuVol = ivtrShnuVol;
    }

    public Long getIvtrNtbyQty() {
        return ivtrNtbyQty;
    }

    public void setIvtrNtbyQty(Long ivtrNtbyQty) {
        this.ivtrNtbyQty = ivtrNtbyQty;
    }

    public Long getIvtrSelnTrPbmn() {
        return ivtrSelnTrPbmn;
    }

    public void setIvtrSelnTrPbmn(Long ivtrSelnTrPbmn) {
        this.ivtrSelnTrPbmn = ivtrSelnTrPbmn;
    }

    public Long getIvtrShnuTrPbmn() {
        return ivtrShnuTrPbmn;
    }

    public void setIvtrShnuTrPbmn(Long ivtrShnuTrPbmn) {
        this.ivtrShnuTrPbmn = ivtrShnuTrPbmn;
    }

    public Long getIvtrNtbyTrPbmn() {
        return ivtrNtbyTrPbmn;
    }

    public void setIvtrNtbyTrPbmn(Long ivtrNtbyTrPbmn) {
        this.ivtrNtbyTrPbmn = ivtrNtbyTrPbmn;
    }

    public Long getPeFundSelnVol() {
        return peFundSelnVol;
    }

    public void setPeFundSelnVol(Long peFundSelnVol) {
        this.peFundSelnVol = peFundSelnVol;
    }

    public Long getPeFundShnuVol() {
        return peFundShnuVol;
    }

    public void setPeFundShnuVol(Long peFundShnuVol) {
        this.peFundShnuVol = peFundShnuVol;
    }

    public Long getPeFundNtbyVol() {
        return peFundNtbyVol;
    }

    public void setPeFundNtbyVol(Long peFundNtbyVol) {
        this.peFundNtbyVol = peFundNtbyVol;
    }

    public Long getPeFundSelnTrPbmn() {
        return peFundSelnTrPbmn;
    }

    public void setPeFundSelnTrPbmn(Long peFundSelnTrPbmn) {
        this.peFundSelnTrPbmn = peFundSelnTrPbmn;
    }

    public Long getPeFundShnuTrPbmn() {
        return peFundShnuTrPbmn;
    }

    public void setPeFundShnuTrPbmn(Long peFundShnuTrPbmn) {
        this.peFundShnuTrPbmn = peFundShnuTrPbmn;
    }

    public Long getPeFundNtbyTrPbmn() {
        return peFundNtbyTrPbmn;
    }

    public void setPeFundNtbyTrPbmn(Long peFundNtbyTrPbmn) {
        this.peFundNtbyTrPbmn = peFundNtbyTrPbmn;
    }

    public Long getBankSelnVol() {
        return bankSelnVol;
    }

    public void setBankSelnVol(Long bankSelnVol) {
        this.bankSelnVol = bankSelnVol;
    }

    public Long getBankShnuVol() {
        return bankShnuVol;
    }

    public void setBankShnuVol(Long bankShnuVol) {
        this.bankShnuVol = bankShnuVol;
    }

    public Long getBankNtbyQty() {
        return bankNtbyQty;
    }

    public void setBankNtbyQty(Long bankNtbyQty) {
        this.bankNtbyQty = bankNtbyQty;
    }

    public Long getBankSelnTrPbmn() {
        return bankSelnTrPbmn;
    }

    public void setBankSelnTrPbmn(Long bankSelnTrPbmn) {
        this.bankSelnTrPbmn = bankSelnTrPbmn;
    }

    public Long getBankShnuTrPbmn() {
        return bankShnuTrPbmn;
    }

    public void setBankShnuTrPbmn(Long bankShnuTrPbmn) {
        this.bankShnuTrPbmn = bankShnuTrPbmn;
    }

    public Long getBankNtbyTrPbmn() {
        return bankNtbyTrPbmn;
    }

    public void setBankNtbyTrPbmn(Long bankNtbyTrPbmn) {
        this.bankNtbyTrPbmn = bankNtbyTrPbmn;
    }

    public Long getInsuSelnVol() {
        return insuSelnVol;
    }

    public void setInsuSelnVol(Long insuSelnVol) {
        this.insuSelnVol = insuSelnVol;
    }

    public Long getInsuShnuVol() {
        return insuShnuVol;
    }

    public void setInsuShnuVol(Long insuShnuVol) {
        this.insuShnuVol = insuShnuVol;
    }

    public Long getInsuNtbyQty() {
        return insuNtbyQty;
    }

    public void setInsuNtbyQty(Long insuNtbyQty) {
        this.insuNtbyQty = insuNtbyQty;
    }

    public Long getInsuSelnTrPbmn() {
        return insuSelnTrPbmn;
    }

    public void setInsuSelnTrPbmn(Long insuSelnTrPbmn) {
        this.insuSelnTrPbmn = insuSelnTrPbmn;
    }

    public Long getInsuShnuTrPbmn() {
        return insuShnuTrPbmn;
    }

    public void setInsuShnuTrPbmn(Long insuShnuTrPbmn) {
        this.insuShnuTrPbmn = insuShnuTrPbmn;
    }

    public Long getInsuNtbyTrPbmn() {
        return insuNtbyTrPbmn;
    }

    public void setInsuNtbyTrPbmn(Long insuNtbyTrPbmn) {
        this.insuNtbyTrPbmn = insuNtbyTrPbmn;
    }

    public Long getMrbnSelnVol() {
        return mrbnSelnVol;
    }

    public void setMrbnSelnVol(Long mrbnSelnVol) {
        this.mrbnSelnVol = mrbnSelnVol;
    }

    public Long getMrbnShnuVol() {
        return mrbnShnuVol;
    }

    public void setMrbnShnuVol(Long mrbnShnuVol) {
        this.mrbnShnuVol = mrbnShnuVol;
    }

    public Long getMrbnNtbyQty() {
        return mrbnNtbyQty;
    }

    public void setMrbnNtbyQty(Long mrbnNtbyQty) {
        this.mrbnNtbyQty = mrbnNtbyQty;
    }

    public Long getMrbnSelnTrPbmn() {
        return mrbnSelnTrPbmn;
    }

    public void setMrbnSelnTrPbmn(Long mrbnSelnTrPbmn) {
        this.mrbnSelnTrPbmn = mrbnSelnTrPbmn;
    }

    public Long getMrbnShnuTrPbmn() {
        return mrbnShnuTrPbmn;
    }

    public void setMrbnShnuTrPbmn(Long mrbnShnuTrPbmn) {
        this.mrbnShnuTrPbmn = mrbnShnuTrPbmn;
    }

    public Long getMrbnNtbyTrPbmn() {
        return mrbnNtbyTrPbmn;
    }

    public void setMrbnNtbyTrPbmn(Long mrbnNtbyTrPbmn) {
        this.mrbnNtbyTrPbmn = mrbnNtbyTrPbmn;
    }

    public Long getFundSelnVol() {
        return fundSelnVol;
    }

    public void setFundSelnVol(Long fundSelnVol) {
        this.fundSelnVol = fundSelnVol;
    }

    public Long getFundShnuVol() {
        return fundShnuVol;
    }

    public void setFundShnuVol(Long fundShnuVol) {
        this.fundShnuVol = fundShnuVol;
    }

    public Long getFundNtbyQty() {
        return fundNtbyQty;
    }

    public void setFundNtbyQty(Long fundNtbyQty) {
        this.fundNtbyQty = fundNtbyQty;
    }

    public Long getFundSelnTrPbmn() {
        return fundSelnTrPbmn;
    }

    public void setFundSelnTrPbmn(Long fundSelnTrPbmn) {
        this.fundSelnTrPbmn = fundSelnTrPbmn;
    }

    public Long getFundShnuTrPbmn() {
        return fundShnuTrPbmn;
    }

    public void setFundShnuTrPbmn(Long fundShnuTrPbmn) {
        this.fundShnuTrPbmn = fundShnuTrPbmn;
    }

    public Long getFundNtbyTrPbmn() {
        return fundNtbyTrPbmn;
    }

    public void setFundNtbyTrPbmn(Long fundNtbyTrPbmn) {
        this.fundNtbyTrPbmn = fundNtbyTrPbmn;
    }

    public Long getEtcOrgtSelnVol() {
        return etcOrgtSelnVol;
    }

    public void setEtcOrgtSelnVol(Long etcOrgtSelnVol) {
        this.etcOrgtSelnVol = etcOrgtSelnVol;
    }

    public Long getEtcOrgtShnuVol() {
        return etcOrgtShnuVol;
    }

    public void setEtcOrgtShnuVol(Long etcOrgtShnuVol) {
        this.etcOrgtShnuVol = etcOrgtShnuVol;
    }

    public Long getEtcOrgtNtbyVol() {
        return etcOrgtNtbyVol;
    }

    public void setEtcOrgtNtbyVol(Long etcOrgtNtbyVol) {
        this.etcOrgtNtbyVol = etcOrgtNtbyVol;
    }

    public Long getEtcOrgtSelnTrPbmn() {
        return etcOrgtSelnTrPbmn;
    }

    public void setEtcOrgtSelnTrPbmn(Long etcOrgtSelnTrPbmn) {
        this.etcOrgtSelnTrPbmn = etcOrgtSelnTrPbmn;
    }

    public Long getEtcOrgtShnuTrPbmn() {
        return etcOrgtShnuTrPbmn;
    }

    public void setEtcOrgtShnuTrPbmn(Long etcOrgtShnuTrPbmn) {
        this.etcOrgtShnuTrPbmn = etcOrgtShnuTrPbmn;
    }

    public Long getEtcOrgtNtbyTrPbmn() {
        return etcOrgtNtbyTrPbmn;
    }

    public void setEtcOrgtNtbyTrPbmn(Long etcOrgtNtbyTrPbmn) {
        this.etcOrgtNtbyTrPbmn = etcOrgtNtbyTrPbmn;
    }

    public Long getEtcCorpSelnVol() {
        return etcCorpSelnVol;
    }

    public void setEtcCorpSelnVol(Long etcCorpSelnVol) {
        this.etcCorpSelnVol = etcCorpSelnVol;
    }

    public Long getEtcCorpShnuVol() {
        return etcCorpShnuVol;
    }

    public void setEtcCorpShnuVol(Long etcCorpShnuVol) {
        this.etcCorpShnuVol = etcCorpShnuVol;
    }

    public Long getEtcCorpNtbyVol() {
        return etcCorpNtbyVol;
    }

    public void setEtcCorpNtbyVol(Long etcCorpNtbyVol) {
        this.etcCorpNtbyVol = etcCorpNtbyVol;
    }

    public Long getEtcCorpSelnTrPbmn() {
        return etcCorpSelnTrPbmn;
    }

    public void setEtcCorpSelnTrPbmn(Long etcCorpSelnTrPbmn) {
        this.etcCorpSelnTrPbmn = etcCorpSelnTrPbmn;
    }

    public Long getEtcCorpShnuTrPbmn() {
        return etcCorpShnuTrPbmn;
    }

    public void setEtcCorpShnuTrPbmn(Long etcCorpShnuTrPbmn) {
        this.etcCorpShnuTrPbmn = etcCorpShnuTrPbmn;
    }

    public Long getEtcCorpNtbyTrPbmn() {
        return etcCorpNtbyTrPbmn;
    }

    public void setEtcCorpNtbyTrPbmn(Long etcCorpNtbyTrPbmn) {
        this.etcCorpNtbyTrPbmn = etcCorpNtbyTrPbmn;
    }

    @Override
    public String toString() {
        return "KorMarketFlow074Output{" +
                "frgnSelnVol=" + frgnSelnVol +
                ", frgnShnuVol=" + frgnShnuVol +
                ", frgnNtbyQty=" + frgnNtbyQty +
                ", frgnSelnTrPbmn=" + frgnSelnTrPbmn +
                ", frgnShnuTrPbmn=" + frgnShnuTrPbmn +
                ", frgnNtbyTrPbmn=" + frgnNtbyTrPbmn +
                ", prsnSelnVol=" + prsnSelnVol +
                ", prsnShnuVol=" + prsnShnuVol +
                ", prsnNtbyQty=" + prsnNtbyQty +
                ", prsnSelnTrPbmn=" + prsnSelnTrPbmn +
                ", prsnShnuTrPbmn=" + prsnShnuTrPbmn +
                ", prsnNtbyTrPbmn=" + prsnNtbyTrPbmn +
                ", orgnSelnVol=" + orgnSelnVol +
                ", orgnShnuVol=" + orgnShnuVol +
                ", orgnNtbyQty=" + orgnNtbyQty +
                ", orgnSelnTrPbmn=" + orgnSelnTrPbmn +
                ", orgnShnuTrPbmn=" + orgnShnuTrPbmn +
                ", orgnNtbyTrPbmn=" + orgnNtbyTrPbmn +
                ", scrtSelnVol=" + scrtSelnVol +
                ", scrtShnuVol=" + scrtShnuVol +
                ", scrtNtbyQty=" + scrtNtbyQty +
                ", scrtSelnTrPbmn=" + scrtSelnTrPbmn +
                ", scrtShnuTrPbmn=" + scrtShnuTrPbmn +
                ", scrtNtbyTrPbmn=" + scrtNtbyTrPbmn +
                ", ivtrSelnVol=" + ivtrSelnVol +
                ", ivtrShnuVol=" + ivtrShnuVol +
                ", ivtrNtbyQty=" + ivtrNtbyQty +
                ", ivtrSelnTrPbmn=" + ivtrSelnTrPbmn +
                ", ivtrShnuTrPbmn=" + ivtrShnuTrPbmn +
                ", ivtrNtbyTrPbmn=" + ivtrNtbyTrPbmn +
                ", peFundSelnVol=" + peFundSelnVol +
                ", peFundShnuVol=" + peFundShnuVol +
                ", peFundNtbyVol=" + peFundNtbyVol +
                ", peFundSelnTrPbmn=" + peFundSelnTrPbmn +
                ", peFundShnuTrPbmn=" + peFundShnuTrPbmn +
                ", peFundNtbyTrPbmn=" + peFundNtbyTrPbmn +
                ", bankSelnVol=" + bankSelnVol +
                ", bankShnuVol=" + bankShnuVol +
                ", bankNtbyQty=" + bankNtbyQty +
                ", bankSelnTrPbmn=" + bankSelnTrPbmn +
                ", bankShnuTrPbmn=" + bankShnuTrPbmn +
                ", bankNtbyTrPbmn=" + bankNtbyTrPbmn +
                ", insuSelnVol=" + insuSelnVol +
                ", insuShnuVol=" + insuShnuVol +
                ", insuNtbyQty=" + insuNtbyQty +
                ", insuSelnTrPbmn=" + insuSelnTrPbmn +
                ", insuShnuTrPbmn=" + insuShnuTrPbmn +
                ", insuNtbyTrPbmn=" + insuNtbyTrPbmn +
                ", mrbnSelnVol=" + mrbnSelnVol +
                ", mrbnShnuVol=" + mrbnShnuVol +
                ", mrbnNtbyQty=" + mrbnNtbyQty +
                ", mrbnSelnTrPbmn=" + mrbnSelnTrPbmn +
                ", mrbnShnuTrPbmn=" + mrbnShnuTrPbmn +
                ", mrbnNtbyTrPbmn=" + mrbnNtbyTrPbmn +
                ", fundSelnVol=" + fundSelnVol +
                ", fundShnuVol=" + fundShnuVol +
                ", fundNtbyQty=" + fundNtbyQty +
                ", fundSelnTrPbmn=" + fundSelnTrPbmn +
                ", fundShnuTrPbmn=" + fundShnuTrPbmn +
                ", fundNtbyTrPbmn=" + fundNtbyTrPbmn +
                ", etcOrgtSelnVol=" + etcOrgtSelnVol +
                ", etcOrgtShnuVol=" + etcOrgtShnuVol +
                ", etcOrgtNtbyVol=" + etcOrgtNtbyVol +
                ", etcOrgtSelnTrPbmn=" + etcOrgtSelnTrPbmn +
                ", etcOrgtShnuTrPbmn=" + etcOrgtShnuTrPbmn +
                ", etcOrgtNtbyTrPbmn=" + etcOrgtNtbyTrPbmn +
                ", etcCorpSelnVol=" + etcCorpSelnVol +
                ", etcCorpShnuVol=" + etcCorpShnuVol +
                ", etcCorpNtbyVol=" + etcCorpNtbyVol +
                ", etcCorpSelnTrPbmn=" + etcCorpSelnTrPbmn +
                ", etcCorpShnuTrPbmn=" + etcCorpShnuTrPbmn +
                ", etcCorpNtbyTrPbmn=" + etcCorpNtbyTrPbmn +
                '}';
    }
}
