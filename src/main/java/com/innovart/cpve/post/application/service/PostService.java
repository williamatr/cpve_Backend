package com.innovart.cpve.post.application.service;

import com.innovart.cpve.post.application.repository.PostRepository;
import com.innovart.cpve.post.persistence.entity.Post;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Optional<Post> findById(Long id) {
        return postRepository.findById(id);
    }

    public List<Post> findByIdUser(Long id) {
        return postRepository.findByIdUser(id);
    }

    public List<Post> getPagePosts(int page, int size) {
        List<Post> postList = postRepository.findAll(PageRequest.of(page,size, Sort.by("idPostsUser").ascending())).getContent();
        return postList;
    }

    public Post savePost(Post newPost) {
        Post postNew = new Post();
        postNew.setIdUser(newPost.getIdUser());
        postNew.setContent(newPost.getContent());
        postNew.setStateActive(1);
        postNew.setPostDate(LocalDateTime.now());
        return postRepository.save(postNew);
    }
}
