package com.innovart.cpve.categoriesuser.application.repository;

import com.innovart.cpve.categoriesuser.persistence.entity.CategoriesUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriesUserRepository extends JpaRepository<CategoriesUser, Long> {
    List<CategoriesUser> getByIdUser(Long id);
}
