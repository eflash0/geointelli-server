package com.geointelli.ai.property.service.client.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Benefit {
    @JsonProperty("BenefitInfos")
    private List<BenefitInfo> benefitInfos;
}