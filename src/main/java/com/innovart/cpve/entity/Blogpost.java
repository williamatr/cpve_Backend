package com.innovart.cpve.entity;

import com.innovart.cpve.user.persistence.entity.User;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "CPVE_BLOGPOSTS")
public class Blogpost {

    @Id
    @Column(name = "IDBLOGPOSTS")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBlogpost;

    @ManyToOne
    @JoinColumn(name = "IDUSERS", insertable = false, updatable = false)
    private User user;

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
