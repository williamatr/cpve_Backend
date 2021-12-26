package com.innovart.cpve.blogpost.application.repository;

import com.innovart.cpve.blogpost.persistence.entity.Blogpost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogpostRepository extends JpaRepository<Blogpost, Long> {

    List<Blogpost> findByIdUser(Long id);

    List<Blogpost> findByTitle(String title);
}
