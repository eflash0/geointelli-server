package com.geointelli.ai.property.service.dto;

import lombok.Data;

@Data
public class TaxDTO {

    private Integer year;

    private Long taxableValue;

    private Long taxAmount;

    private Long exemptions;

}