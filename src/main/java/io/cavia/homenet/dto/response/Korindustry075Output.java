package io.cavia.homenet.dto.response;

public class Korindustry075Output {

    private String stckBsopDate;          // 주식 영업 일자
    private String bstpNmixPrpr;          // 업종 지수 현재가
    private String bstpNmixPrdyVrss;      // 업종 지수 전일 대비
    private String prdyVrssSign;          // 전일 대비 부호
    private String bstpNmixPrdyCtrt;      // 업종 지수 전일 대비율
    private String bstpNmixOprc;          // 업종 지수 시가2
    private String bstpNmixHgpr;          // 업종 지수 최고가
    private String bstpNmixLwpr;          // 업종 지수 최저가

    private String stckPrdyClpr;          // 주식 전일 종가

    private String frgnNtbyQty;           // 외국인 순매수 수량
    private String frgnRegNtbyQty;        // 외국인 등록 순매수 수량
    private String frgnNregNtbyQty;       // 외국인 비등록 순매수 수량
    private String prsnNtbyQty;           // 개인 순매수 수량
    private String orgnNtbyQty;           // 기관계 순매수 수량
    private String scrtNtbyQty;           // 증권 순매수 수량
    private String ivtrNtbyQty;           // 투자신탁 순매수 수량
    private String peFundNtbyVol;         // 사모 펀드 순매수 거래량
    private String bankNtbyQty;           // 은행 순매수 수량
    private String insuNtbyQty;           // 보험 순매수 수량
    private String mrbnNtbyQty;           // 종금 순매수 수량
    private String fundNtbyQty;           // 기금 순매수 수량
    private String etcNtbyQty;            // 기타 순매수 수량
    private String etcOrgtNtbyVol;        // 기타 단체 순매수 거래량
    private String etcCorpNtbyVol;        // 기타 법인 순매수 거래량

    private String frgnNtbyTrPbmn;        // 외국인 순매수 거래 대금
    private String frgnRegNtbyPbmn;       // 외국인 등록 순매수 대금
    private String frgnNregNtbyPbmn;      // 외국인 비등록 순매수 대금
    private String prsnNtbyTrPbmn;        // 개인 순매수 거래 대금
    private String orgnNtbyTrPbmn;        // 기관계 순매수 거래 대금
    private String scrtNtbyTrPbmn;        // 증권 순매수 거래 대금
    private String ivtrNtbyTrPbmn;        // 투자신탁 순매수 거래 대금
    private String peFundNtbyTrPbmn;      // 사모 펀드 순매수 거래 대금
    private String bankNtbyTrPbmn;        // 은행 순매수 거래 대금
    private String insuNtbyTrPbmn;        // 보험 순매수 거래 대금
    private String mrbnNtbyTrPbmn;        // 종금 순매수 거래 대금
    private String fundNtbyTrPbmn;        // 기금 순매수 거래 대금
    private String etcNtbyTrPbmn;         // 기타 순매수 거래 대금
    private String etcOrgtNtbyTrPbmn;     // 기타 단체 순매수 거래 대금
    private String etcCorpNtbyTrPbmn;

    public Korindustry075Output() {
    }

