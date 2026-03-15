package com.geointelli.ai.property.service.Mapper;

import org.mapstruct.Mapper;

import com.geointelli.ai.property.service.DTO.SaleDTO;
import com.geointelli.ai.property.service.Entity.Sale;

@Mapper(componentModel = "spring")
public interface SaleMapper {

    SaleDTO toDTO(Sale sale);
}