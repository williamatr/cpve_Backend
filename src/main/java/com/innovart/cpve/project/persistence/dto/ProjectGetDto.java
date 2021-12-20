package com.innovart.cpve.project.persistence.dto;

import lombok.Data;
/**
 * DTO para mostrar proyectos
 */
@Data
public class ProjectGetDto {

    private String name;

    private String description;

    private String abstracts;

    private String objective;

    private String beneficiary;

    private String stateProject;

    private String author;

    private String linkPhoto;

}
