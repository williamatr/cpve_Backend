package com.innovart.cpve.message.persistence.entity;

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
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sequence-generator"
    )
    @SequenceGenerator(
            name = "sequence-generator",
            sequenceName = "SEC_IDMESSAGES",
            initialValue = 1001,
            allocationSize=1
    )
    private Long idMessage;

    @Column(name = "IDUSERS")
    private Long idUser;

    @Column(name = "IDRECEIVER")
    private Long receiver;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

    @Column(name = "SEND_DATE")
    private LocalDateTime sendDate;

}
