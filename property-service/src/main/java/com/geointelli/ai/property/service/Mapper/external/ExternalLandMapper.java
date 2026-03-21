package com.geointelli.ai.property.service.mapper.external;

import org.mapstruct.Mapper;

import com.geointelli.ai.property.service.client.dto.Landline;
import com.geointelli.ai.property.service.config.IgnoreUnmappedMapperConfig;
import com.geointelli.ai.property.service.dto.LandDTO;

@Mapper(componentModel = "spring", config = IgnoreUnmappedMapperConfig.class)
public interface ExternalLandMapper {
    LandDTO toDTO(Landline landline);
}
