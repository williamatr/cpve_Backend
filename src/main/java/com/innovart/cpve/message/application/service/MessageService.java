package com.innovart.cpve.message.application.service;

import com.innovart.cpve.message.application.repository.MessageRepository;
import com.innovart.cpve.message.persistence.entity.Message;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    private MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Optional<Message> findById(Long id) {
        return messageRepository.findById(id);
    }

    public List<Message> findByIdUser(Long id) {
        return messageRepository.findByIdUser(id);
    }

    public Message saveMessage(Message newMessage) {
        Message messageNew = new Message();
        messageNew.setIdUser(newMessage.getIdUser());
        messageNew.setReceiver(newMessage.getReceiver());
        messageNew.setContent(newMessage.getContent());
        messageNew.setStateActive(1);
        messageNew.setSendDate(LocalDateTime.now());
        return messageRepository.save(messageNew);
    }

    public List<Message> getPageMessage(int page, int size) {
        List<Message> messageList = messageRepository.findAll(PageRequest.of(page,size, Sort.by("idMessage").ascending())).getContent();
        return messageList;
    }
}
