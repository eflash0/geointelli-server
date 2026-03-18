package com.geointelli.ai.property.service.client;

import java.net.http.HttpClient;

import org.springframework.web.reactive.function.client.WebClient;

public class MiameDadeApiClient {
    private final WebClient client;

    public MiameDadeApiClient(){
        // HttpClient httpClient = HttpClient.
        client = WebClient.create("https://apps.miamidadepa.gov/PApublicServiceProxy/PaServicesProxy.ashx");
    }
    public void importMiameDadePropertyToDB(){

    }
}