package com.innovart.cpve.linksproject.application.repository;

import com.innovart.cpve.linksproject.persistence.entity.LinksProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinksProjectRepository extends JpaRepository<LinksProject, Long> {
}
