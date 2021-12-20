package com.innovart.cpve.project.persistence.dto;

import lombok.Data;
/**
 * DTO para la creacion de proyectos
 */
@Data
public class ProjectPostDto {

    private Long idUser;

    private String name;

    private String description;

    private String abstracts;

    private String objective;

    private String beneficiary;

    private String linkPhoto;

    private String stateProject;

    private String author;

}
