package com.innovart.cpve.post.application.caseuse;

import com.innovart.cpve.post.application.service.PostService;
import com.innovart.cpve.post.persistence.entity.Post;
import com.innovart.cpve.project.persistence.entity.Project;
import org.springframework.stereotype.Component;

@Component
public class CreatePost {

    PostService postService;

    public CreatePost(PostService postService) {
        this.postService = postService;
    }

    public Post saveProject(Post newPost) {
        return postService.savePost(newPost);
    }
}
