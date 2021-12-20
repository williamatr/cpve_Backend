package com.innovart.cpve.training.persistence.entity;

import com.innovart.cpve.user.persistence.entity.User;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "CPVE_TRAININGS")
public class Training {

    @Id
    @Column(name = "IDTRAININGS")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTraining;

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
