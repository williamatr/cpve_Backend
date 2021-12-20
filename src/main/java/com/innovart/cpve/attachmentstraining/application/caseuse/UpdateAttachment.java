package com.innovart.cpve.attachmentstraining.application.caseuse;

import com.innovart.cpve.attachmentstraining.application.service.AttachmentsTrainingService;
import com.innovart.cpve.attachmentstraining.persistence.dto.AttachmentsPutDto;
import com.innovart.cpve.attachmentstraining.persistence.entity.AttachmentsTraining;
import org.springframework.stereotype.Component;

@Component
public class UpdateAttachment {

    private AttachmentsTrainingService attachmentsTrainingService;

    public UpdateAttachment(AttachmentsTrainingService attachmentsTrainingService) {
        this.attachmentsTrainingService = attachmentsTrainingService;
    }

    public AttachmentsTraining update(AttachmentsPutDto newAwardPutDto, Long id) {
        return attachmentsTrainingService.update(newAwardPutDto, id);
    }

}

