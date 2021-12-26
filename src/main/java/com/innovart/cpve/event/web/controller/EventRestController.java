package com.innovart.cpve.event.web.controller;

import com.innovart.cpve.event.application.caseuse.CreateEvent;
import com.innovart.cpve.event.application.caseuse.GetEvent;
import com.innovart.cpve.event.application.caseuse.UpdateEvent;
import com.innovart.cpve.event.persistence.dto.EventPutDto;
import com.innovart.cpve.event.persistence.entity.Event;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventRestController {

    GetEvent getEvent;
    CreateEvent createEvent;
    UpdateEvent updateEvent;

    public EventRestController(GetEvent getEvent, CreateEvent createEvent, UpdateEvent updateEvent) {
        this.getEvent = getEvent;
        this.createEvent = createEvent;
        this.updateEvent = updateEvent;
    }

    @GetMapping("/{id}")
    @ApiOperation("Get event By ID")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<Event> getEventById(@PathVariable Long id){
        return getEvent.getById(id)
                .map(event -> new ResponseEntity<>(event, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/name/{name}")
    @ApiOperation("Get event By Name")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<List<Event>> getEventByName(@PathVariable String name){
        return new ResponseEntity<>(getEvent.getByName(name), HttpStatus.OK);
    }

    @PostMapping("/save/")
    @ApiOperation("Save event")
    @ApiResponse(code=200, message = "CREATED")
    ResponseEntity<Event> createEvent(@RequestBody Event newEvent) {
        return new ResponseEntity<>(createEvent.saveEvent(newEvent), HttpStatus.CREATED);
    }

    @GetMapping("/page/")
    @ApiOperation("gets all event, paged")
    @ApiResponse(code=200,message="OK")
    public ResponseEntity<List<Event>> getPageEvent(@RequestParam int page, @RequestParam int size){
        return new ResponseEntity<>(getEvent.getPage(page, size), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    @ApiOperation("Update selected event")
    @ApiResponse(code=200,message="OK")
    ResponseEntity<Event> replaceProject(@RequestBody EventPutDto newEvent, @PathVariable Long id){
        return new ResponseEntity<>(updateEvent.updateEvent(newEvent, id), HttpStatus.OK);
    }


}
