package com.innovart.cpve.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "CPVE_ADMIN")
public class Admin {

    @Id
    @Column(name = "IDADMIN")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAdmin;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

    @Column(name = "REGISTRATION_DATE")
    private LocalDateTime registrationDate;

}
