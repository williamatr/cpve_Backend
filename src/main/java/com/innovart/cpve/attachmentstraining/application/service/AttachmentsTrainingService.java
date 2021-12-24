package com.innovart.cpve.attachmentstraining.application.service;

import com.innovart.cpve.attachmentstraining.application.repository.AttachmentsTrainingRepository;
import com.innovart.cpve.attachmentstraining.persistence.dto.AttachmentsPostDto;
import com.innovart.cpve.attachmentstraining.persistence.dto.AttachmentsPutDto;
import com.innovart.cpve.attachmentstraining.persistence.entity.AttachmentsTraining;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachmentsTrainingService {

    private AttachmentsTrainingRepository attachmentsTrainingRepository;

    public AttachmentsTrainingService(AttachmentsTrainingRepository attachmentsTrainingRepository){
        this.attachmentsTrainingRepository = attachmentsTrainingRepository;
    }

    public List<AttachmentsTraining> getAllAttachments(){
        return attachmentsTrainingRepository.findAll();
    }

    public AttachmentsTraining update(AttachmentsPutDto newAwardPutDto, Long id) {
        return attachmentsTrainingRepository.findById(id)
                .map(
                        attachment -> {
                            attachment.setIdTraining(newAwardPutDto.getIdTraining());
                            attachment.setNameAttachment(newAwardPutDto.getNameAttachment());
                            attachment.setLinkAttachment(newAwardPutDto.getNameAttachment());
                            return attachmentsTrainingRepository.save(attachment);
                        }
                ).get();
    }

    public AttachmentsTraining logicalDelete(AttachmentsPutDto newAwardPutDto, Long id) {
        return attachmentsTrainingRepository.findById(id)
                .map(
                        attachment -> {
                            attachment.setStateActive(newAwardPutDto.getStateActive());
                            return attachmentsTrainingRepository.save(attachment);
                        }
                ).get();
    }

    public AttachmentsTraining saveAttachment(AttachmentsPostDto newAttachment) {
        AttachmentsTraining attachmentNew = new AttachmentsTraining();
        attachmentNew.setIdTraining(newAttachment.getIdTraining());
        attachmentNew.setNameAttachment(newAttachment.getNameAttachment());
        attachmentNew.setLinkAttachment(newAttachment.getLinkAttachment());
        attachmentNew.setStateActive(1);
        return attachmentsTrainingRepository.save(attachmentNew);
    }

}
