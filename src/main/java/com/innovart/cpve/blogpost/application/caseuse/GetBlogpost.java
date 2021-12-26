package com.innovart.cpve.blogpost.application.caseuse;

import com.innovart.cpve.blogpost.application.service.BlogpostService;
import com.innovart.cpve.blogpost.persistence.entity.Blogpost;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class GetBlogpost {

    BlogpostService blogpostService;

    public GetBlogpost(BlogpostService blogpostService) {
        this.blogpostService = blogpostService;
    }


    public Optional<Blogpost> getById(Long id) {
        return blogpostService.findById(id);
    }

    public List<Blogpost> getByIdUser(Long id) {
        return blogpostService.findByIdUser(id);
    }

    public List<Blogpost> getByTitle(String title) {
        return blogpostService.findByTitle(title);
    }

    public List<Blogpost> getPage(int page, int size) {
        return blogpostService.getPage(page, size);
    }
}
