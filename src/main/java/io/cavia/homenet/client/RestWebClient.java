package io.cavia.homenet.client;

import io.cavia.homenet.dto.response.KorStock046Dto;
import io.cavia.homenet.dto.response.KorStock067Dto;
import io.cavia.homenet.dto.response.KorStock213Dto;
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
    public KorStock067Dto searchStockInfo067 (String pdno) {

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

    public KorStock046Dto searchStockInfo046 (String pdno) {

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

    public KorStock213Dto searchStockInfo213 (String pdno, String date, String hour) {

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
