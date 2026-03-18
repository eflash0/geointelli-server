package com.geointelli.ai.property.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bedatadriven.jackson.datatype.jts.JtsModule;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class JacksonConfig {
    @Bean
    public ObjectMapper ObjectMapper(){
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JtsModule());
        return mapper;
    }
}