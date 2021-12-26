package com.innovart.cpve.blogpost.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "CPVE_BLOGPOSTS")
public class Blogpost {

    @Id
    @Column(name = "IDBLOGPOSTS")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sequence-generator"
    )
    @SequenceGenerator(
            name = "sequence-generator",
            sequenceName = "SEC_IDBLOGPOST",
            initialValue = 401,
            allocationSize=1
    )
    private Long idBlogpost;

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
