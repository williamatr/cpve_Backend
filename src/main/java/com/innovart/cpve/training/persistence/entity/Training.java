package com.innovart.cpve.training.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "CPVE_TRAININGS")
public class Training {

    @Id
    @Column(name = "IDTRAININGS")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sequence-generator"
    )
    @SequenceGenerator(
            name = "sequence-generator",
            sequenceName = "SEC_IDTRAININGS",
            initialValue = 301,
            allocationSize=1
    )
    private Long idTraining;

    @Column(name = "IDUSERS")
    private Long idUser;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "ABSTRACT")
    private String abstracts;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

    @Column(name = "POST_DATE")
    private LocalDateTime postDate;

}
