package com.innovart.cpve.reply.web.controller;


import com.innovart.cpve.reply.application.caseuse.CreateReply;
import com.innovart.cpve.reply.application.caseuse.GetReply;
import com.innovart.cpve.reply.persistence.entity.Reply;
import com.innovart.cpve.training.persistence.entity.Training;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reply")
public class ReplyRestController {

    GetReply getReply;
    CreateReply createReply;

    public ReplyRestController(GetReply getReply, CreateReply createReply) {
        this.getReply = getReply;
        this.createReply = createReply;
    }

    @GetMapping("/{id}")
    @ApiOperation("Get reply By ID")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<Reply> getReplyById(@PathVariable Long id){
        return getReply.getById(id)
                .map(training -> new ResponseEntity<>(training, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/bypost/{id}")
    @ApiOperation("Get reply By IdPost")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<List<Reply>> getReplyByIdPost(@PathVariable Long id){
        return new ResponseEntity<>(getReply.getByIdPost(id), HttpStatus.OK);
    }

    @PostMapping("/save/")
    @ApiOperation("Save reply")
    @ApiResponse(code=200, message = "CREATED")
    ResponseEntity<Reply> createReply(@RequestBody Reply newTraining) {
        return new ResponseEntity<>(createReply.saveReply(newTraining), HttpStatus.CREATED);
    }

    @GetMapping("/page/")
    @ApiOperation("gets all replys, paged")
    @ApiResponse(code=200,message="OK")
    public ResponseEntity<List<Reply>> getPageReply(@RequestParam int page, @RequestParam int size){
        return new ResponseEntity<>(getReply.getPage(page, size), HttpStatus.OK);
    }


}
