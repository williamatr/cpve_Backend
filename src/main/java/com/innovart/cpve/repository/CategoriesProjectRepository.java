package com.innovart.cpve.repository;

import com.innovart.cpve.entity.CategoriesProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesProjectRepository extends JpaRepository<CategoriesProject, Long> {
}
