package com.innovart.cpve.reply.application.caseuse;

import com.innovart.cpve.reply.application.service.ReplyService;
import com.innovart.cpve.reply.persistence.entity.Reply;
import org.springframework.stereotype.Component;

@Component
public class CreateReply {

    ReplyService replyService;

    public CreateReply(ReplyService replytService) {
        this.replyService = replytService;
    }

    public Reply saveReply(Reply newReply){
        return replyService.saveReply(newReply);
    }
    
}
