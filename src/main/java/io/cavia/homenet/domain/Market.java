package io.cavia.homenet.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import jakarta.persistence.*;

@Entity
@Table(name = "market")
public class Market {
    /**
     * 거래소 시세 정보입니다
     * column 정보
     * id: pk입니다
     * mkop_cls_code: 장운영구분코드 입니다.
     * bstp_nmix_prpr: 업종지수 현재가 입니다
     */
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "mkop_cls_code")
    private String mkopClsCode;
    @Column(name = "bstp_nmix_prpr")
    private Long bstpNmixPrpr;
    @Column(name = "bstp_nmix_prby_vrss")
    private Long getBstpNmixVrss;
    @Column(name = "prdy_vrss_sign")
    private String prdy_vrss_sign;
    @Column(name = "bsrp_nmix_prdy_ctrt")
    private BigDecimal bstpNmixPrdyCtrt;
/**
     * 시장별 투자자 매매동향(시세)테이터를 담는 테이블입니다
     * id: pk입니다.
     * ------ 외국인 ------
     * - frgn_seln_vol: 외국인 매도 거래량 입니다.
     * - frgn_shnu_vol: 외국인 매수2 거래량 입니다.
     * - frgn_ntby_qty: 외국인 순매수 수량 입니다.
     * - frgn_seln_tr_pbmn: 외국인 매도 거래 대금 입니다.
     * - frgn_shnu_tr_pbmn: 외국인 매수2 거래 대금 입니다.
     * - frgn_ntby_tr_pbmn: 외국인 순매수 거래 대금 입니다.
     * ------ 개인 ------
     * - prsn_seln_vol: 개인 매도 거래량 입니다.
     * - prsn_shnu_vol: 개인 매수2 거래량 입니다.
     * - prsn_ntby_qty: 개인 순매수 수량 입니다.
     * - prsn_seln_tr_pbmn: 개인 매도 거래 대금 입니다.
     * - prsn_shnu_tr_pbmn: 개인 매수2 거래 대금 입니다.
     * - prsn_ntby_tr_pbmn: 개인 순매수 거래 대금 입니다.
     * ------ 기관 ------
     * - orgn_seln_vol: 기관계 매도 거래량 입니다.
     * - orgn_shnu_vol: 기관계 매수2 거래량 입니다.
     * - orgn_ntby_qty: 기관계 순매수 수량 입니다.
     * - orgn_seln_tr_pbmn: 기관계 매도 거래 대금 입니다.
     * - orgn_shnu_tr_pbmn: 기관계 매수2 거래 대금 입니다.
     * - orgn_ntby_tr_pbmn: 기관계 순매수 거래 대금 입니다.
     * ------ 증권 ------
     * - scrt_seln_vol: 증권 매도 거래량 입니다.
     * - scrt_shnu_vol: 증권 매수2 거래량 입니다.
     * - scrt_ntby_qty: 증권 순매수 수량 입니다.
     * - scrt_seln_tr_pbmn: 증권 매도 거래 대금 입니다.
     * - scrt_shnu_tr_pbmn: 증권 매수2 거래 대금 입니다.
     * - scrt_ntby_tr_pbmn: 증권 순매수 거래 대금 입니다.
     * ------ 투자신탁 ------
     * - ivtr_seln_vol: 투자신탁 매도 거래량 입니다.
     * - ivtr_shnu_vol: 투자신탁 매수2 거래량 입니다.
     * - ivtr_ntby_qty: 투자신탁 순매수 수량 입니다.
     * - ivtr_seln_tr_pbmn: 투자신탁 매도 거래 대금 입니다.
     * - ivtr_shnu_tr_pbmn: 투자신탁 매수2 거래 대금 입니다.
     * - ivtr_ntby_tr_pbmn: 투자신탁 순매수 거래 대금 입니다.
     * ------ 사모 펀드 ------
     * - pe_fund_seln_vol: 사모 펀드 매도 거래량 입니다.
     * - pe_fund_shnu_vol: 사모 펀드 매수2 거래량 입니다.
     * - pe_fund_ntby_vol: 사모 펀드 순매수 거래량 입니다.
     * - pe_fund_seln_tr_pbmn: 사모 펀드 매도 거래 대금 입니다.
     * - pe_fund_shnu_tr_pbmn: 사모 펀드 매수2 거래 대금 입니다.
     * - pe_fund_ntby_tr_pbmn: 사모 펀드 순매수 거래 대금 입니다.
     * ------ 은행 ------
     * - bank_seln_vol: 은행 매도 거래량 입니다.
     * - bank_shnu_vol: 은행 매수2 거래량 입니다.
     * - bank_ntby_qty: 은행 순매수 수량 입니다.
     * - bank_seln_tr_pbmn: 은행 매도 거래 대금 입니다.
     * - bank_shnu_tr_pbmn: 은행 매수2 거래 대금 입니다.
     * - bank_ntby_tr_pbmn: 은행 순매수 거래 대금 입니다.
     * ------ 보험 ------
     * - insu_seln_vol: 보험 매도 거래량 입니다.
     * - insu_shnu_vol: 보험 매수2 거래량 입니다.
     * - insu_ntby_qty: 보험 순매수 수량 입니다.
     * - insu_seln_tr_pbmn: 보험 매도 거래 대금 입니다.
     * - insu_shnu_tr_pbmn: 보험 매수2 거래 대금 입니다.
     * - insu_ntby_tr_pbmn: 보험 순매수 거래 대금 입니다.
     * ------ 종금 ------
     * - mrbn_seln_vol: 종금 매도 거래량 입니다.
     * - mrbn_shnu_vol: 종금 매수2 거래량 입니다.
     * - mrbn_ntby_qty: 종금 순매수 수량 입니다.
     * - mrbn_seln_tr_pbmn: 종금 매도 거래 대금 입니다.
     * - mrbn_shnu_tr_pbmn: 종금 매수2 거래 대금 입니다.
     * - mrbn_ntby_tr_pbmn: 종금 순매수 거래 대금 입니다.
     * ------ 기금 ------
     * - fund_seln_vol: 기금 매도 거래량 입니다.
     * - fund_shnu_vol: 기금 매수2 거래량 입니다.
     * - fund_ntby_qty: 기금 순매수 수량 입니다.
     * - fund_seln_tr_pbmn: 기금 매도 거래 대금 입니다.
     * - fund_shnu_tr_pbmn: 기금 매수2 거래 대금 입니다.
     * - fund_ntby_tr_pbmn: 기금 순매수 거래 대금 입니다.
     * ------ 기타 단체 ------
     * - etc_orgt_seln_vol: 기타 단체 매도 거래량 입니다.
     * - etc_orgt_shnu_vol: 기타 단체 매수2 거래량 입니다.
     * - etc_orgt_ntby_vol: 기타 단체 순매수 거래량 입니다.
     * - etc_orgt_seln_tr_pbmn: 기타 단체 매도 거래 대금 입니다.
     * - etc_orgt_shnu_tr_pbmn: 기타 단체 매수2 거래 대금 입니다.
     * - etc_orgt_ntby_tr_pbmn: 기타 단체 순매수 거래 대금 입니다.
     * ------ 기타 법인 ------
     * - etc_corp_seln_vol: 기타 법인 매도 거래량 입니다.
     * - etc_corp_shnu_vol: 기타 법인 매수2 거래량 입니다.
     * - etc_corp_ntby_vol: 기타 법인 순매수 거래량 입니다.
     * - etc_corp_seln_tr_pbmn: 기타 법인 매도 거래 대금 입니다.
     * - etc_corp_shnu_tr_pbmn: 기타 법인 매수2 거래 대금 입니다.
     * - etc_corp_ntby_tr_pbmn: 기타 법인 순매수 거래 대금 입니다.
     */
