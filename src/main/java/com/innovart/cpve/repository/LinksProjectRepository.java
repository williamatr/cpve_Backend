package com.innovart.cpve.repository;

import com.innovart.cpve.entity.LinksProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinksProjectRepository extends JpaRepository<LinksProject, Long> {
}
