package com.geointelli.ai.property.service.Mapper;

import org.mapstruct.Mapper;

import com.geointelli.ai.property.service.DTO.LandDTO;
import com.geointelli.ai.property.service.Entity.Land;

@Mapper(componentModel = "spring")
public interface LandMapper {
    LandDTO toDTO(Land land);
}
