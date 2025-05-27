package io.cavia.homenet.client;

import io.cavia.homenet.dto.response.*;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

public class RestWebClient {

    private final WebClient webClient;
    private final ApiOAuthManager apiOAuthManager;

    public RestWebClient(WebClient webClient, ApiOAuthManager apiOAuthManager) {
        this.webClient = webClient;
        this.apiOAuthManager = apiOAuthManager;
    }

    /**
     * 해당하는 주식 고유 번호의 주식기본정보를 Api로부터 가져와 문자열로 반환
     * <a href="https://apiportal.koreainvestment.com/apiservice-apiservice?/uapi/domestic-stock/v1/quotations/search-stock-info">주식기본조회[v1_국내주식-067]</a>
     * REST API URL : /uapi/domestic-stock/v1/quotations/search-stock-info
     *
     * @param pdno 주식고유번호
     * @return Api 응답 Json 문자열
     */

    public KorStock046Dto searchStockInfo046(String pdno) {
        /**
         * 종목별 외인 추정가 집계
         * 외국인 수량
         * 기관 수량
         * 합산 수량
         */
        try {
            String accessToken = apiOAuthManager.getAccessToken();
            KorStock046Dto korStock046Dto = webClient.get()
                    .uri(uriBuilder -> uriBuilder
                            .path("/uapi/domestic-stock/v1/quotations/investor-trend-estimate")
                            .queryParam("MKSC_SHRN_ISCD", pdno)
                            .build())
                    .header(HttpHeaders.CONTENT_TYPE, "application/json; charset=utf-8") // GET 요청시는 이렇게
                    .header(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken)
                    .header("appkey", apiOAuthManager.getAppKey())
                    .header("appsecret", apiOAuthManager.getAppSecret())
                    .header("tr_id", "HHPTJ04160200")
                    .header("custtype", "P")
                    .retrieve() // 요청 보내고, 성공하면 응답 바디를 가져올 준비를 하고, 실패하면 예외를 던짐
                    .bodyToMono(KorStock046Dto.class)
                    .block();
            return korStock046Dto;
        } catch (WebClientResponseException e) {
            System.out.println("API 호출 중 에러 발생!");
            System.out.println("Status Code: " + e.getStatusCode());
            String errorBody = e.getResponseBodyAsString();
            throw new RuntimeException("API 호출 실패: " + errorBody, e);
        } catch (Exception e) {
            throw new RuntimeException("메서드 실행중 예외 발생: " + e.getMessage(), e);
        }
    }

    public KorStock067Dto searchStockInfo067(String pdno) {
        /**
         * 주식 기본 정보 요청 : Get
         * 종목코드
         * 종목명
         * 업종코드
         */
        try {
            String accessToken = apiOAuthManager.getAccessToken();
            KorStock067Dto korStock067Dto = webClient.get()
                    .uri(uriBuilder -> uriBuilder
                            .path("/uapi/domestic-stock/v1/quotations/search-stock-info")
                            .queryParam("PRDT_TYPE_CD", "300")
                            .queryParam("PDNO", pdno)
                            .build())
                    .header(HttpHeaders.CONTENT_TYPE, "application/json; charset=utf-8") // GET 요청시는 이렇게
                    .header(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken)
                    .header("appkey", apiOAuthManager.getAppKey())
                    .header("appsecret", apiOAuthManager.getAppSecret())
                    .header("tr_id", "CTPF1002R")
                    .header("custtype", "P")
                    .retrieve() // 요청 보내고, 성공하면 응답 바디를 가져올 준비를 하고, 실패하면 예외를 던짐
                    .bodyToMono(KorStock067Dto.class)
                    .block();
            return korStock067Dto;
        } catch (WebClientResponseException e) {
            System.out.println("API 호출 중 에러 발생!");
            System.out.println("Status Code: " + e.getStatusCode());
            String errorBody = e.getResponseBodyAsString();
            throw new RuntimeException("API 호출 실패: " + errorBody, e);
        } catch (Exception e) {
            throw new RuntimeException("메서드 실행중 예외 발생: " + e.getMessage(), e);
        }
    }

    public KorStock145Dto searchStockInfo145(String code, String start, String end) {
        /**
         * 예탁원정보(배당일정)
         * CTS: 공백
         * GB1: 조회구분 (0: 배당전체 1: 결산배당 2: 중간배당)
         * F_DT: 조회일자From
         * T_DT: 조회일자To
         * SHT_CD: 종목코드
         * HIGH_GB: 공백
         */
        try {
            String accessToken = apiOAuthManager.getAccessToken();
            KorStock145Dto korStock145Dto = webClient.get()
                    .uri(uriBuilder -> uriBuilder
                            .path("/uapi/domestic-stock/v1/ksdinfo/dividend")
                            .queryParam("CTS", "")
                            .queryParam("GB1", "0")
                            .queryParam("F_DT", start)
                            .queryParam("T_DT", end)
                            .queryParam("SHT_CD", code)
                            .queryParam("HIGH_GB", "")
                            .build())
                    .header(HttpHeaders.CONTENT_TYPE, "application/json; charset=utf-8") // GET 요청시는 이렇게
                    .header(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken)
                    .header("appkey", apiOAuthManager.getAppKey())
                    .header("appsecret", apiOAuthManager.getAppSecret())
                    .header("tr_id", "HHKDB669102C0")
                    .header("custtype", "P")
                    .retrieve() // 요청 보내고, 성공하면 응답 바디를 가져올 준비를 하고, 실패하면 예외를 던짐
                    .bodyToMono(KorStock145Dto.class)
                    .block();
            return korStock145Dto;
        } catch (WebClientResponseException e) {
            System.out.println("API 호출 중 에러 발생!");
            System.out.println("Status Code: " + e.getStatusCode());
            String errorBody = e.getResponseBodyAsString();
            throw new RuntimeException("API 호출 실패: " + errorBody, e);
        } catch (Exception e) {
            throw new RuntimeException("메서드 실행중 예외 발생: " + e.getMessage(), e);
        }
    }

