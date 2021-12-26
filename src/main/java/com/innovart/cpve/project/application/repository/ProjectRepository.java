package com.innovart.cpve.project.application.repository;

import com.innovart.cpve.project.persistence.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    List<Project> findByIdUser(Long id);

    List<Project> findByName(String name);
}
