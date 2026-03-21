package com.geointelli.ai.property.service.mapper.external;

import org.mapstruct.Mapper;

import com.geointelli.ai.property.service.client.dto.SalesInfo;
import com.geointelli.ai.property.service.config.IgnoreUnmappedMapperConfig;
import com.geointelli.ai.property.service.dto.SaleDTO;

@Mapper(componentModel = "spring", config = IgnoreUnmappedMapperConfig.class)
public interface ExternalSaleMapper {

    SaleDTO toDTO(SalesInfo saleInfo);
}