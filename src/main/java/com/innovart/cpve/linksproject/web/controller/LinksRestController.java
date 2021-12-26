package com.innovart.cpve.linksproject.web.controller;

import com.innovart.cpve.linksproject.application.caseuse.CreateLinks;
import com.innovart.cpve.linksproject.application.caseuse.GetLinks;
import com.innovart.cpve.linksproject.application.caseuse.UpdateLinks;
import com.innovart.cpve.linksproject.persistence.dto.LinksPutDto;
import com.innovart.cpve.linksproject.persistence.entity.LinksProject;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/links")
public class LinksRestController {

    GetLinks getLinks;
    CreateLinks createLinks;
    UpdateLinks updateLinks;

    public LinksRestController(GetLinks getLinks, CreateLinks createLinks, UpdateLinks updateLinks) {
        this.getLinks = getLinks;
        this.createLinks = createLinks;
        this.updateLinks = updateLinks;
    }

    @GetMapping("/{id}")
    @ApiOperation("Get links By ID")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<LinksProject> getLinksById(@PathVariable Long id){
        return getLinks.getById(id)
                .map(links -> new ResponseEntity<>(links, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/project/{id}")
    @ApiOperation("Get links By IdProject")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<List<LinksProject>> getLinksByIdProject(@PathVariable Long id){
        return new ResponseEntity<>(getLinks.getByIdProject(id), HttpStatus.OK);
    }

    @PostMapping("/save/")
    @ApiOperation("Save links")
    @ApiResponse(code=200, message = "CREATED")
    ResponseEntity<LinksProject> createLink(@RequestBody LinksProject newLinks) {
        return new ResponseEntity<>(createLinks.saveLink(newLinks), HttpStatus.CREATED);
    }

    @GetMapping("/page/")
    @ApiOperation("gets all links, paged")
    @ApiResponse(code=200,message="OK")
    public ResponseEntity<List<LinksProject>> getPageLink(@RequestParam int page, @RequestParam int size){
        return new ResponseEntity<>(getLinks.getPage(page, size), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    @ApiOperation("Update selected links")
    @ApiResponse(code=200,message="OK")
    ResponseEntity<LinksProject> replaceLink(@RequestBody LinksPutDto newLinks, @PathVariable Long id){
        return new ResponseEntity<>(updateLinks.updateLinks(newLinks, id), HttpStatus.OK);
    }


}
