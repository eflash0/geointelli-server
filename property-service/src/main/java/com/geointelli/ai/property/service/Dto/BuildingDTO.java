package com.geointelli.ai.property.service.dto;

import lombok.Data;

@Data
public class BuildingDTO {

    private Integer actualYearBuilt;

    private Integer effectiveYearBuilt;

    private Integer grossArea;

    private Integer heatedArea;

    private Integer stories;

    private String constructionType;

    private String roofType;

    private String exteriorWall;

    private String quality;

    private String condition;

    private Double replacementCost;
}

