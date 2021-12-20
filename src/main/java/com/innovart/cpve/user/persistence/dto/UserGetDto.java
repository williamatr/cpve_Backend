package com.innovart.cpve.user.persistence.dto;

import com.innovart.cpve.user.persistence.entity.User;
import lombok.Data;

import java.util.Optional;

@Data
public class UserGetDto {
    private Long idUser;

    private Long idRol;

    private String email;

    private String phone;

    private String name;

    private String lastName;

    private String country;

    private String city;

    private Integer stateActive;

    public UserGetDto(User user) {
        this.idUser = user.getIdUser();
        this.idRol = user.getIdRol();
        this.email = user.getEmail();
        this.phone = user.getPhone();
        this.name = user.getName();
        this.lastName = user.getLastName();
        this.country = user.getCountry();
        this.city = user.getCity();
        this.stateActive = user.getStateActive();
    }

    public UserGetDto(Optional<User> user) {
        this.idUser = user.get().getIdUser();
        this.idRol = user.get().getIdRol();
        this.email = user.get().getEmail();
        this.phone = user.get().getPhone();
        this.name = user.get().getName();
        this.lastName = user.get().getLastName();
        this.country = user.get().getCountry();
        this.city = user.get().getCity();
        this.stateActive = user.get().getStateActive();
    }
}
