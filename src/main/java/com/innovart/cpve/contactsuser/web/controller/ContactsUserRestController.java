package com.innovart.cpve.contactsuser.web.controller;

import com.innovart.cpve.contactsuser.application.caseuse.CreateContacts;
import com.innovart.cpve.contactsuser.application.caseuse.GetContacts;
import com.innovart.cpve.contactsuser.application.caseuse.UpdateContacts;
import com.innovart.cpve.contactsuser.persistence.dto.ContactPutDto;
import com.innovart.cpve.contactsuser.persistence.entity.ContactsUser;
import com.innovart.cpve.project.persistence.dto.ProjectPutDto;
import com.innovart.cpve.project.persistence.entity.Project;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactsUserRestController {

    private GetContacts getContacts;
    private UpdateContacts updateContacts;
    private CreateContacts createContacts;

    public ContactsUserRestController(GetContacts getContacts, UpdateContacts updateContacts, CreateContacts createContacts) {
        this.getContacts = getContacts;
        this.updateContacts = updateContacts;
        this.createContacts = createContacts;
    }

    @GetMapping("/")
    @ApiOperation("Get ContactsUser")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<List<ContactsUser>> getContacts(){
        return new ResponseEntity<>(getContacts.getAll(), HttpStatus.OK);
    }
    @GetMapping("/user/{id}")
    @ApiOperation("Get ContactsUser")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<List<ContactsUser>> getContactsByUser(@PathVariable Long id){
        return new ResponseEntity<>(getContacts.findCotactsByUser(id), HttpStatus.OK);
    }

    @PostMapping("/save/")
    @ApiOperation("Save project")
    @ApiResponse(code=200, message = "CREATED")
    ResponseEntity<ContactsUser> createContact(@RequestBody ContactsUser newContact) {
        return new ResponseEntity<>(createContacts.saveContact(newContact), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    @ApiOperation("Update selected project")
    @ApiResponse(code=200,message="OK")
    ResponseEntity<ContactsUser> replaceContact(@RequestBody ContactPutDto newContact, @PathVariable Long id){
        return new ResponseEntity<>(updateContacts.updateContact(newContact, id), HttpStatus.OK);
    }



}
