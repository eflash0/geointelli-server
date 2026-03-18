package com.geointelli.ai.property.service.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OwnerInfo {
    @JsonProperty("Name")
    private String name;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("Role")
    private String role;

    @JsonProperty("PercentageOwn")
    private Integer percentageOwn;

    @JsonProperty("ShortDescription")
    private String shortDescription;

    @JsonProperty("TenancyCd")
    private String tenancyCd;

    @JsonProperty("MarriedFlag")
    private Boolean marriedFlag;

    @JsonProperty("Message")
    private String message;
}
