package com.geointelli.ai.property.service.dto;

import lombok.Data;

@Data
public class UserDTO {
    private Long id;

    private String keycloakUserId;

    private String username;

    private String email;

    private String firstName;

    private String lastName;
}
