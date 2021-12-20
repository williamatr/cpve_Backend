package com.innovart.cpve.categoriesproject.application.repository;

import com.innovart.cpve.categoriesproject.persistence.entity.CategoriesProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesProjectRepository extends JpaRepository<CategoriesProject, Long> {
}
