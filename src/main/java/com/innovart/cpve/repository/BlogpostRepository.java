package com.innovart.cpve.repository;

import com.innovart.cpve.entity.Blogpost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogpostRepository extends JpaRepository<Blogpost, Long> {
}
