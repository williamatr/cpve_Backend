package com.innovart.cpve.training.application.repository;

import com.innovart.cpve.training.persistence.entity.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainingRepository extends JpaRepository<Training, Long> {

    List<Training> findByIdUser(Long id);
}
