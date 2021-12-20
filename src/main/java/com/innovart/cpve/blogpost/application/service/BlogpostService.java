package com.innovart.cpve.blogpost.application.service;

import com.innovart.cpve.blogpost.application.repository.BlogpostRepository;
import org.springframework.stereotype.Service;

@Service
public class BlogpostService {

    private BlogpostRepository blogpostRepository;

    public BlogpostService(BlogpostRepository blogpostRepository) {
        this.blogpostRepository = blogpostRepository;
    }

}
