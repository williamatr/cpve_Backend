package com.innovart.cpve.attachmentstraining.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "CPVE_ATTACHMENTS_TRAININGS")
public class AttachmentsTraining {

    @Id
    @Column(name = "IDATTACHMENTS_TRAININGS")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sequence-generator"
    )
    @SequenceGenerator(
            name = "sequence-generator",
            sequenceName = "SEC_IDATTACHMENTS",
            initialValue = 301,
            allocationSize=1
    )
    private Long idAttachmentsTraining;

    @Column(name = "IDTRAININGS")
    private Long idTraining;

    @Column(name = "NAME_ATTACHMENT")
    private String nameAttachment;

    @Column(name = "LINK_ATTACHMENT")
    private String linkAttachment;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

}
