package com.geointelli.ai.property.service.client;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;

import io.netty.channel.ChannelOption;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;

public class MiameDadeApiClient {
    private final WebClient client;
    private String baseUrl;
    public MiameDadeApiClient(){
        HttpClient httpClient = HttpClient.create()
                                .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 50000)
                                .responseTimeout(Duration.ofMillis(5000))
                                .doOnConnected(conn -> 
                                    conn.addHandlerLast(new ReadTimeoutHandler(5000, TimeUnit.MILLISECONDS))
                                    .addHandlerLast(new WriteTimeoutHandler(5000, TimeUnit.MILLISECONDS)));
                                             
        baseUrl = "https://apps.miamidadepa.gov/PApublicServiceProxy/PaServicesProxy.ashx";  
        
        client = WebClient.builder().baseUrl(baseUrl)
                .clientConnector(new ReactorClientHttpConnector(httpClient))
                .build();   
    }
    public Mono<String> importMiameDadePropertyDetails(String folio){
        Mono<String> maiameDadeResponse = client.get().uri(uriBuilder -> uriBuilder
            .path("/PApublicServiceProxy/PaServicesProxy.ashx")
            .queryParam("Operation", "GetPropertySearchByFolio")
            .queryParam("clientAppName", "PropertySearch")
            .queryParam("folioNumber", folio).build()
        ).header(HttpHeaders.CONTENT_TYPE, "application/json")
        .acceptCharset(StandardCharsets.UTF_8)
        .exchangeToMono(response -> {
            if (response.statusCode().equals(HttpStatus.OK)) {
                return response.bodyToMono(String.class);
            }
            if (response.statusCode().is4xxClientError()) {
                return Mono.just("Client Error response");
            }
            else {
                return response.createException().flatMap(Mono::error);
            }
        });
        return maiameDadeResponse;
    }
}