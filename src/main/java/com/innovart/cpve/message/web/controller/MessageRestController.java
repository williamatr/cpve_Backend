package com.innovart.cpve.message.web.controller;

import com.innovart.cpve.message.application.caseuse.CreateMessage;
import com.innovart.cpve.message.application.caseuse.GetMessage;
import com.innovart.cpve.message.persistence.entity.Message;
import com.innovart.cpve.project.persistence.entity.Project;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageRestController {

    GetMessage getMessage;
    CreateMessage createMessage;

    public MessageRestController(GetMessage getMessage, CreateMessage createMessage) {
        this.getMessage = getMessage;
        this.createMessage = createMessage;
    }

    @GetMapping("/{id}")
    @ApiOperation("Get message By ID")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<Message> getMessageById(@PathVariable Long id){
        return getMessage.getById(id)
                .map(message -> new ResponseEntity<>(message, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/user/{id}")
    @ApiOperation("Get message By IdUser")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<List<Message>> getMessageByIdUser(@PathVariable Long id){
        return new ResponseEntity<>(getMessage.getByIdUser(id), HttpStatus.OK);
    }

    @PostMapping("/save/")
    @ApiOperation("Save message")
    @ApiResponse(code=200, message = "CREATED")
    ResponseEntity<Message> createMessage(@RequestBody Message newMessage) {
        return new ResponseEntity<>(createMessage.saveMessage(newMessage), HttpStatus.CREATED);
    }

    @GetMapping("/page/")
    @ApiOperation("gets all message, paged")
    @ApiResponse(code=200,message="OK")
    public ResponseEntity<List<Message>> getPageMessage(@RequestParam int page, @RequestParam int size){
        return new ResponseEntity<>(getMessage.getPage(page, size), HttpStatus.OK);
    }


}
