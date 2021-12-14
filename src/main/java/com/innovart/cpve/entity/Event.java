package com.innovart.cpve.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "CPVE_EVENTS")
public class Event {

    @Id
    @Column(name = "IDEVENTS")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEvent;

    @ManyToOne
    @JoinColumn(name = "IDADMIN", insertable = false, updatable = false)
    private Admin admin;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "EVENT_DATE")
    private LocalDate eventDate;

    @Column(name = "EVENT_TIME")
    private LocalTime eventTime;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

    @Column(name = "POST_DATE")
    private LocalDateTime postDate;

}
