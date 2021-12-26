package com.innovart.cpve.post.application.repository;

import com.innovart.cpve.post.persistence.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByIdUser(Long id);
}
