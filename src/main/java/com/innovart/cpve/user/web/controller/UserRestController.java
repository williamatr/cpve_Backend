package com.innovart.cpve.user.web.controller;

import com.innovart.cpve.user.persistence.dto.UserDropDto;
import com.innovart.cpve.user.persistence.dto.UserGetDto;
import com.innovart.cpve.user.persistence.dto.UserPostDto;
import com.innovart.cpve.user.persistence.dto.UserPutDto;
import com.innovart.cpve.user.persistence.entity.User;
import com.innovart.cpve.user.application.caseuse.*;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRestController {

    private GetUser getUser;
    private CreateUser createUser;
    private DeleteUser deleteUser;
    private UpdateUser updateUser;

    public UserRestController(GetUser getUser, CreateUser createUser, DeleteUser deleteUser, UpdateUser updateUser) {
        this.getUser = getUser;
        this.createUser = createUser;
        this.deleteUser = deleteUser;
        this.updateUser = updateUser;
    }

    @GetMapping("/")
    @ApiOperation("Get all users")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<List<User>> getUser(){
        return new ResponseEntity<>(getUser.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @ApiOperation("Get user by ID")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        return getUser.getById(id)
                .map(user -> new ResponseEntity<>(user, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save/")
    ResponseEntity<User> createUser(@RequestBody User newUser) {
        return new ResponseEntity<>(createUser.saveUser(newUser), HttpStatus.CREATED);
    }

    @PutMapping("/delete/{id}")
    ResponseEntity<User> logicalDelete(@RequestBody UserDropDto newUser, @PathVariable Long id){
        return new ResponseEntity<>(deleteUser.delete(newUser, id), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    ResponseEntity<User> replaceUser(@RequestBody UserPutDto newUser, @PathVariable Long id){
        return new ResponseEntity<>(updateUser.updateUser(newUser, id), HttpStatus.OK);
    }

    @GetMapping("/pageuser/")
    @ApiOperation("gets all users, paged")
    @ApiResponse(code=200,message="OK")
    public ResponseEntity<List<UserGetDto>> getPageUser(@RequestParam int page, @RequestParam int size){
        return new ResponseEntity<>(getUser.getPage(page, size), HttpStatus.OK);
    }

    @GetMapping("/userDto/{id}")
    @ApiOperation("Get user DTO by ID")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<UserGetDto> getUserDtoById(@PathVariable Long id){
        return new ResponseEntity<>(getUser.getUserDtoById(id), HttpStatus.OK);
    }

    @GetMapping("/name/{name}")
    @ApiOperation("Get user DTO by Name")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<UserGetDto> getUseByUserName(@PathVariable String name){
        return new ResponseEntity<>(getUser.getByName(name), HttpStatus.OK);
    }



}
