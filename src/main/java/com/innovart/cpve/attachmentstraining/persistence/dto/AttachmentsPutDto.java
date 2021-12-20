package com.innovart.cpve.attachmentstraining.persistence.dto;

import lombok.Data;

@Data
public class AttachmentsPutDto {

    private Long idTraining;

    private String nameAttachment;

    private String linkAttachment;

    private Integer stateActive;

}
