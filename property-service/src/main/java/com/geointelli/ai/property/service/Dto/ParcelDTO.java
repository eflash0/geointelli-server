package com.geointelli.ai.property.service.dto;

import org.locationtech.jts.geom.MultiPolygon;

import lombok.Data;
@Data
public class ParcelDTO {
    private String folio;

    private MultiPolygon geom;
}
