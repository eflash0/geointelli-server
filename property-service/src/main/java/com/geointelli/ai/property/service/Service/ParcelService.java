package com.geointelli.ai.property.service.service;

import java.util.List;

import com.geointelli.ai.property.service.dto.ParcelDTO;


public interface ParcelService {

    public List<ParcelDTO> getParcelsWithinBoundingBox(double xmin,double ymin,double xmax,double ymax);
}
