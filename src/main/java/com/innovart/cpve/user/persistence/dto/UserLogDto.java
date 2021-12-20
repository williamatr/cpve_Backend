package com.innovart.cpve.user.persistence.dto;

import lombok.Data;

/**
 * DTO para iniciar sesion usuarios
 */
@Data
public class UserLogDto {

    private String username;

    private String password;

    private String grant;

}
