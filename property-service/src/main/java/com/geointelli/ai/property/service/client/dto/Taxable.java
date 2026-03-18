package com.geointelli.ai.property.service.client.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.security.auth.message.MessageInfo;

public class Taxable {
    @JsonProperty("TaxableInfos")
    private List<TaxableInfo> taxableInfos;

    @JsonProperty("Messages")
    private List<MessageInfo> messages;
}
