package com.innovart.cpve.attachmentstraining.application.caseuse;

import com.innovart.cpve.attachmentstraining.application.service.AttachmentsTrainingService;
import com.innovart.cpve.attachmentstraining.persistence.entity.AttachmentsTraining;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class GetAttachment {

    private AttachmentsTrainingService attachmentsTrainingService;

    public GetAttachment(AttachmentsTrainingService attachmentsTrainingService) {
        this.attachmentsTrainingService = attachmentsTrainingService;
    }

    public List<AttachmentsTraining> getAll() {
        return attachmentsTrainingService.getAllAttachments();
    }

    public List<AttachmentsTraining> getByIdTraining(Long id) {
        return attachmentsTrainingService.findByIdTraining(id);
    }

    public Optional<AttachmentsTraining> getById(Long id) {
        return attachmentsTrainingService.findById(id);
    }
}
