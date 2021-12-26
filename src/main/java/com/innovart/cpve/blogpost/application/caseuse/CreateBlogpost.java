package com.innovart.cpve.blogpost.application.caseuse;

import com.innovart.cpve.blogpost.application.service.BlogpostService;
import com.innovart.cpve.blogpost.persistence.entity.Blogpost;
import org.springframework.stereotype.Component;

@Component
public class CreateBlogpost {

    BlogpostService blogpostService;

    public CreateBlogpost(BlogpostService blogpostService) {
        this.blogpostService = blogpostService;
    }


    public Blogpost saveBlogpost(Blogpost newBlogpost) {
        return blogpostService.saveBlogpost(newBlogpost);
    }
}
