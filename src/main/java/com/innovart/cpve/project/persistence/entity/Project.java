package com.innovart.cpve.project.persistence.entity;

import com.innovart.cpve.user.persistence.entity.User;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "CPVE_PROJECTS")
public class Project {

    @Id
    @Column(name = "IDPROJECTS")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProject;

    @ManyToOne
    @JoinColumn(name = "IDUSERS", insertable = false, updatable = false)
    private User user;

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
