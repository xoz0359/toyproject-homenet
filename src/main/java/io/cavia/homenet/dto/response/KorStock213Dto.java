package io.cavia.homenet.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class KorStock213Dto {
    /**
     * 주식일별분봉조회Dto입니다
     * output1(당일)
     * prdyVrss: 전일 대비
     * prdyVrssSign: 전일 대비 부호
     * prdyCtrt: 전일 대비율
     * stckPrdyClpr: 주식 전일 종가 (시가)
     * acmlVol: 누적 거래량
     * acmlTrPbmn: 누적 거래대금
     * htsKorIsnm: HTS 한글 종목명
     * stckPrpr: 주식 현재가
     * output2(과거)
     * stckBsopDate: 주식 영업 일자
     * stckCntgHour: 주식 체결 시간
     * stckPrpr: 현재가
     * stck_oprc: 주식 시가2
     * stckHgpr: 주식 최고가
     * stckLwpr: 주식 최저가
     * cntg_vol: 체결 거래량
     * acmlVol: 누적 거래량
     * acml_tr_pdmn: 누적 거래대금
     */
    @JsonProperty("output1")
    private KorStock213Output1 output1;
    @JsonProperty("output2")
    private List<KorStock213Output2> output2;

    public KorStock213Dto() {
    }

    public KorStock213Dto(KorStock213Output1 output1, List<KorStock213Output2> output2) {
        this.output1 = output1;
        this.output2 = output2;
    }

    public KorStock213Output1 getOutput1() {
        return output1;
    }

    public void setOutput1(KorStock213Output1 output1) {
        this.output1 = output1;
    }

    public List<KorStock213Output2> getOutput2() {
        return output2;
    }

    public void setOutput2(List<KorStock213Output2> output2) {
        this.output2 = output2;
    }

   @Override
    public String toString() {
        return "KorStock213Dto{" +
                "output1=" + output1 +
                ", output2=" + output2 +
                '}';
    }
}
