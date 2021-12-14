package com.innovart.cpve.entity;

import com.innovart.cpve.user.persistence.entity.User;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "CPVE_MESSAGES")
public class Message {

    @Id
    @Column(name = "IDMESSAGES")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idMessage;

    @ManyToOne
    @JoinColumn(name = "IDUSERS", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "IDRECEIVER", insertable = false, updatable = false)
    private User receiver;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

    @Column(name = "SEND_DATE")
    private LocalDateTime sendDate;

}
