package com.geointelli.ai.property.service.client.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PropertyApiResponse {

    @JsonProperty("Assessment")
    private Assessment assessment;

    @JsonProperty("Benefit")
    private Benefit benefit;

    @JsonProperty("Building")
    private Building building;

    @JsonProperty("ExtraFeature")
    private ExtraFeature extraFeature;

    @JsonProperty("Land")
    private Land land;

    @JsonProperty("MailingAddress")
    private MailingAddress mailingAddress;

    @JsonProperty("OwnerInfos")
    private List<OwnerInfo> ownerInfos;

    @JsonProperty("PropertyInfo")
    private PropertyInfo propertyInfo;

    @JsonProperty("RollYear1")
    private Integer rollYear1;

    @JsonProperty("SalesInfos")
    private List<SalesInfo> salesInfos;

    @JsonProperty("SiteAddress")
    private List<SiteAddress> siteAddress;

    @JsonProperty("Taxable")
    private Taxable taxable;

    // private String message;
}