package com.innovart.cpve.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "CPVE_AWARDS")
public class Award {

    @Id
    @Column(name = "IDAWARDS")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAward;

    @ManyToOne
    @JoinColumn(name = "IDADMIN", insertable = false, updatable = false)
    private Admin admin;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "AWARD")
    private String award;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

    @Column(name = "POST_DATE")
    private LocalDateTime postDate;

}
