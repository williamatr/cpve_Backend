package com.innovart.cpve.categoriesproject.web.controller;


import com.innovart.cpve.categoriesproject.application.caseuse.CreateCategoriesProject;
import com.innovart.cpve.categoriesproject.application.caseuse.GetCategoriesProject;
import com.innovart.cpve.categoriesproject.application.caseuse.UpdateCategoriesProject;
import com.innovart.cpve.categoriesproject.persistence.dto.CategoriesProjectPutDto;
import com.innovart.cpve.categoriesproject.persistence.entity.CategoriesProject;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories_project")
public class CategoriesProjectRestController {

    GetCategoriesProject getCategoriesProject;
    CreateCategoriesProject createCategoriesProject;
    UpdateCategoriesProject updateCategoriesProject;

    public CategoriesProjectRestController(GetCategoriesProject getCategoriesProject, CreateCategoriesProject createCategoriesProject, UpdateCategoriesProject updateCategoriesProject) {
        this.getCategoriesProject = getCategoriesProject;
        this.createCategoriesProject = createCategoriesProject;
        this.updateCategoriesProject = updateCategoriesProject;
    }

    @GetMapping("/project/{id}")
    @ApiOperation("Get categories project By IdProject")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<List<CategoriesProject>> getCategoriesProjectByIdProject(@PathVariable Long id){
        return new ResponseEntity<>(getCategoriesProject.getByIdProject(id), HttpStatus.OK);
    }

    @PostMapping("/save/")
    @ApiOperation("Save categories project")
    @ApiResponse(code=200, message = "CREATED")
    ResponseEntity<CategoriesProject> createCategoriesUser(@RequestBody CategoriesProject newCategoriesProject) {
        return new ResponseEntity<>(createCategoriesProject.saveCategoriesProject(newCategoriesProject), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    @ApiOperation("Update selected categories project")
    @ApiResponse(code=200,message="OK")
    ResponseEntity<CategoriesProject> replaceCategoriesUser(@RequestBody CategoriesProjectPutDto newCategoriesProject, @PathVariable Long id){
        return new ResponseEntity<>(updateCategoriesProject.updateCategoriesProject(newCategoriesProject, id), HttpStatus.OK);
    }



}
