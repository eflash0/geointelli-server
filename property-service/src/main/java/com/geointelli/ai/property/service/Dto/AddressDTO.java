package com.geointelli.ai.property.service.dto;

import lombok.Data;

@Data
public class AddressDTO {
    private String streetNumber;

    private String streetName;

    private String unit;

    private String city;

    private String state;

    private String zip;

}
