package com.geointelli.ai.property.service.dto;

import lombok.Data;

@Data
public class AssessmentDTO {

    private Integer year;

    private Long landValue;

    private Long buildingValue;

    private Long extraFeatureValue;

    private Long totalValue;
}
