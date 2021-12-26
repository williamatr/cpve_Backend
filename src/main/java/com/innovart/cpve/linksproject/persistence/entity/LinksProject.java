package com.innovart.cpve.linksproject.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "CPVE_LINKS_PROJECTS")
public class LinksProject {

    @Id
    @Column(name = "IDLINKS_PROJECTS")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sequence-generator"
    )
    @SequenceGenerator(
            name = "sequence-generator",
            sequenceName = "SEC_IDLINKSPROJECTS",
            initialValue = 1001,
            allocationSize=1
    )
    private Long idLinksProject;

    @Column(name = "IDPROJECTS")
    private Long idProject;

    @Column(name = "NAME_SOCIAL_MEDIA")
    private String nameSocialMedia;

    @Column(name = "LINK_SOCIAL_MEDIA")
    private String linkSocialMedia;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

}
