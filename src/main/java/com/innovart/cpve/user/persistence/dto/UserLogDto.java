package com.innovart.cpve.user.persistence.dto;

import com.innovart.cpve.user.persistence.entity.User;
import lombok.Data;

import java.util.Optional;

/**
 * DTO para iniciar sesion usuarios
 */
@Data
public class UserLogDto {

    private String username;

    private String password;

    private String grant;

    public UserLogDto(Optional<User> user) {
        this.username = user.get().getUsername();
        this.password = user.get().getPassword();
        this.grant = user.get().getGrant();
    }

}
