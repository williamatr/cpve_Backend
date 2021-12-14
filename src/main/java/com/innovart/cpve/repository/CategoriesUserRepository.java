package com.innovart.cpve.repository;

import com.innovart.cpve.entity.CategoriesUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesUserRepository extends JpaRepository<CategoriesUser, Long> {
}
