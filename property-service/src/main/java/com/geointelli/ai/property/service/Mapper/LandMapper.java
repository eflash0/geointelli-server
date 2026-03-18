package com.geointelli.ai.property.service.mapper;

import org.mapstruct.Mapper;

import com.geointelli.ai.property.service.dto.LandDTO;
import com.geointelli.ai.property.service.entity.Land;

@Mapper(componentModel = "spring")
public interface LandMapper {
    LandDTO toDTO(Land land);
}
