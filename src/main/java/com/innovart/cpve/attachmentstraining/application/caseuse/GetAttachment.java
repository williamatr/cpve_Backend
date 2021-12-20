package com.innovart.cpve.attachmentstraining.application.caseuse;

import com.innovart.cpve.attachmentstraining.application.service.AttachmentsTrainingService;
import com.innovart.cpve.attachmentstraining.persistence.entity.AttachmentsTraining;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetAttachment {

    private AttachmentsTrainingService attachmentsTrainingService;

    public GetAttachment(AttachmentsTrainingService attachmentsTrainingService) {
        this.attachmentsTrainingService = attachmentsTrainingService;
    }

    public List<AttachmentsTraining> getAll() {
        return attachmentsTrainingService.getAllAttachments();
    }

}
