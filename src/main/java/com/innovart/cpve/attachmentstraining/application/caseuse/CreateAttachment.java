package com.innovart.cpve.attachmentstraining.application.caseuse;

import com.innovart.cpve.attachmentstraining.application.service.AttachmentsTrainingService;
import com.innovart.cpve.attachmentstraining.persistence.dto.AttachmentsPostDto;
import com.innovart.cpve.attachmentstraining.persistence.entity.AttachmentsTraining;
import com.innovart.cpve.user.persistence.dto.UserPostDto;
import com.innovart.cpve.user.persistence.entity.User;
import org.springframework.stereotype.Component;

@Component
public class CreateAttachment {

    private AttachmentsTrainingService attachmentsTrainingService;

    public CreateAttachment(AttachmentsTrainingService attachmentsTrainingService) {
        this.attachmentsTrainingService = attachmentsTrainingService;
    }

    public AttachmentsTraining saveAttachment(AttachmentsPostDto newAttachment) {
        return attachmentsTrainingService.saveAttachment(newAttachment);
    }

}
