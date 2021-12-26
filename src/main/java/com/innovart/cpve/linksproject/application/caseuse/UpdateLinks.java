package com.innovart.cpve.linksproject.application.caseuse;


import com.innovart.cpve.linksproject.application.service.LinksProjectService;
import com.innovart.cpve.linksproject.persistence.dto.LinksPutDto;
import com.innovart.cpve.linksproject.persistence.entity.LinksProject;
import org.springframework.stereotype.Component;

@Component
public class UpdateLinks {

    LinksProjectService linksProjectService;

    public UpdateLinks(LinksProjectService linksProjectService) {
        this.linksProjectService = linksProjectService;
    }


    public LinksProject updateLinks(LinksPutDto newLinks, Long id) {
        return linksProjectService.update(newLinks, id);
    }
}
