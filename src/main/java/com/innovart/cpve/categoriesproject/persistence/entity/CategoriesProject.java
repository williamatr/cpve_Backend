package com.innovart.cpve.categoriesproject.persistence.entity;

import com.innovart.cpve.category.persistence.entity.Category;
import com.innovart.cpve.project.persistence.entity.Project;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "CPVE_CATEGORIES_PROJECTS")
public class CategoriesProject {

    @Id
    @Column(name = "IDCATEGORIES_PROJECTS")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sequence-generator"
    )
    @SequenceGenerator(
            name = "sequence-generator",
            sequenceName = "SEC_IDCATEGORIESPROJECTS",
            initialValue = 1001,
            allocationSize=1
    )
    private Long idCategoriesProjects;

    @Column(name = "IDPROJECTS")
    private Long idProject;

    @Column(name = "IDCATEGORIES")
    private Long idCategory;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

}
