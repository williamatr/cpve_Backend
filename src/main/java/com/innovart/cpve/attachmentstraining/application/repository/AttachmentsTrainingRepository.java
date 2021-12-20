package com.innovart.cpve.attachmentstraining.application.repository;

import com.innovart.cpve.attachmentstraining.persistence.entity.AttachmentsTraining;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachmentsTrainingRepository extends JpaRepository<AttachmentsTraining, Long> {

}
