package com.innovart.cpve.attachmentstraining.web.controller;

import com.innovart.cpve.attachmentstraining.application.caseuse.CreateAttachment;
import com.innovart.cpve.attachmentstraining.application.caseuse.GetAttachment;
import com.innovart.cpve.attachmentstraining.application.caseuse.UpdateAttachment;
import com.innovart.cpve.attachmentstraining.persistence.dto.AttachmentsPostDto;
import com.innovart.cpve.attachmentstraining.persistence.dto.AttachmentsPutDto;
import com.innovart.cpve.attachmentstraining.persistence.entity.AttachmentsTraining;
import com.innovart.cpve.award.persistence.dto.AwardPutDto;
import com.innovart.cpve.award.persistence.entity.Award;
import com.innovart.cpve.project.persistence.dto.ProjectPutDto;
import com.innovart.cpve.project.persistence.entity.Project;
import com.innovart.cpve.user.persistence.dto.UserPostDto;
import com.innovart.cpve.user.persistence.entity.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attachments")
public class AttachmentsRestController {

    GetAttachment getAttachment;
    CreateAttachment createAttachment;
    UpdateAttachment updateAttachment;

    public AttachmentsRestController(GetAttachment getAttachment, CreateAttachment createAttachment, UpdateAttachment updateAttachment) {

        this.getAttachment = getAttachment;
        this.createAttachment = createAttachment;
        this.updateAttachment = updateAttachment;
    }

    @GetMapping("/")
    @ApiOperation("Get all attachments")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<List<AttachmentsTraining>> getAttachments(){
        return new ResponseEntity<>(getAttachment.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @ApiOperation("Get attachment By ID")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<AttachmentsTraining> getAttachmentsById(@PathVariable Long id){
        return getAttachment.getById(id)
                .map(attachment -> new ResponseEntity<>(attachment, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/training/{id}")
    @ApiOperation("Get attachment By IdTraining")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<List<AttachmentsTraining>> getAttachmentsByIdTraining(@PathVariable Long id){
        return new ResponseEntity<>(getAttachment.getByIdTraining(id), HttpStatus.OK);
    }

    @PostMapping("/save/")
    @ApiOperation("Save attachment")
    @ApiResponse(code=200, message = "CREATED")
    ResponseEntity<AttachmentsTraining> createAttachments(@RequestBody AttachmentsPostDto newAttachment) {
        return new ResponseEntity<>(createAttachment.saveAttachment(newAttachment), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    @ApiOperation("Update selected attachment")
    @ApiResponse(code=200,message="OK")
    ResponseEntity<AttachmentsTraining> replaceAttachments(@RequestBody AttachmentsPutDto newAttachment, @PathVariable Long id){
        return new ResponseEntity<>(updateAttachment.updateAttachment(newAttachment, id), HttpStatus.OK);
    }

}
