package com.innovart.cpve.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "CPVE_ATTACHMENTS_TRAININGS")
public class AttachmentsTraining {

    @Id
    @Column(name = "IDATTACHMENTS_TRAININGS")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAttachmentsTraining;

    @ManyToOne
    @JoinColumn(name = "IDTRAININGS", insertable = false, updatable = false)
    private Training training;

    @Column(name = "LINK_ATTACHMENT")
    private String linkAttachment;

}
