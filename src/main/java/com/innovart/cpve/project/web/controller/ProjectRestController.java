package com.innovart.cpve.project.web.controller;

import com.innovart.cpve.project.application.caseuse.CreateProject;
import com.innovart.cpve.project.application.caseuse.GetProject;
import com.innovart.cpve.project.application.caseuse.UpdateProject;
import com.innovart.cpve.project.persistence.dto.ProjectPutDto;
import com.innovart.cpve.project.persistence.entity.Project;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectRestController {

    GetProject getProject;
    CreateProject createProject;
    UpdateProject updateProject;

    public ProjectRestController(GetProject getProject, CreateProject createProject, UpdateProject updateProject) {
        this.getProject = getProject;
        this.createProject = createProject;
        this.updateProject = updateProject;
    }

    @GetMapping("/{id}")
    @ApiOperation("Get project By ID")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<Project> getProjectById(@PathVariable Long id){
        return getProject.getById(id)
                .map(project -> new ResponseEntity<>(project, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/user/{id}")
    @ApiOperation("Get project By IdUser")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<List<Project>> getProjectByIdUser(@PathVariable Long id){
        return new ResponseEntity<>(getProject.getByIdUser(id), HttpStatus.OK);
    }

    @GetMapping("/name/{name}")
    @ApiOperation("Get project By Name")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<List<Project>> getProjectByName(@PathVariable String name){
        return new ResponseEntity<>(getProject.getByName(name), HttpStatus.OK);
    }

    @PostMapping("/save/")
    @ApiOperation("Save project")
    @ApiResponse(code=200, message = "CREATED")
    ResponseEntity<Project> createProject(@RequestBody Project newProject) {
        return new ResponseEntity<>(createProject.saveProject(newProject), HttpStatus.CREATED);
    }

    @GetMapping("/page/")
    @ApiOperation("gets all projects, paged")
    @ApiResponse(code=200,message="OK")
    public ResponseEntity<List<Project>> getPageProject(@RequestParam int page, @RequestParam int size){
        return new ResponseEntity<>(getProject.getPage(page, size), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    @ApiOperation("Update selected project")
    @ApiResponse(code=200,message="OK")
    ResponseEntity<Project> replaceProject(@RequestBody ProjectPutDto newProject, @PathVariable Long id){
        return new ResponseEntity<>(updateProject.updateProject(newProject, id), HttpStatus.OK);
    }


}
