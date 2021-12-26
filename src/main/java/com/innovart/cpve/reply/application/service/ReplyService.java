package com.innovart.cpve.reply.application.service;

import com.innovart.cpve.reply.application.repository.ReplyRepository;
import com.innovart.cpve.reply.persistence.entity.Reply;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ReplyService {

    private ReplyRepository replyRepository;

    public ReplyService(ReplyRepository replyRepository) {
        this.replyRepository = replyRepository;
    }

    public Optional<Reply> findById(Long id) {
        return replyRepository.findById(id);
    }

    public List<Reply> getPageReply(int page, int size){
        List<Reply> replyList = replyRepository.findAll(PageRequest.of(page,size, Sort.by("idTraining").ascending())).getContent();
        return replyList;
    }

    public Reply saveReply(Reply newReply) {
        Reply replyNew = new Reply();
        replyNew.setIdUser(newReply.getIdUser());
        replyNew.setIdPost(newReply.getIdPost());
        replyNew.setContent(newReply.getContent());
        replyNew.setStateActive(1);
        replyNew.setPostDate(LocalDateTime.now());
        return replyRepository.save(replyNew);
    }


    public List<Reply> findByIdPost(Long id) {
        return replyRepository.findByIdPost(id);
    }
}
