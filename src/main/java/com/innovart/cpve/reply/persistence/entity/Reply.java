package com.innovart.cpve.reply.persistence.entity;

import com.innovart.cpve.post.persistence.entity.Post;
import com.innovart.cpve.user.persistence.entity.User;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "CPVE_REPLY_POSTS")
public class Reply {

    @Id
    @Column(name = "IDREPLY_POSTS")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idReplyPost;

    @ManyToOne
    @JoinColumn(name = "IDUSERS", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "IDPOSTS_USERS", insertable = false, updatable = false)
    private Post post;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

    @Column(name = "POST_DATE")
    private LocalDateTime postDate;

}
