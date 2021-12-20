package com.innovart.cpve.categoriesuser.application.repository;

import com.innovart.cpve.categoriesuser.persistence.entity.CategoriesUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesUserRepository extends JpaRepository<CategoriesUser, Long> {
}
