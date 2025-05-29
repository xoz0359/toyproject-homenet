package io.cavia.homenet.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ViRealTime {

    @Id @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "mksc_shrn_iscd")
    private String mkscShrnIscd;
    @Column(name = "trht_yn")
    private String trhtYn;
    @Column(name = "tr_susp_reas_cntt")
    private String trSuspReasCntt;
    @Column(name = "mkop_cls_code")
    private String mkopClsCode;
    @Column(name = "antc_mkop_cls_code")
    private String antcMkopClsCode;
    @Column(name = "mrkt_trtm_cls_code")
    private String mrktTrtmClsCode;
    @Column(name = "divi_app_cls_code")
    private String diviAppClsCode;
    @Column(name = "iscd_stat_cls_code")
    private String iscdStatClsCode;
    @Column(name = "vi_cls_code")
    private String viClsCode;
    @Column(name = "ovtm_vi_cls_code")
    private String ovtmViClsCode;
    @Column(name = "exch_cls_code")
    private String exch_ClsCode;

    public ViRealTime() {}

    public ViRealTime(String mkscShrnIscd, String trhtYn, String trSuspReasCntt, String mkopClsCode, String antcMkopClsCode, String mrktTrtmClsCode, String diviAppClsCode, String iscdStatClsCode, String viClsCode, String ovtmViClsCode, String exch_ClsCode) {
        this.mkscShrnIscd = mkscShrnIscd;
        this.trhtYn = trhtYn;
        this.trSuspReasCntt = trSuspReasCntt;
        this.mkopClsCode = mkopClsCode;
        this.antcMkopClsCode = antcMkopClsCode;
        this.mrktTrtmClsCode = mrktTrtmClsCode;
        this.diviAppClsCode = diviAppClsCode;
        this.iscdStatClsCode = iscdStatClsCode;
        this.viClsCode = viClsCode;
        this.ovtmViClsCode = ovtmViClsCode;
        this.exch_ClsCode = exch_ClsCode;
    }

    public String getMkscShrnIscd() {
        return mkscShrnIscd;
    }

    public void setMkscShrnIscd(String mkscShrnIscd) {
        this.mkscShrnIscd = mkscShrnIscd;
    }

    public String getTrhtYn() {
        return trhtYn;
    }

    public void setTrhtYn(String trhtYn) {
        this.trhtYn = trhtYn;
    }

    public String getTrSuspReasCntt() {
        return trSuspReasCntt;
    }

    public void setTrSuspReasCntt(String trSuspReasCntt) {
        this.trSuspReasCntt = trSuspReasCntt;
    }

    public String getMkopClsCode() {
        return mkopClsCode;
    }

    public void setMkopClsCode(String mkopClsCode) {
        this.mkopClsCode = mkopClsCode;
    }

    public String getAntcMkopClsCode() {
        return antcMkopClsCode;
    }

    public void setAntcMkopClsCode(String antcMkopClsCode) {
        this.antcMkopClsCode = antcMkopClsCode;
    }

    public String getMrktTrtmClsCode() {
        return mrktTrtmClsCode;
    }

    public void setMrktTrtmClsCode(String mrktTrtmClsCode) {
        this.mrktTrtmClsCode = mrktTrtmClsCode;
    }

    public String getDiviAppClsCode() {
        return diviAppClsCode;
    }

    public void setDiviAppClsCode(String diviAppClsCode) {
        this.diviAppClsCode = diviAppClsCode;
    }

    public String getIscdStatClsCode() {
        return iscdStatClsCode;
    }

    public void setIscdStatClsCode(String iscdStatClsCode) {
        this.iscdStatClsCode = iscdStatClsCode;
    }

    public String getViClsCode() {
        return viClsCode;
    }

    public void setViClsCode(String viClsCode) {
        this.viClsCode = viClsCode;
    }

    public String getOvtmViClsCode() {
        return ovtmViClsCode;
    }

    public void setOvtmViClsCode(String ovtmViClsCode) {
        this.ovtmViClsCode = ovtmViClsCode;
    }

    public String getExch_ClsCode() {
        return exch_ClsCode;
    }

    public void setExch_ClsCode(String exch_ClsCode) {
        this.exch_ClsCode = exch_ClsCode;
    }
}
