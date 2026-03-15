package com.geointelli.ai.property.service.Mapper;

import org.mapstruct.Mapper;

import com.geointelli.ai.property.service.DTO.AddressDTO;
import com.geointelli.ai.property.service.Entity.Address;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    AddressDTO toDTO(Address address);
}
