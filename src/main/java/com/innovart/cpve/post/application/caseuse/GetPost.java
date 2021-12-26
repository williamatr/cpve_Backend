package com.innovart.cpve.post.application.caseuse;

import com.innovart.cpve.post.application.service.PostService;
import com.innovart.cpve.post.persistence.entity.Post;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Component
public class GetPost {

    PostService postService;

    public GetPost(PostService postService) {
        this.postService = postService;
    }


    public Optional<Post> getById(Long id) {
        return postService.findById(id);
    }

    public List<Post> getByIdUser(Long id) {
        return postService.findByIdUser(id);
    }

    public List<Post> getPage(int page, int size) {
        return postService.getPagePosts(page, size);
    }
}
