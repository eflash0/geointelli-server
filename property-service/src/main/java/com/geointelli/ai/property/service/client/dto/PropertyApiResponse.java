package com.geointelli.ai.property.service.client.dto;

import java.util.List;

import lombok.Data;

@Data
public class PropertyApiResponse {
    private Assessment assessment;
    private Benefit benefit;
    private Building building;
    private ExtraFeature extraFeature;
    private Land land;
    private MailingAddress mailingAddress;
    private List<OwnerInfo> ownerInfos;
    private PropertyInfo propertyInfo;
    private Integer rollYear1;
    private List<SalesInfo> salesInfos;
    private List<SiteAddress> siteAddress;
    private Taxable taxable;
    private String message;
}