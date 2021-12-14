package com.innovart.cpve.user.persistence.entity;

import com.innovart.cpve.entity.Rol;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "CPVE_USERS")
public class User {

    @Id
    @Column(name = "IDUSERS")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUser;

    @ManyToOne
    @JoinColumn(name = "IDROLES", insertable = false, updatable = false)
    private Rol rol;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

    @Column(name = "REGISTRATION_DATE")
    private LocalDateTime registrationDate;

}
