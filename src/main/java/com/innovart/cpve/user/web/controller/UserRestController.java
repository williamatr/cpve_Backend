package com.innovart.cpve.user.web.controller;

import com.innovart.cpve.user.persistence.entity.User;
import com.innovart.cpve.user.application.caseuse.*;
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
    private GetPageUser getPageUser;

    public UserRestController(GetUser getUser, CreateUser createUser, DeleteUser deleteUser, UpdateUser updateUser, GetPageUser getPageUser) {
        this.getUser = getUser;
        this.createUser = createUser;
        this.deleteUser = deleteUser;
        this.updateUser = updateUser;
        this.getPageUser = getPageUser;
    }

    @GetMapping("/")
    List<User> getUser(){
        return getUser.getAll();
    }

    @PostMapping("/")
    ResponseEntity<User> newUser(@RequestBody User newUser) {
        return new ResponseEntity<>(createUser.save(newUser), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<User> deleteUser(@RequestBody User newUser, @PathVariable Long id){
        return new ResponseEntity<>(deleteUser.delete(newUser, id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    ResponseEntity<User> replaceUser(@RequestBody User newUser, @PathVariable Long id){
        return new ResponseEntity<>(updateUser.update(newUser, id), HttpStatus.OK);
    }

    @GetMapping("/pageuser")
    List<User> getPageUser(@RequestParam int page, @RequestParam int size){
        return getPageUser.getPage(page, size);
    }

}
