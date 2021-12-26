package com.innovart.cpve.blogpost.web.controller;

import com.innovart.cpve.blogpost.application.caseuse.CreateBlogpost;
import com.innovart.cpve.blogpost.application.caseuse.GetBlogpost;
import com.innovart.cpve.blogpost.persistence.entity.Blogpost;
import com.innovart.cpve.project.persistence.dto.ProjectPutDto;
import com.innovart.cpve.project.persistence.entity.Project;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogpost")
public class BlogpostRestController {

    GetBlogpost getBlogpost;
    CreateBlogpost createBlogpost;

    public BlogpostRestController(GetBlogpost getBlogpost, CreateBlogpost createBlogpost) {
        this.getBlogpost = getBlogpost;
        this.createBlogpost = createBlogpost;
    }

    @GetMapping("/{id}")
    @ApiOperation("Get blogpost By ID")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<Blogpost> getBlogpostById(@PathVariable Long id){
        return getBlogpost.getById(id)
                .map(blogpost -> new ResponseEntity<>(blogpost, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/user/{id}")
    @ApiOperation("Get blogpost By IdUser")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<List<Blogpost>> getBlogpostByIdUser(@PathVariable Long id){
        return new ResponseEntity<>(getBlogpost.getByIdUser(id), HttpStatus.OK);
    }

    @GetMapping("/name/{name}")
    @ApiOperation("Get blogpost By Name")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<List<Blogpost>> getBlogpostByTitle(@PathVariable String name){
        return new ResponseEntity<>(getBlogpost.getByTitle(name), HttpStatus.OK);
    }

    @PostMapping("/save/")
    @ApiOperation("Save blogpost")
    @ApiResponse(code=200, message = "CREATED")
    ResponseEntity<Blogpost> createBlogpost(@RequestBody Blogpost newBlogpost) {
        return new ResponseEntity<>(createBlogpost.saveBlogpost(newBlogpost), HttpStatus.CREATED);
    }

    @GetMapping("/page/")
    @ApiOperation("gets all blogpost, paged")
    @ApiResponse(code=200,message="OK")
    public ResponseEntity<List<Blogpost>> getPageBlogpost(@RequestParam int page, @RequestParam int size){
        return new ResponseEntity<>(getBlogpost.getPage(page, size), HttpStatus.OK);
    }



}
