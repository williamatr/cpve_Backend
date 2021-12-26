package com.innovart.cpve.linksproject.application.caseuse;

import com.innovart.cpve.linksproject.application.service.LinksProjectService;
import com.innovart.cpve.linksproject.persistence.entity.LinksProject;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class GetLinks {

    LinksProjectService linksProjectService;

    public GetLinks(LinksProjectService linksProjectService) {
        this.linksProjectService = linksProjectService;
    }


    public Optional<LinksProject> getById(Long id) {
        return linksProjectService.findById(id);
    }

    public List<LinksProject> getByIdProject(Long id) {
        return linksProjectService.findByIdProject(id);
    }

    public List<LinksProject> getPage(int page, int size) {
        return linksProjectService.getPageLinks(page, size);
    }
}