    public Korindustry075Output(String stckBsopDate, String bstpNmixPrpr, String bstpNmixPrdyVrss,
                                String prdyVrssSign, String bstpNmixPrdyCtrt, String bstpNmixOprc,
                                String bstpNmixHgpr, String bstpNmixLwpr, String stckPrdyClpr,
                                String frgnNtbyQty, String frgnRegNtbyQty, String frgnNregNtbyQty,
                                String prsnNtbyQty, String orgnNtbyQty, String scrtNtbyQty,
                                String ivtrNtbyQty, String peFundNtbyVol, String bankNtbyQty,
                                String insuNtbyQty, String mrbnNtbyQty, String fundNtbyQty,
                                String etcNtbyQty, String etcOrgtNtbyVol, String etcCorpNtbyVol,
                                String frgnNtbyTrPbmn, String frgnRegNtbyPbmn, String frgnNregNtbyPbmn,
                                String prsnNtbyTrPbmn, String orgnNtbyTrPbmn, String scrtNtbyTrPbmn,
                                String ivtrNtbyTrPbmn, String peFundNtbyTrPbmn, String bankNtbyTrPbmn,
                                String insuNtbyTrPbmn, String mrbnNtbyTrPbmn, String fundNtbyTrPbmn,
                                String etcNtbyTrPbmn, String etcOrgtNtbyTrPbmn, String etcCorpNtbyTrPbmn) {
        this.stckBsopDate = stckBsopDate;
        this.bstpNmixPrpr = bstpNmixPrpr;
        this.bstpNmixPrdyVrss = bstpNmixPrdyVrss;
        this.prdyVrssSign = prdyVrssSign;
        this.bstpNmixPrdyCtrt = bstpNmixPrdyCtrt;
        this.bstpNmixOprc = bstpNmixOprc;
        this.bstpNmixHgpr = bstpNmixHgpr;
        this.bstpNmixLwpr = bstpNmixLwpr;
        this.stckPrdyClpr = stckPrdyClpr;
        this.frgnNtbyQty = frgnNtbyQty;
        this.frgnRegNtbyQty = frgnRegNtbyQty;
        this.frgnNregNtbyQty = frgnNregNtbyQty;
        this.prsnNtbyQty = prsnNtbyQty;
        this.orgnNtbyQty = orgnNtbyQty;
        this.scrtNtbyQty = scrtNtbyQty;
        this.ivtrNtbyQty = ivtrNtbyQty;
        this.peFundNtbyVol = peFundNtbyVol;
        this.bankNtbyQty = bankNtbyQty;
        this.insuNtbyQty = insuNtbyQty;
        this.mrbnNtbyQty = mrbnNtbyQty;
        this.fundNtbyQty = fundNtbyQty;
        this.etcNtbyQty = etcNtbyQty;
        this.etcOrgtNtbyVol = etcOrgtNtbyVol;
        this.etcCorpNtbyVol = etcCorpNtbyVol;
        this.frgnNtbyTrPbmn = frgnNtbyTrPbmn;
        this.frgnRegNtbyPbmn = frgnRegNtbyPbmn;
        this.frgnNregNtbyPbmn = frgnNregNtbyPbmn;
        this.prsnNtbyTrPbmn = prsnNtbyTrPbmn;
        this.orgnNtbyTrPbmn = orgnNtbyTrPbmn;
        this.scrtNtbyTrPbmn = scrtNtbyTrPbmn;
        this.ivtrNtbyTrPbmn = ivtrNtbyTrPbmn;
        this.peFundNtbyTrPbmn = peFundNtbyTrPbmn;
        this.bankNtbyTrPbmn = bankNtbyTrPbmn;
        this.insuNtbyTrPbmn = insuNtbyTrPbmn;
        this.mrbnNtbyTrPbmn = mrbnNtbyTrPbmn;
        this.fundNtbyTrPbmn = fundNtbyTrPbmn;
        this.etcNtbyTrPbmn = etcNtbyTrPbmn;
        this.etcOrgtNtbyTrPbmn = etcOrgtNtbyTrPbmn;
        this.etcCorpNtbyTrPbmn = etcCorpNtbyTrPbmn;
    }

    public String getStckBsopDate() {
        return stckBsopDate;
    }

    public void setStckBsopDate(String stckBsopDate) {
        this.stckBsopDate = stckBsopDate;
    }

    public String getBstpNmixPrpr() {
        return bstpNmixPrpr;
    }

    public void setBstpNmixPrpr(String bstpNmixPrpr) {
        this.bstpNmixPrpr = bstpNmixPrpr;
    }

    public String getBstpNmixPrdyVrss() {
        return bstpNmixPrdyVrss;
    }

    public void setBstpNmixPrdyVrss(String bstpNmixPrdyVrss) {
        this.bstpNmixPrdyVrss = bstpNmixPrdyVrss;
    }

    public String getPrdyVrssSign() {
        return prdyVrssSign;
    }

    public void setPrdyVrssSign(String prdyVrssSign) {
        this.prdyVrssSign = prdyVrssSign;
    }

    public String getBstpNmixPrdyCtrt() {
        return bstpNmixPrdyCtrt;
    }

    public void setBstpNmixPrdyCtrt(String bstpNmixPrdyCtrt) {
        this.bstpNmixPrdyCtrt = bstpNmixPrdyCtrt;
    }

