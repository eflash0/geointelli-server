package com.geointelli.ai.property.service.DTO;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class TaxDTO {

    private Integer taxYear;

    private BigDecimal taxAmount;

}