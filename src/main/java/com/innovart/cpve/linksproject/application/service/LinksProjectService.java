package com.innovart.cpve.linksproject.application.service;

import com.innovart.cpve.linksproject.application.repository.LinksProjectRepository;
import org.springframework.stereotype.Service;

@Service
public class LinksProjectService {

    private LinksProjectRepository linksProjectRepository;

    public LinksProjectService(LinksProjectRepository linksProjectRepository){
        this.linksProjectRepository = linksProjectRepository;
    }

}
