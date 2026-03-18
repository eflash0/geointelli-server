package com.geointelli.ai.property.service.mapper;

import org.mapstruct.Mapper;

import com.geointelli.ai.property.service.dto.OwnerDTO;
import com.geointelli.ai.property.service.entity.Owner;

@Mapper(componentModel = "spring")
public interface OwnerMapper {

    OwnerDTO toDTO(Owner owner);
}
