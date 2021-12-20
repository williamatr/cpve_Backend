package com.innovart.cpve.user.persistence.dto;

import lombok.Data;

@Data
public class UserPutDto {
    private Long idRol;

    private String email;

    private String phone;

    private String name;

    private String lastName;

    private String country;

    private String city;

    private Integer stateActive;

}
