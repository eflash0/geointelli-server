package com.geointelli.ai.property.service.client.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AssessmentInfo {
    @JsonProperty("AssessedValue")
    private BigDecimal assessedValue;

    @JsonProperty("BuildingOnlyValue")
    private BigDecimal buildingOnlyValue;

    @JsonProperty("ExtraFeatureValue")
    private BigDecimal extraFeatureValue;

    @JsonProperty("LandValue")
    private BigDecimal landValue;

    @JsonProperty("TotalValue")
    private BigDecimal totalValue;

    @JsonProperty("Year")
    private Integer year;

    @JsonProperty("Message")
    private String message;
}
