package com.geointelli.ai.property.service.mapper;

import org.mapstruct.Mapper;

import com.geointelli.ai.property.service.dto.TaxDTO;
import com.geointelli.ai.property.service.entity.TaxRecord;

@Mapper(componentModel = "spring")
public interface TaxMapper {

    TaxDTO toDTO(TaxRecord tax);
}
