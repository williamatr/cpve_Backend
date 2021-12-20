package com.innovart.cpve.post.persistence.entity;

import com.innovart.cpve.reply.persistence.entity.Reply;
import com.innovart.cpve.user.persistence.entity.User;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "CPVE_POSTS_USERS")
public class Post {

    @Id
    @Column(name = "IDPOSTS_USERS")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPostsUser;

    @ManyToOne
    @JoinColumn(name = "IDUSERS", insertable = false, updatable = false)
    private User user;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

    @Column(name = "POST_DATE")
    private LocalDateTime postDate;

    @OneToMany(mappedBy = "post")
    private List<Reply> replys;

}
