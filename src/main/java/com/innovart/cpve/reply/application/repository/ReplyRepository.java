package com.innovart.cpve.reply.application.repository;

import com.innovart.cpve.reply.persistence.entity.Reply;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReplyRepository extends JpaRepository<Reply, Long> {

    List<Reply> findByIdPost(Long id);

}
