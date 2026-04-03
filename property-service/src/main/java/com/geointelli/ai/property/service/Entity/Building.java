package com.geointelli.ai.property.service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "buildings")
@Getter
@Setter
@ToString
public class Building {

    @Id
    @GeneratedValue
    private Long id;

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

    @ManyToOne
    private Property property;
}