package com.innovart.cpve.post.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "CPVE_POSTS_USERS")
public class Post {

    @Id
    @Column(name = "IDPOSTS_USERS")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sequence-generator"
    )
    @SequenceGenerator(
            name = "sequence-generator",
            sequenceName = "SEC_IDPOSTS",
            initialValue = 301,
            allocationSize=1
    )
    private Long idPostsUser;

    @Column(name = "IDUSERS")
    private Long idUser;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

    @Column(name = "POST_DATE")
    private LocalDateTime postDate;

}
