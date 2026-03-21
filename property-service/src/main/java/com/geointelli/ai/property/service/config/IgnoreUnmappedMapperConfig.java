package com.geointelli.ai.property.service.config;

import org.mapstruct.MapperConfig;
import org.mapstruct.ReportingPolicy;

@MapperConfig(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public class IgnoreUnmappedMapperConfig { 
}
