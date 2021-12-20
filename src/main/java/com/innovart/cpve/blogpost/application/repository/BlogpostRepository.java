package com.innovart.cpve.blogpost.application.repository;

import com.innovart.cpve.blogpost.persistence.entity.Blogpost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogpostRepository extends JpaRepository<Blogpost, Long> {
}
