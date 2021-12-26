package com.innovart.cpve.project.application.caseuse;

import com.innovart.cpve.project.application.service.ProjectService;
import com.innovart.cpve.project.persistence.entity.Project;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class GetProject {

    ProjectService projectService;

    public GetProject(ProjectService projectService) {
        this.projectService = projectService;
    }


    public List<Project> getPage(int page, int size) {
        return projectService.getPageProjects(page, size);
    }

    public List<Project> getByIdUser(Long id) {
        return projectService.findByIdUser(id);
    }

    public List<Project> getByName(String name) {
        return projectService.findByName(name);
    }

    public Optional<Project> getById(Long id) {
        return projectService.findById(id);
    }
}
