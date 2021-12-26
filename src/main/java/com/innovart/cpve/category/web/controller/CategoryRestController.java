package com.innovart.cpve.category.web.controller;

import com.innovart.cpve.category.application.caseuse.GetCategory;
import com.innovart.cpve.category.persistence.entity.Category;
import com.innovart.cpve.project.persistence.dto.ProjectPutDto;
import com.innovart.cpve.project.persistence.entity.Project;
import com.innovart.cpve.rol.persistence.entity.Rol;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryRestController {

    GetCategory getCategory;

    public CategoryRestController(GetCategory getCategory) {
        this.getCategory = getCategory;
    }

    @GetMapping("/")
    @ApiOperation("Get all categories")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<List<Category>> getCategory(){
        return new ResponseEntity<>(getCategory.getAll(), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    @ApiOperation("Get category By ID")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long id){
        return getCategory.getById(id)
                .map(category -> new ResponseEntity<>(category, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
