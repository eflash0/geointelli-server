package com.geointelli.ai.property.service.service;

import com.geointelli.ai.property.service.entity.Property;

public interface PropertyService {
    public Property saveProperty(Property property);
    public Property getByFolio(String folio);
}