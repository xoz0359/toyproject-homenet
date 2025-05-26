package io.cavia.homenet.config;

import io.cavia.homenet.client.ApiOAuthManager;
import io.cavia.homenet.client.ApiWebSocketClient;
import io.cavia.homenet.client.ApiWebSocketHandler;
import io.cavia.homenet.client.RestWebClient;
import io.cavia.homenet.mapper.KorOrderRealTimeMapper;
import io.cavia.homenet.mapper.KorStockRealTimeMapper;
import io.cavia.homenet.repository.ApiOAuthRepository;
import io.cavia.homenet.client.ApiOAuthManager;
import io.cavia.homenet.client.RestWebClient;
import io.cavia.homenet.mapper.KorOrderRealTimeMapper;
import io.cavia.homenet.mapper.KorStockRealTimeMapper;
import io.cavia.homenet.repository.ApiOAuthRepository;
import jakarta.persistence.EntityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.socket.client.WebSocketClient;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;

@Configuration
public class SpringConfig {

    private final EntityManager em;
    private final WebClient.Builder webClientBuilder;

    public SpringConfig(WebClient.Builder webClientBuilder, EntityManager em) {
        this.webClientBuilder = webClientBuilder;
        this.em = em;
    }


    @Bean
    public WebClient webClient() {
        return webClientBuilder
                .baseUrl("https://openapi.koreainvestment.com:9443")
                .build();
    }

    @Bean
    public WebSocketClient webSocketClient() {
        return new StandardWebSocketClient();
    }

    @Bean
    public ApiWebSocketHandler apiWebSocketHandler() {
        return new ApiWebSocketHandler();
    }

    @Bean
    public ApiWebSocketClient apiWebSocketClient() {
        return new ApiWebSocketClient(webSocketClient(), apiWebSocketHandler(), apiOAuthManager());
    }

    @Bean

    public RestWebClient restWebClient() {
        return new RestWebClient(webClient(), apiOAuthManager());
    }

    @Bean
    public ApiOAuthManager apiOAuthManager() {
        return new ApiOAuthManager(webClient(), apiOAuthRepository());
    }

    @Bean
    public ApiOAuthRepository apiOAuthRepository() {
        return new ApiOAuthRepository(em);
    }

    @Bean
    public KorStockRealTimeMapper korStockRealTimeMapper() {
        return new KorStockRealTimeMapper();
    }

    @Bean
    public KorOrderRealTimeMapper korOrderRealTimeMapper() {
        return new KorOrderRealTimeMapper();
    }
}
