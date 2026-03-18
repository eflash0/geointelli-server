package com.geointelli.ai.property.service.client.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Land {
    @JsonProperty("Landlines")
    private List<Landline> landlines;
}
