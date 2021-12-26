package com.innovart.cpve.message.application.caseuse;

import com.innovart.cpve.message.application.service.MessageService;
import com.innovart.cpve.message.persistence.entity.Message;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class GetMessage {

    MessageService messageService;

    public GetMessage(MessageService messageService) {
        this.messageService = messageService;
    }


    public Optional<Message> getById(Long id) {
        return messageService.findById(id);
    }

    public List<Message> getByIdUser(Long id) {
        return messageService.findByIdUser(id);
    }

    public List<Message> getPage(int page, int size) {
        return messageService.getPageMessage(page, size);
    }
}
