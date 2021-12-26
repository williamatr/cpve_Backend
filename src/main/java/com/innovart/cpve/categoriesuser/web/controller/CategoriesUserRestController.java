package com.innovart.cpve.categoriesuser.web.controller;

import com.innovart.cpve.categoriesuser.application.caseuse.CreateCategoriesUser;
import com.innovart.cpve.categoriesuser.application.caseuse.GetCategoriesUser;
import com.innovart.cpve.categoriesuser.application.caseuse.UpdateCategoriesUser;
import com.innovart.cpve.categoriesuser.persistence.dto.CategoriesUserPutDto;
import com.innovart.cpve.categoriesuser.persistence.entity.CategoriesUser;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories_user")
public class CategoriesUserRestController {

    GetCategoriesUser getCategoriesUser;
    CreateCategoriesUser createCategoriesUser;
    UpdateCategoriesUser updateCategoriesUser;

    public CategoriesUserRestController(GetCategoriesUser getCategoriesUser, CreateCategoriesUser createCategoriesUser, UpdateCategoriesUser updateCategoriesUser) {
        this.getCategoriesUser = getCategoriesUser;
        this.createCategoriesUser = createCategoriesUser;
        this.updateCategoriesUser = updateCategoriesUser;
    }

    @GetMapping("/user/{id}")
    @ApiOperation("Get categories user By IdUser")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<List<CategoriesUser>> getCategoriesUserByIdUser(@PathVariable Long id){
        return new ResponseEntity<>(getCategoriesUser.getByIdUser(id), HttpStatus.OK);
    }

    @PostMapping("/save/")
    @ApiOperation("Save categories user")
    @ApiResponse(code=200, message = "CREATED")
    ResponseEntity<CategoriesUser> createCategoriesUser(@RequestBody CategoriesUser newCategoriesUser) {
        return new ResponseEntity<>(createCategoriesUser.saveCategoriesUser(newCategoriesUser), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    @ApiOperation("Update selected categories user")
    @ApiResponse(code=200,message="OK")
    ResponseEntity<CategoriesUser> replaceCategoriesUser(@RequestBody CategoriesUserPutDto newCategoriesUser, @PathVariable Long id){
        return new ResponseEntity<>(updateCategoriesUser.updateCategoriesUser(newCategoriesUser, id), HttpStatus.OK);
    }

}
