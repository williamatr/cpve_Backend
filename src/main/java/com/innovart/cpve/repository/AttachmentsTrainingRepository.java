package com.innovart.cpve.repository;

import com.innovart.cpve.entity.AttachmentsTraining;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachmentsTrainingRepository extends JpaRepository<AttachmentsTraining, Long> {
}
