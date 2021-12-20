package com.innovart.cpve.user.persistence.dto;

import lombok.Data;

/**
 * DTO para autenticar usuario
 */
@Data
public class UserAuthDto {

    private String username;

    private String password;

}
