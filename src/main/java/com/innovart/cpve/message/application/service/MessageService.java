package com.innovart.cpve.message.application.service;

import com.innovart.cpve.message.application.repository.MessageRepository;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

}
