package com.innovart.cpve.message.application.caseuse;

import com.innovart.cpve.message.application.service.MessageService;
import com.innovart.cpve.message.persistence.entity.Message;
import org.springframework.stereotype.Component;

@Component
public class CreateMessage {

    MessageService messageService;

    public CreateMessage(MessageService messageService) {
        this.messageService = messageService;
    }

    public Message saveMessage(Message newMessage) {
        return messageService.saveMessage(newMessage);
    }
}
