package com.innovart.cpve.user.persistence.dto;

import lombok.Data;

@Data
public class UserPostDto {
    private Long idRol;

    private String username;

    private String email;

    private String phone;

    private String name;

    private String lastName;

    private String country;

    private String city;

    private String password;

}
