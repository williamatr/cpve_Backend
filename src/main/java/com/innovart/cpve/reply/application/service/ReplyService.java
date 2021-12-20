package com.innovart.cpve.reply.application.service;

import com.innovart.cpve.reply.application.repository.ReplyRepository;
import org.springframework.stereotype.Service;

@Service
public class ReplyService {

    private ReplyRepository replyRepository;

    public ReplyService(ReplyRepository replyRepository) {
        this.replyRepository = replyRepository;
    }

}
