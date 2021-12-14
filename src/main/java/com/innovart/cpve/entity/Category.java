package com.innovart.cpve.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "CPVE_CATEGORIES")
public class Category {

    @Id
    @Column(name = "IDCATEGORIES")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCategory;

    @Column(name = "NAME")
    private String name;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

}
