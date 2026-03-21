package com.geointelli.ai.property.service.mapper;
import org.mapstruct.Mapper;

import com.geointelli.ai.property.service.config.IgnoreUnmappedMapperConfig;
import com.geointelli.ai.property.service.dto.PropertyDTO;
import com.geointelli.ai.property.service.entity.Property;

@Mapper(componentModel = "spring",
        uses = {
            OwnerMapper.class,
            AddressMapper.class,
            AssessmentMapper.class,
            BuildingMapper.class,
            LandMapper.class,
            SaleMapper.class,
            TaxMapper.class,
            ParcelMapper.class
        }, config = IgnoreUnmappedMapperConfig.class)
public interface PropertyMapper {

    PropertyDTO toDTO(Property property);
    Property toEntity(PropertyDTO propertyDTO);
}
