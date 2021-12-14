package com.innovart.cpve.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "CPVE_ROLES")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDROLES")
    private Long idRol;

    @Column(name = "NAME")
    private String name;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

}
