package com.innovart.cpve.project.application.service;

import com.innovart.cpve.project.application.repository.ProjectRepository;
import com.innovart.cpve.project.persistence.dto.ProjectPutDto;
import com.innovart.cpve.project.persistence.entity.Project;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    private ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project update(ProjectPutDto newProject, Long id) {
        return projectRepository.findById(id)
                .map(
                        project ->{
                            project.setIdUser(newProject.getIdUser());
                            project.setName(newProject.getName());
                            project.setDescription(newProject.getDescription());
                            project.setAbstracts(newProject.getAbstracts());
                            project.setObjective(newProject.getObjective());
                            project.setBeneficiary(newProject.getBeneficiary());
                            project.setLinkPhoto(newProject.getLinkPhoto());
                            project.setStateProject(newProject.getStateProject());
                            project.setAuthor(newProject.getAuthor());
                            project.setStateActive(newProject.getStateActive());
                            return projectRepository.save(project);

                        }
                ).get();
    }

    public List<Project> getPageProjects(@RequestParam int page, @RequestParam int size) {
        List<Project> projectList = projectRepository.findAll(PageRequest.of(page,size, Sort.by("idProject").ascending())).getContent();
        return projectList;
    }

    public Project saveProject(Project newProject) {
        Project projectNew = new Project();
        projectNew.setIdUser(newProject.getIdUser());
        projectNew.setName(newProject.getName());
        projectNew.setDescription(newProject.getDescription());
        projectNew.setAbstracts(newProject.getAbstracts());
        projectNew.setObjective(newProject.getObjective());
        projectNew.setBeneficiary(newProject.getBeneficiary());
        projectNew.setLinkPhoto(newProject.getLinkPhoto());
        projectNew.setStateProject(newProject.getStateProject());
        projectNew.setAuthor(newProject.getAuthor());
        projectNew.setStateActive(1);
        projectNew.setPostDate(LocalDateTime.now());
        return projectRepository.save(projectNew);
    }

    public List<Project> findByIdUser(Long id) {
        return projectRepository.findByIdUser(id);
    }

    public List<Project> findByName(String name) {
        return projectRepository.findByName(name);
    }

    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }
}
