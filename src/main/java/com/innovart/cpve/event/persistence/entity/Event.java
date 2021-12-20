package com.innovart.cpve.event.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "CPVE_EVENTS")
public class Event {

    @Id
    @Column(name = "IDEVENTS")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEvent;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "EVENT_DATE")
    private LocalDate eventDate;

    @Column(name = "EVENT_TIME")
    private String eventTime;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

    @Column(name = "POST_DATE")
    private LocalDateTime postDate;

}
