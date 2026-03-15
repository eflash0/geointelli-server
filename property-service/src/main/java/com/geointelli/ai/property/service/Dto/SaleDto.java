package com.geointelli.ai.property.service.DTO;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class SaleDTO {

    private LocalDate saleDate;

    private BigDecimal salePrice;

}