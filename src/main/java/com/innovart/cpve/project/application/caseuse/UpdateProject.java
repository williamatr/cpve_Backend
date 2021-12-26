package com.innovart.cpve.project.application.caseuse;

import com.innovart.cpve.project.application.service.ProjectService;
import com.innovart.cpve.project.persistence.dto.ProjectPutDto;
import com.innovart.cpve.project.persistence.entity.Project;
import org.springframework.stereotype.Component;

@Component
public class UpdateProject {

    ProjectService projectService;

    public UpdateProject(ProjectService projectService) {
        this.projectService = projectService;
    }


    public Project updateProject(ProjectPutDto newProject, Long id) {
        return projectService.update(newProject, id);
    }
}
