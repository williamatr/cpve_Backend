package com.innovart.cpve.linksproject.persistence.dto;

import lombok.Data;

@Data
public class LinksPutDto {

    private Long idProject;
    private String nameSocialMedia;
    private String linkSocialMedia;
    private Integer stateActive;

}
