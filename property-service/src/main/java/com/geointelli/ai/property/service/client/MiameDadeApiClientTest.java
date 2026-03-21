package com.geointelli.ai.property.service.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.geointelli.ai.property.service.client.dto.PropertyApiResponse;

public class MiameDadeApiClientTest {
    public static void main(String[] args) throws Exception {
        MiameDadeApiClient miameDadeApiClient = new MiameDadeApiClient();
        String response = miameDadeApiClient.importMiameDadePropertyDetails("0131330131540")
                            .block();
        ObjectMapper mapper = new ObjectMapper();
        PropertyApiResponse property = mapper.readValue(response, PropertyApiResponse.class);

        // String jsonFormat = mapper
        //         .enable(SerializationFeature.INDENT_OUTPUT)
        //         .writeValueAsString(json);

        System.out.println(property.getOwnerInfos().get(0));
    }
}
