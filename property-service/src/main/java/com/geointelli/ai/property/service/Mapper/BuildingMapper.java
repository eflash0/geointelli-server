package com.geointelli.ai.property.service.Mapper;

import org.mapstruct.Mapper;

import com.geointelli.ai.property.service.DTO.BuildingDTO;
import com.geointelli.ai.property.service.Entity.Building;

@Mapper(componentModel = "spring")
public interface BuildingMapper {
    BuildingDTO toDTO(Building building);
}
