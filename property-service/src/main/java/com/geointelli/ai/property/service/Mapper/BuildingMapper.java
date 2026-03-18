package com.geointelli.ai.property.service.mapper;

import org.mapstruct.Mapper;

import com.geointelli.ai.property.service.dto.BuildingDTO;
import com.geointelli.ai.property.service.entity.Building;

@Mapper(componentModel = "spring")
public interface BuildingMapper {
    BuildingDTO toDTO(Building building);
}