    public KorStock150Dto searchStockInfo150(String code, String start, String end) {
        /**
         * 예탁원정보(배당일정)
         * SHT_CD: 종목코드
         * T_DT: 조회일자TO
         * F_DT: 조회일자From
         * CTS: 공백
         */
        try {
            String accessToken = apiOAuthManager.getAccessToken();
            KorStock150Dto korStock150Dto = webClient.get()
                    .uri(uriBuilder -> uriBuilder
                            .path("/uapi/domestic-stock/v1/ksdinfo/list-info")
                            .queryParam("SHT_CD", code)
                            .queryParam("T_DT", end)
                            .queryParam("F_DT", start)
                            .queryParam("CTS", "")
                            .build())
                    .header(HttpHeaders.CONTENT_TYPE, "application/json; charset=utf-8") // GET 요청시는 이렇게
                    .header(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken)
                    .header("appkey", apiOAuthManager.getAppKey())
                    .header("appsecret", apiOAuthManager.getAppSecret())
                    .header("tr_cont", "")
                    .header("tr_id", "HHKDB669107C0")
                    .header("custtype", "P")
                    .retrieve() // 요청 보내고, 성공하면 응답 바디를 가져올 준비를 하고, 실패하면 예외를 던짐
                    .bodyToMono(KorStock150Dto.class)
                    .block();
            return korStock150Dto;
        } catch (WebClientResponseException e) {
            System.out.println("API 호출 중 에러 발생!");
            System.out.println("Status Code: " + e.getStatusCode());
            String errorBody = e.getResponseBodyAsString();
            throw new RuntimeException("API 호출 실패: " + errorBody, e);
        } catch (Exception e) {
            throw new RuntimeException("메서드 실행중 예외 발생: " + e.getMessage(), e);
        }
    }

    public KorStock213Dto searchStockInfo213(String pdno, String date, String hour) {
        /**
         * 주식 일별 일봉 조회
         * FID_COND_MRKT_DIV_CODE: 시장 분류 조건 코드
         * FID_INPUT_ISCD: 입력 조건 코드
         * FID_INPUT_HOUR_1: 입력 시간1
         * FID_INPUT_DATE_1: 입력 날짜1
         * FID_PW_DATA_INCU_YN: 과거 데이터 포함 여부 (N, Y)
         * FID_FAKE_TICK_INCU_YN: 허봉 포함 여부 (공백)
         */
        try {
            String accessToken = apiOAuthManager.getAccessToken();
            KorStock213Dto korStock213Dto = webClient.get()
                    .uri(uriBuilder -> uriBuilder
                            .path("/uapi/domestic-stock/v1/quotations/inquire-time-dailychartprice")
                            .queryParam("FID_COND_MRKT_DIV_CODE", "J")
                            .queryParam("FID_INPUT_ISCD", pdno)
                            .queryParam("FID_INPUT_HOUR_1", hour)
                            .queryParam("FID_INPUT_DATE_1", date)
                            .queryParam("FID_PW_DATA_INCU_YN", "Y")
                            .queryParam("FID_FAKE_TICK_INCU_YN", "")
                            .build())
                    .header(HttpHeaders.CONTENT_TYPE, "application/json; charset=utf-8") // GET 요청시는 이렇게
                    .header(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken)
                    .header("appkey", apiOAuthManager.getAppKey())
                    .header("appsecret", apiOAuthManager.getAppSecret())
                    .header("tr_id", "FHKST03010230")
                    .header("custtype", "P")
                    .retrieve() // 요청 보내고, 성공하면 응답 바디를 가져올 준비를 하고, 실패하면 예외를 던짐
                    .bodyToMono(KorStock213Dto.class)
                    .block();
            return korStock213Dto;
        } catch (WebClientResponseException e) {
            System.out.println("API 호출 중 에러 발생!");
            System.out.println("Status Code: " + e.getStatusCode());
            String errorBody = e.getResponseBodyAsString();
            throw new RuntimeException("API 호출 실패: " + errorBody, e);
        } catch (Exception e) {
            throw new RuntimeException("메서드 실행중 예외 발생: " + e.getMessage(), e);
        }
    }


}