    public String getBstpNmixOprc() {
        return bstpNmixOprc;
    }

    public void setBstpNmixOprc(String bstpNmixOprc) {
        this.bstpNmixOprc = bstpNmixOprc;
    }

    public String getBstpNmixHgpr() {
        return bstpNmixHgpr;
    }

    public void setBstpNmixHgpr(String bstpNmixHgpr) {
        this.bstpNmixHgpr = bstpNmixHgpr;
    }

    public String getBstpNmixLwpr() {
        return bstpNmixLwpr;
    }

    public void setBstpNmixLwpr(String bstpNmixLwpr) {
        this.bstpNmixLwpr = bstpNmixLwpr;
    }

    public String getStckPrdyClpr() {
        return stckPrdyClpr;
    }

    public void setStckPrdyClpr(String stckPrdyClpr) {
        this.stckPrdyClpr = stckPrdyClpr;
    }

    public String getFrgnNtbyQty() {
        return frgnNtbyQty;
    }

    public void setFrgnNtbyQty(String frgnNtbyQty) {
        this.frgnNtbyQty = frgnNtbyQty;
    }

    public String getFrgnRegNtbyQty() {
        return frgnRegNtbyQty;
    }

    public void setFrgnRegNtbyQty(String frgnRegNtbyQty) {
        this.frgnRegNtbyQty = frgnRegNtbyQty;
    }

    public String getFrgnNregNtbyQty() {
        return frgnNregNtbyQty;
    }

    public void setFrgnNregNtbyQty(String frgnNregNtbyQty) {
        this.frgnNregNtbyQty = frgnNregNtbyQty;
    }

    public String getPrsnNtbyQty() {
        return prsnNtbyQty;
    }

    public void setPrsnNtbyQty(String prsnNtbyQty) {
        this.prsnNtbyQty = prsnNtbyQty;
    }

    public String getOrgnNtbyQty() {
        return orgnNtbyQty;
    }

    public void setOrgnNtbyQty(String orgnNtbyQty) {
        this.orgnNtbyQty = orgnNtbyQty;
    }

    public String getScrtNtbyQty() {
        return scrtNtbyQty;
    }

    public void setScrtNtbyQty(String scrtNtbyQty) {
        this.scrtNtbyQty = scrtNtbyQty;
    }

    public String getIvtrNtbyQty() {
        return ivtrNtbyQty;
    }

    public void setIvtrNtbyQty(String ivtrNtbyQty) {
        this.ivtrNtbyQty = ivtrNtbyQty;
    }

    public String getPeFundNtbyVol() {
        return peFundNtbyVol;
    }

    public void setPeFundNtbyVol(String peFundNtbyVol) {
        this.peFundNtbyVol = peFundNtbyVol;
    }

    public String getBankNtbyQty() {
        return bankNtbyQty;
    }

    public void setBankNtbyQty(String bankNtbyQty) {
        this.bankNtbyQty = bankNtbyQty;
    }

    public String getInsuNtbyQty() {
        return insuNtbyQty;
    }

    public void setInsuNtbyQty(String insuNtbyQty) {
        this.insuNtbyQty = insuNtbyQty;
    }

    public String getMrbnNtbyQty() {
        return mrbnNtbyQty;
    }

    public void setMrbnNtbyQty(String mrbnNtbyQty) {
        this.mrbnNtbyQty = mrbnNtbyQty;
    }

    public String getFundNtbyQty() {
        return fundNtbyQty;
    }

    public void setFundNtbyQty(String fundNtbyQty) {
        this.fundNtbyQty = fundNtbyQty;
    }

    public String getEtcNtbyQty() {
        return etcNtbyQty;
    }

    public void setEtcNtbyQty(String etcNtbyQty) {
        this.etcNtbyQty = etcNtbyQty;
    }

    public String getEtcOrgtNtbyVol() {
        return etcOrgtNtbyVol;
    }

    public void setEtcOrgtNtbyVol(String etcOrgtNtbyVol) {
        this.etcOrgtNtbyVol = etcOrgtNtbyVol;
    }

    public String getEtcCorpNtbyVol() {
        return etcCorpNtbyVol;
    }

    public void setEtcCorpNtbyVol(String etcCorpNtbyVol) {
        this.etcCorpNtbyVol = etcCorpNtbyVol;
    }

