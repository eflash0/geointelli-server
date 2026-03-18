package com.geointelli.ai.property.service.mapper;

import org.mapstruct.Mapper;

import com.geointelli.ai.property.service.dto.AddressDTO;
import com.geointelli.ai.property.service.entity.Address;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    AddressDTO toDTO(Address address);
}
