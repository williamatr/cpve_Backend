package com.innovart.cpve.categoriesproject.persistence.dto;

import lombok.Data;
/**
 * DTO para la creacion, visualizacion y actualizacion de categorias de proyectos
 */
@Data
public class CategoriesProjectDto {

    private Long idCategoriesProjects;

    private Long idProject;

    private Long idCategory;

    private Integer stateActive;

}