    public String getFrgnNtbyTrPbmn() {
        return frgnNtbyTrPbmn;
    }

    public void setFrgnNtbyTrPbmn(String frgnNtbyTrPbmn) {
        this.frgnNtbyTrPbmn = frgnNtbyTrPbmn;
    }

    public String getFrgnRegNtbyPbmn() {
        return frgnRegNtbyPbmn;
    }

    public void setFrgnRegNtbyPbmn(String frgnRegNtbyPbmn) {
        this.frgnRegNtbyPbmn = frgnRegNtbyPbmn;
    }

    public String getFrgnNregNtbyPbmn() {
        return frgnNregNtbyPbmn;
    }

    public void setFrgnNregNtbyPbmn(String frgnNregNtbyPbmn) {
        this.frgnNregNtbyPbmn = frgnNregNtbyPbmn;
    }

    public String getPrsnNtbyTrPbmn() {
        return prsnNtbyTrPbmn;
    }

    public void setPrsnNtbyTrPbmn(String prsnNtbyTrPbmn) {
        this.prsnNtbyTrPbmn = prsnNtbyTrPbmn;
    }

    public String getOrgnNtbyTrPbmn() {
        return orgnNtbyTrPbmn;
    }

    public void setOrgnNtbyTrPbmn(String orgnNtbyTrPbmn) {
        this.orgnNtbyTrPbmn = orgnNtbyTrPbmn;
    }

    public String getScrtNtbyTrPbmn() {
        return scrtNtbyTrPbmn;
    }

    public void setScrtNtbyTrPbmn(String scrtNtbyTrPbmn) {
        this.scrtNtbyTrPbmn = scrtNtbyTrPbmn;
    }

    public String getIvtrNtbyTrPbmn() {
        return ivtrNtbyTrPbmn;
    }

    public void setIvtrNtbyTrPbmn(String ivtrNtbyTrPbmn) {
        this.ivtrNtbyTrPbmn = ivtrNtbyTrPbmn;
    }

    public String getPeFundNtbyTrPbmn() {
        return peFundNtbyTrPbmn;
    }

    public void setPeFundNtbyTrPbmn(String peFundNtbyTrPbmn) {
        this.peFundNtbyTrPbmn = peFundNtbyTrPbmn;
    }

    public String getBankNtbyTrPbmn() {
        return bankNtbyTrPbmn;
    }

    public void setBankNtbyTrPbmn(String bankNtbyTrPbmn) {
        this.bankNtbyTrPbmn = bankNtbyTrPbmn;
    }

    public String getInsuNtbyTrPbmn() {
        return insuNtbyTrPbmn;
    }

    public void setInsuNtbyTrPbmn(String insuNtbyTrPbmn) {
        this.insuNtbyTrPbmn = insuNtbyTrPbmn;
    }

    public String getMrbnNtbyTrPbmn() {
        return mrbnNtbyTrPbmn;
    }

    public void setMrbnNtbyTrPbmn(String mrbnNtbyTrPbmn) {
        this.mrbnNtbyTrPbmn = mrbnNtbyTrPbmn;
    }

    public String getFundNtbyTrPbmn() {
        return fundNtbyTrPbmn;
    }

    public void setFundNtbyTrPbmn(String fundNtbyTrPbmn) {
        this.fundNtbyTrPbmn = fundNtbyTrPbmn;
    }

    public String getEtcNtbyTrPbmn() {
        return etcNtbyTrPbmn;
    }

    public void setEtcNtbyTrPbmn(String etcNtbyTrPbmn) {
        this.etcNtbyTrPbmn = etcNtbyTrPbmn;
    }

    public String getEtcOrgtNtbyTrPbmn() {
        return etcOrgtNtbyTrPbmn;
    }

    public void setEtcOrgtNtbyTrPbmn(String etcOrgtNtbyTrPbmn) {
        this.etcOrgtNtbyTrPbmn = etcOrgtNtbyTrPbmn;
    }

    public String getEtcCorpNtbyTrPbmn() {
        return etcCorpNtbyTrPbmn;
    }

    public void setEtcCorpNtbyTrPbmn(String etcCorpNtbyTrPbmn) {
        this.etcCorpNtbyTrPbmn = etcCorpNtbyTrPbmn;
    }
}
