package com.innovart.cpve.project.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "CPVE_PROJECTS")
public class Project {

    @Id
    @Column(name = "IDPROJECTS")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sequence-generator"
    )
    @SequenceGenerator(
            name = "sequence-generator",
            sequenceName = "SEC_IDPROJECTS",
            initialValue = 1001,
            allocationSize=1
    )
    private Long idProject;

    @Column(name = "IDUSERS")
    private Long idUser;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "ABSTRACT")
    private String abstracts;

    @Column(name = "OBJECTIVE")
    private String objective;

    @Column(name = "BENEFICIARY")
    private String beneficiary;

    @Column(name = "LINK_PHOTO")
    private String linkPhoto;

    @Column(name = "STATE_PROJECT")
    private String stateProject;

    @Column(name = "AUTHORS")
    private String author;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

    @Column(name = "POST_DATE")
    private LocalDateTime postDate;

}
