package com.innovart.cpve.post.web.controller;

import com.innovart.cpve.post.application.caseuse.CreatePost;
import com.innovart.cpve.post.application.caseuse.GetPost;
import com.innovart.cpve.post.persistence.entity.Post;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostRestController {

    GetPost getPost;
    CreatePost createPost;

    public PostRestController(GetPost getPost, CreatePost createPost) {
        this.getPost = getPost;
        this.createPost = createPost;
    }

    @GetMapping("/{id}")
    @ApiOperation("Get post By ID")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<Post> getPosById(@PathVariable Long id){
        return getPost.getById(id)
                .map(post -> new ResponseEntity<>(post, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/user/{id}")
    @ApiOperation("Get post By IdUser")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<List<Post>> getPosByIdUser(@PathVariable Long id){
        return new ResponseEntity<>(getPost.getByIdUser(id), HttpStatus.OK);
    }

    @PostMapping("/save/")
    @ApiOperation("Save post")
    @ApiResponse(code=200, message = "CREATED")
    ResponseEntity<Post> createPost(@RequestBody Post newPost) {
        return new ResponseEntity<>(createPost.saveProject(newPost), HttpStatus.CREATED);
    }

    @GetMapping("/page/")
    @ApiOperation("gets all post, paged")
    @ApiResponse(code=200,message="OK")
    public ResponseEntity<List<Post>> getPagePost(@RequestParam int page, @RequestParam int size){
        return new ResponseEntity<>(getPost.getPage(page, size), HttpStatus.OK);
    }


}
