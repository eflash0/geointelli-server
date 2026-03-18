package com.geointelli.ai.property.service.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SiteAddress {

    @JsonProperty("Address")
    private String address;

    @JsonProperty("BuildingNumber")
    private int buildingNumber;

    @JsonProperty("City")
    private String city;

    @JsonProperty("HouseNumberSuffix")
    private String houseNumberSuffix;

    @JsonProperty("Message")
    private String message;

    @JsonProperty("StreetName")
    private String streetName;

    @JsonProperty("StreetNumber")
    private int streetNumber;

    @JsonProperty("StreetPrefix")
    private String streetPrefix;

    @JsonProperty("StreetSuffix")
    private String streetSuffix;

    @JsonProperty("StreetSuffixDirection")
    private String streetSuffixDirection;

    @JsonProperty("Unit")
    private String unit;

    @JsonProperty("Zip")
    private String zip;
}
