package com.geointelli.ai.property.service.client.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MailingAddress {

    @JsonProperty("Address1")
    private String address1;

    @JsonProperty("Address2")
    private String address2;

    @JsonProperty("Address3")
    private String address3;

    @JsonProperty("City")
    private String city;

    @JsonProperty("Country")
    private String country;

    @JsonProperty("Message")
    private String message;

    @JsonProperty("State")
    private String state;

    @JsonProperty("ZipCode")
    private String zipCode;
}
