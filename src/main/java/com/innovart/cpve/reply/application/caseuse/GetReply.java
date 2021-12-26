package com.innovart.cpve.reply.application.caseuse;

import com.innovart.cpve.reply.application.service.ReplyService;
import com.innovart.cpve.reply.persistence.entity.Reply;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Component
public class GetReply {

    private ReplyService replyService;

    public GetReply(ReplyService replyService) {
        this.replyService = replyService;
    }

    public Optional<Reply> getById(Long id) {
        return replyService.findById(id);
    }

    public List<Reply> getPage(int page, int size) {
        return replyService.getPageReply(page, size);
    }

    public List<Reply> getByIdPost(Long id) {
        return replyService.findByIdPost(id);
    }
}
