package com.geointelli.ai.property.service.Mapper;

import org.mapstruct.Mapper;

import com.geointelli.ai.property.service.DTO.AssessmentDTO;
import com.geointelli.ai.property.service.Entity.Assessment;

@Mapper(componentModel = "spring")
public interface AssessmentMapper {
    AssessmentDTO toDTO(Assessment assessment);
}
