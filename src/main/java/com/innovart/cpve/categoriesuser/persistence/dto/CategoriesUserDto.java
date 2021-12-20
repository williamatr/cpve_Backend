package com.innovart.cpve.categoriesuser.persistence.dto;

import lombok.Data;
/**
 * DTO para la creacion, visualizacion y actualizacion de categorias de usuarios
 */
@Data
public class CategoriesUserDto {

    private Long idCategoriesUsers;

    private Long idCategory;

    private Long idUser;

    private Integer stateActive;

}
