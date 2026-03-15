package com.geointelli.ai.property.service.Mapper;

import org.mapstruct.Mapper;

import com.geointelli.ai.property.service.DTO.TaxDTO;
import com.geointelli.ai.property.service.Entity.TaxRecord;

@Mapper(componentModel = "spring")
public interface TaxMapper {

    TaxDTO toDTO(TaxRecord tax);
}
