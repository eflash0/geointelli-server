package com.geointelli.ai.property.service.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import com.geointelli.ai.property.service.DTO.ParcelDTO;
import com.geointelli.ai.property.service.Entity.Parcel;

import org.locationtech.jts.geom.MultiPolygon;
import org.locationtech.jts.io.geojson.GeoJsonWriter;

@Mapper(componentModel = "spring")
public interface ParcelMapper {

    @Mapping(source = "geom", target = "geometryGeoJson", qualifiedByName = "geometryToGeoJson")
    ParcelDTO toDTO(Parcel parcel);

    @Named("geometryToGeoJson")
    default String geometryToGeoJson(MultiPolygon geometry) {
        if (geometry == null) return null;
        GeoJsonWriter writer = new GeoJsonWriter();
        return writer.write(geometry);
    }
}