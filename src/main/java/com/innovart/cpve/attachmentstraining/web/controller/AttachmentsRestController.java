package com.innovart.cpve.attachmentstraining.web.controller;

import com.innovart.cpve.attachmentstraining.application.caseuse.CreateAttachment;
import com.innovart.cpve.attachmentstraining.application.caseuse.GetAttachment;
import com.innovart.cpve.attachmentstraining.application.caseuse.UpdateAttachment;
import com.innovart.cpve.attachmentstraining.persistence.dto.AttachmentsPostDto;
import com.innovart.cpve.attachmentstraining.persistence.dto.AttachmentsPutDto;
import com.innovart.cpve.attachmentstraining.persistence.entity.AttachmentsTraining;
import com.innovart.cpve.award.persistence.dto.AwardPutDto;
import com.innovart.cpve.award.persistence.entity.Award;
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

    @PutMapping("/{id}")
    ResponseEntity<AttachmentsTraining> replaceUser(@RequestBody AttachmentsPutDto newAttacment, @PathVariable Long id){
        return new ResponseEntity<>(updateAttachment.update(newAttacment, id), HttpStatus.OK);
    }

    @PostMapping("/save/")
    ResponseEntity<AttachmentsTraining> createUser(@RequestBody AttachmentsPostDto newAttachment) {
        return new ResponseEntity<>(createAttachment.saveAttachment(newAttachment), HttpStatus.CREATED);
    }



}
