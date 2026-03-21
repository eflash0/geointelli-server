package com.geointelli.ai.property.service.client.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BuildingInfo {
    @JsonProperty("Actual")
    private Integer actual;

    @JsonProperty("ActualArea")
    private Integer actualArea;

    @JsonProperty("AdjustedBasePrice")
    private Double adjustedBasePrice;

    @JsonProperty("BuildingNo")
    private Integer buildingNo;

    @JsonProperty("DepreciatedValue")
    private BigDecimal depreciatedValue;

    @JsonProperty("Effective")
    private Integer effective;

    @JsonProperty("EffectiveArea")
    private Integer effectiveArea;

    @JsonProperty("GrossArea")
    private Integer grossArea;

    @JsonProperty("HeatedArea")
    private Integer heatedArea;

    @JsonProperty("Message")
    private String message;

    @JsonProperty("PercentComp")
    private Double percentComp;

    @JsonProperty("PercentageGood")
    private Double percentageGood;

    @JsonProperty("ReplacementCostNew")
    private BigDecimal replacementCostNew;

    @JsonProperty("RollYear")
    private Integer rollYear;

    @JsonProperty("SegNo")
    private Integer segNo;

    @JsonProperty("TotalAdjustedPoints")
    private Integer totalAdjustedPoints;

    @JsonProperty("TraversePoints")
    private String traversePoints;

    @JsonProperty("improvementModelDesc")
    private String improvementModelDesc;
}
