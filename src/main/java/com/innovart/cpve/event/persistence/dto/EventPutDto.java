package com.innovart.cpve.event.persistence.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class EventPutDto {

    private String name;
    private String description;
    private LocalDate eventDate;
    private String eventTime;
    private Integer stateActive;

}