@Column(name = "frgn_seln_vol")
private Long frgnSelnVol;

    @Column(name = "frgn_shnu_vol")
    private Long frgnShnuVol;

    @Column(name = "frgn_ntby_qty")
    private Long frgnNtbyQty;

    @Column(name = "frgn_seln_tr_pbmn")
    private Long frgnSelnTrPbmn;

    @Column(name = "frgn_shnu_tr_pbmn")
    private Long frgnShnuTrPbmn;

    @Column(name = "frgn_ntby_tr_pbmn")
    private Long frgnNtbyTrPbmn;

    @Column(name = "prsn_seln_vol")
    private Long prsnSelnVol;

    @Column(name = "prsn_shnu_vol")
    private Long prsnShnuVol;

    @Column(name = "prsn_ntby_qty")
    private Long prsnNtbyQty;

    @Column(name = "prsn_seln_tr_pbmn")
    private Long prsnSelnTrPbmn;

    @Column(name = "prsn_shnu_tr_pbmn")
    private Long prsnShnuTrPbmn;

    @Column(name = "prsn_ntby_tr_pbmn")
    private Long prsnNtbyTrPbmn;

    @Column(name = "orgn_seln_vol")
    private Long orgnSelnVol;

    @Column(name = "orgn_shnu_vol")
    private Long orgnShnuVol;

    @Column(name = "orgn_ntby_qty")
    private Long orgnNtbyQty;

    @Column(name = "orgn_seln_tr_pbmn")
    private Long orgnSelnTrPbmn;

    @Column(name = "orgn_shnu_tr_pbmn")
    private Long orgnShnuTrPbmn;

    @Column(name = "orgn_ntby_tr_pbmn")
    private Long orgnNtbyTrPbmn;

    @Column(name = "scrt_seln_vol")
    private Long scrtSelnVol;

    @Column(name = "scrt_shnu_vol")
    private Long scrtShnuVol;

    @Column(name = "scrt_ntby_qty")
    private Long scrtNtbyQty;

    @Column(name = "scrt_seln_tr_pbmn")
    private Long scrtSelnTrPbmn;

    @Column(name = "scrt_shnu_tr_pbmn")
    private Long scrtShnuTrPbmn;

    @Column(name = "scrt_ntby_tr_pbmn")
    private Long scrtNtbyTrPbmn;

    @Column(name = "ivtr_seln_vol")
    private Long ivtrSelnVol;

    @Column(name = "ivtr_shnu_vol")
    private Long ivtrShnuVol;

    @Column(name = "ivtr_ntby_qty")
    private Long ivtrNtbyQty;

    @Column(name = "ivtr_seln_tr_pbmn")
    private Long ivtrSelnTrPbmn;

    @Column(name = "ivtr_shnu_tr_pbmn")
    private Long ivtrShnuTrPbmn;

    @Column(name = "ivtr_ntby_tr_pbmn")
    private Long ivtrNtbyTrPbmn;

    @Column(name = "pe_fund_seln_vol")
    private Long peFundSelnVol;

    @Column(name = "pe_fund_shnu_vol")
    private Long peFundShnuVol;

    @Column(name = "pe_fund_ntby_vol")
    private Long peFundNtbyVol;

    @Column(name = "pe_fund_seln_tr_pbmn")
    private Long peFundSelnTrPbmn;

    @Column(name = "pe_fund_shnu_tr_pbmn")
    private Long peFundShnuTrPbmn;

    @Column(name = "pe_fund_ntby_tr_pbmn")
    private Long peFundNtbyTrPbmn;

    @Column(name = "bank_seln_vol")
    private Long bankSelnVol;

    @Column(name = "bank_shnu_vol")
    private Long bankShnuVol;

    @Column(name = "bank_ntby_qty")
    private Long bankNtbyQty;

    @Column(name = "bank_seln_tr_pbmn")
    private Long bankSelnTrPbmn;

    @Column(name = "bank_shnu_tr_pbmn")
    private Long bankShnuTrPbmn;

    @Column(name = "bank_ntby_tr_pbmn")
    private Long bankNtbyTrPbmn;

    @Column(name = "insu_seln_vol")
    private Long insuSelnVol;

    @Column(name = "insu_shnu_vol")
    private Long insuShnuVol;

    @Column(name = "insu_ntby_qty")
    private Long insuNtbyQty;

    @Column(name = "insu_seln_tr_pbmn")
    private Long insuSelnTrPbmn;

    @Column(name = "insu_shnu_tr_pbmn")
    private Long insuShnuTrPbmn;

    @Column(name = "insu_ntby_tr_pbmn")
    private Long insuNtbyTrPbmn;

    @Column(name = "mrbn_seln_vol")
    private Long mrbnSelnVol;

    @Column(name = "mrbn_shnu_vol")
    private Long mrbnShnuVol;

    @Column(name = "mrbn_ntby_qty")
    private Long mrbnNtbyQty;

    @Column(name = "mrbn_seln_tr_pbmn")
    private Long mrbnSelnTrPbmn;

    @Column(name = "mrbn_shnu_tr_pbmn")
    private Long mrbnShnuTrPbmn;

    @Column(name = "mrbn_ntby_tr_pbmn")
    private Long mrbnNtbyTrPbmn;

    @Column(name = "fund_seln_vol")
    private Long fundSelnVol;

    @Column(name = "fund_shnu_vol")
    private Long fundShnuVol;

    @Column(name = "fund_ntby_qty")
    private Long fundNtbyQty;

    @Column(name = "fund_seln_tr_pbmn")
    private Long fundSelnTrPbmn;

    @Column(name = "fund_shnu_tr_pbmn")
    private Long fundShnuTrPbmn;

    @Column(name = "fund_ntby_tr_pbmn")
    private Long fundNtbyTrPbmn;

    @Column(name = "etc_orgt_seln_vol")
    private Long etcOrgtSelnVol;

    @Column(name = "etc_orgt_shnu_vol")
    private Long etcOrgtShnuVol;

    @Column(name = "etc_orgt_ntby_vol")
    private Long etcOrgtNtbyVol;

    @Column(name = "etc_orgt_seln_tr_pbmn")
    private Long etcOrgtSelnTrPbmn;

    @Column(name = "etc_orgt_shnu_tr_pbmn")
    private Long etcOrgtShnuTrPbmn;

    @Column(name = "etc_orgt_ntby_tr_pbmn")
    private Long etcOrgtNtbyTrPbmn;

    @Column(name = "etc_corp_seln_vol")
    private Long etcCorpSelnVol;

    @Column(name = "etc_corp_shnu_vol")
    private Long etcCorpShnuVol;

    @Column(name = "etc_corp_ntby_vol")
    private Long etcCorpNtbyVol;

    @Column(name = "etc_corp_seln_tr_pbmn")
    private Long etcCorpSelnTrPbmn;

    @Column(name = "etc_corp_shnu_tr_pbmn")
    private Long etcCorpShnuTrPbmn;

    @Column(name = "etc_corp_ntby_tr_pbmn")
    private Long etcCorpNtbyTrPbmn;


    public Market() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMkopClsCode() {
        return mkopClsCode;
    }

    public void setMkopClsCode(String mkopClsCode) {
        this.mkopClsCode = mkopClsCode;
    }

    public Long getBstpNmixPrpr() {
        return bstpNmixPrpr;
    }

    public void setBstpNmixPrpr(Long bstpNmixPrpr) {
        this.bstpNmixPrpr = bstpNmixPrpr;
    }

    public Long getGetBstpNmixVrss() {
        return getBstpNmixVrss;
    }

    public void setGetBstpNmixVrss(Long getBstpNmixVrss) {
        this.getBstpNmixVrss = getBstpNmixVrss;
    }

    public String getPrdy_vrss_sign() {
        return prdy_vrss_sign;
    }

    public void setPrdy_vrss_sign(String prdy_vrss_sign) {
        this.prdy_vrss_sign = prdy_vrss_sign;
    }

    public BigDecimal getBstpNmixPrdyCtrt() {
        return bstpNmixPrdyCtrt;
    }

    public void setBstpNmixPrdyCtrt(BigDecimal bstpNmixPrdyCtrt) {
        this.bstpNmixPrdyCtrt = bstpNmixPrdyCtrt;
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
}
