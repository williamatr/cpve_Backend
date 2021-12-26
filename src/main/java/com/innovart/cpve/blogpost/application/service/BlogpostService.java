package com.innovart.cpve.blogpost.application.service;

import com.innovart.cpve.blogpost.application.repository.BlogpostRepository;
import com.innovart.cpve.blogpost.persistence.entity.Blogpost;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class BlogpostService {

    private BlogpostRepository blogpostRepository;

    public BlogpostService(BlogpostRepository blogpostRepository) {
        this.blogpostRepository = blogpostRepository;
    }

    public Optional<Blogpost> findById(Long id) {
        return blogpostRepository.findById(id);
    }

    public List<Blogpost> findByIdUser(Long id) {
        return blogpostRepository.findByIdUser(id);
    }

    public List<Blogpost> findByTitle(String title) {
        return blogpostRepository.findByTitle(title);
    }

    public Blogpost saveBlogpost(Blogpost newBlogpost) {
        Blogpost blogpostNew = new Blogpost();
        blogpostNew.setIdUser(newBlogpost.getIdUser());
        blogpostNew.setTitle(newBlogpost.getTitle());
        blogpostNew.setContent(newBlogpost.getContent());
        blogpostNew.setAbstracts(newBlogpost.getAbstracts());
        blogpostNew.setStateActive(1);
        blogpostNew.setPostDate(LocalDateTime.now());
        return blogpostRepository.save(blogpostNew);
    }

    public List<Blogpost> getPage(int page, int size) {
        List<Blogpost> blogpostList = blogpostRepository.findAll(PageRequest.of(page,size, Sort.by("idBlogpost").ascending())).getContent();
        return blogpostList;
    }
}
