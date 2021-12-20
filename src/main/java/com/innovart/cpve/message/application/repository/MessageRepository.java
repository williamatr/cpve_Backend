package com.innovart.cpve.message.application.repository;

import com.innovart.cpve.message.persistence.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}
