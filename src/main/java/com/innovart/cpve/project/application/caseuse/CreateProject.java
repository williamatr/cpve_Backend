package com.innovart.cpve.project.application.caseuse;

import com.innovart.cpve.project.application.service.ProjectService;
import com.innovart.cpve.project.persistence.entity.Project;
import org.springframework.stereotype.Component;

@Component
public class CreateProject {

    ProjectService projectService;

    public CreateProject(ProjectService projectService) {
        this.projectService = projectService;
    }


    public Project saveProject(Project newProject) {
        return projectService.saveProject(newProject);
    }
}
