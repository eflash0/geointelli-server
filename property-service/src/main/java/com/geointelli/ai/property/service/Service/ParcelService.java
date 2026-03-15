package com.geointelli.ai.property.service.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.geointelli.ai.property.service.DTO.ParcelDTO;
import com.geointelli.ai.property.service.Entity.Parcel;
import com.geointelli.ai.property.service.Mapper.ParcelMapper;
import com.geointelli.ai.property.service.Repository.ParcelRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ParcelService {
    private final ParcelRepository parcelRepository;
    private final ParcelMapper parcelMapper;

    public List<ParcelDTO> getParcelsWithinBoundingBox(double xmin,double ymin,double xmax,double ymax){
        List<Parcel> parcels = parcelRepository.findWithinBoundingBox(xmin,ymin,xmax,ymax);
        return parcels.stream().map(parcel -> parcelMapper.toDTO(parcel)).collect(Collectors.toList());
    }
}
