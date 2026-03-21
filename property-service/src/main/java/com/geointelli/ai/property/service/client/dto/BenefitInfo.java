package com.geointelli.ai.property.service.client.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BenefitInfo {
    @JsonProperty("Description")
    private String description;

    @JsonProperty("Message")
    private String message;

    @JsonProperty("Seq")
    private String seq;

    @JsonProperty("TaxYear")
    private Integer taxYear;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Url")
    private String url;

    @JsonProperty("Value")
    private BigDecimal value;
}
