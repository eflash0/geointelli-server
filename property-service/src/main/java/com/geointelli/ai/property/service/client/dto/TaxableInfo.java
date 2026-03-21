package com.geointelli.ai.property.service.client.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxableInfo {

    @JsonProperty("CityExemptionValue")
    private BigDecimal cityExemptionValue;

    @JsonProperty("CityTaxableValue")
    private BigDecimal cityTaxableValue;

    @JsonProperty("CountyExemptionValue")
    private BigDecimal countyExemptionValue;

    @JsonProperty("CountyTaxableValue")
    private BigDecimal countyTaxableValue;

    @JsonProperty("RegionalExemptionValue")
    private BigDecimal regionalExemptionValue;

    @JsonProperty("RegionalTaxableValue")
    private BigDecimal regionalTaxableValue;

    @JsonProperty("SchoolExemptionValue")
    private BigDecimal schoolExemptionValue;

    @JsonProperty("SchoolTaxableValue")
    private BigDecimal schoolTaxableValue;

    @JsonProperty("Year")
    private Integer year;

    @JsonProperty("Message")
    private String message;
} 
