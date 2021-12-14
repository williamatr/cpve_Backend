package com.innovart.cpve.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "CPVE_CATEGORIES_PROJECTS")
public class CategoriesProject {

    @Id
    @Column(name = "IDCATEGORIES_PROJECTS")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCategoriesProjects;

    @ManyToOne
    @JoinColumn(name = "IDPROJECTS", insertable = false, updatable = false)
    private Project project;

    @ManyToOne
    @JoinColumn(name = "IDCATEGORIES", insertable = false, updatable = false)
    private Category category;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

}
