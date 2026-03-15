package com.geointelli.ai.property.service.Mapper;
import org.mapstruct.Mapper;

import com.geointelli.ai.property.service.DTO.PropertyDTO;
import com.geointelli.ai.property.service.Entity.Property;

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
        })
public interface PropertyMapper {

    PropertyDTO toDTO(Property property);
}
