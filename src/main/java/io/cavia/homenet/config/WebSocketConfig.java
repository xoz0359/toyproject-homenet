package io.cavia.homenet.config;

import io.cavia.homenet.client.ApiWebSocketHandler;
import io.cavia.homenet.controller.CaviaWebSocketHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    private final CaviaWebSocketHandler caviaWebSocketHandler;

    public WebSocketConfig(CaviaWebSocketHandler caviaWebSocketHandler) {
        this.caviaWebSocketHandler = caviaWebSocketHandler;
    }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(caviaWebSocketHandler, "/websocket").setAllowedOrigins("*");
    }

}
