package com.innovart.cpve.contactsuser.web.controller;

import com.innovart.cpve.contactsuser.application.caseuse.CreateContacts;
import com.innovart.cpve.contactsuser.application.caseuse.GetContacts;
import com.innovart.cpve.contactsuser.application.caseuse.UpdateContacts;
import com.innovart.cpve.contactsuser.persistence.entity.ContactsUser;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    ////Esta endidad no funciona por alguna razon
    @GetMapping("/")
    @ApiOperation("Get ContactsUser")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<List<ContactsUser>> getContacts(){
        return new ResponseEntity<>(getContacts.getAll(), HttpStatus.OK);
    }
    @GetMapping("/byuser/{id}")
    @ApiOperation("Get ContactsUser")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<List<ContactsUser>> getContactsByUser(@PathVariable Long id){
        return new ResponseEntity<>(getContacts.findCotactsByUser(id), HttpStatus.OK);
    }



}
