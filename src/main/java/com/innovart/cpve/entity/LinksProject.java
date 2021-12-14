package com.innovart.cpve.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "CPVE_LINKS_PROJECTS")
public class LinksProject {

    @Id
    @Column(name = "IDLINKS_PROJECTS")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLinksProject;

    @ManyToOne
    @JoinColumn(name = "IDPROJECTS", insertable = false, updatable = false)
    private Project project;

    @Column(name = "NAME_SOCIAL_MEDIA")
    private String nameSocialMedia;

    @Column(name = "LINK_SOCIAL_MEDIA")
    private String linkSocialMedia;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

}
