package com.innovart.cpve.linksproject.application.service;

import com.innovart.cpve.linksproject.application.repository.LinksProjectRepository;
import com.innovart.cpve.linksproject.persistence.dto.LinksPutDto;
import com.innovart.cpve.linksproject.persistence.entity.LinksProject;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LinksProjectService {

    private LinksProjectRepository linksProjectRepository;

    public LinksProjectService(LinksProjectRepository linksProjectRepository){
        this.linksProjectRepository = linksProjectRepository;
    }

    public Optional<LinksProject> findById(Long id) {
        return linksProjectRepository.findById(id);
    }


    public List<LinksProject> findByIdProject(Long id) {
        return linksProjectRepository.findByIdProject(id);
    }

    public LinksProject saveLink(LinksProject newLinks) {
        LinksProject linkNew = new LinksProject();
        linkNew.setIdProject(newLinks.getIdProject());
        linkNew.setNameSocialMedia(newLinks.getNameSocialMedia());
        linkNew.setLinkSocialMedia(newLinks.getLinkSocialMedia());
        linkNew.setStateActive(1);
        return linksProjectRepository.save(linkNew);
    }

    public List<LinksProject> getPageLinks(int page, int size) {
        List<LinksProject> linkList = linksProjectRepository.findAll(PageRequest.of(page,size, Sort.by("idLinksProject").ascending())).getContent();
        return linkList;
    }

    public LinksProject update(LinksPutDto newLinks, Long id) {
        return linksProjectRepository.findById(id)
                .map(
                        links ->{
                            links.setIdProject(newLinks.getIdProject());
                            links.setNameSocialMedia(newLinks.getNameSocialMedia());
                            links.setLinkSocialMedia(newLinks.getLinkSocialMedia());
                            links.setStateActive(newLinks.getStateActive());
                            return linksProjectRepository.save(links);
                        }
                ).get();
    }
}
