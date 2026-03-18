package com.geointelli.ai.property.service.mapper;

import org.mapstruct.Mapper;
import com.geointelli.ai.property.service.dto.ParcelDTO;
import com.geointelli.ai.property.service.entity.Parcel;
@Mapper(componentModel = "spring")
public interface ParcelMapper {

    ParcelDTO toDTO(Parcel parcel);
}