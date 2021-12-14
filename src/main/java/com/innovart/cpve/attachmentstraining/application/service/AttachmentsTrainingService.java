package com.innovart.cpve.attachmentstraining.application.service;

import com.innovart.cpve.repository.AttachmentsTrainingRepository;
import org.springframework.stereotype.Service;

@Service
public class AttachmentsTrainingService {

    private AttachmentsTrainingRepository attachmentsTrainingRepository;

    public AttachmentsTrainingService(AttachmentsTrainingRepository attachmentsTrainingRepository){
        this.attachmentsTrainingRepository = attachmentsTrainingRepository;
    }

}
