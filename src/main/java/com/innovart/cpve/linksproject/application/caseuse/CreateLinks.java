package com.innovart.cpve.linksproject.application.caseuse;

import com.innovart.cpve.linksproject.application.service.LinksProjectService;
import com.innovart.cpve.linksproject.persistence.entity.LinksProject;
import org.springframework.stereotype.Component;

@Component
public class CreateLinks {

    LinksProjectService linksProjectService;

    public CreateLinks(LinksProjectService linksProjectService) {
        this.linksProjectService = linksProjectService;
    }

    public LinksProject saveLink(LinksProject newLinks) {
        return linksProjectService.saveLink(newLinks);
    }
}
