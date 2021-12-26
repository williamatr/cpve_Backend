package com.innovart.cpve.reply.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "CPVE_REPLY_POSTS")
public class Reply {

    @Id
    @Column(name = "IDREPLY_POSTS")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sequence-generator"
    )
    @SequenceGenerator(
            name = "sequence-generator",
            sequenceName = "SEC_REPLYS",
            initialValue = 601,
            allocationSize=1
    )
    private Long idReplyPost;

    @Column(name = "IDUSERS")
    private Long idUser;

    @Column(name = "IDPOSTS_USERS")
    private Long idPost;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

    @Column(name = "POST_DATE")
    private LocalDateTime postDate;

}
