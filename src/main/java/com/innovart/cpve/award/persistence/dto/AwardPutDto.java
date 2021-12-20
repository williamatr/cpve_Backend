package com.innovart.cpve.award.persistence.dto;

import lombok.Data;

@Data
public class AwardPutDto {

    private String name;

    private String description;

    private String award;

    private Integer stateActive;

}
