package com.innovart.cpve.award.web.controller;

import com.innovart.cpve.award.application.caseuse.GetAward;
import com.innovart.cpve.award.application.caseuse.UpdateAward;
import com.innovart.cpve.award.persistence.dto.AwardPutDto;
import com.innovart.cpve.award.persistence.entity.Award;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/award")
public class AwardRestController {

    private GetAward getAward;
    private UpdateAward updateAward;

    public AwardRestController(GetAward getAward, UpdateAward updateAward) {
        this.getAward = getAward;
        this.updateAward = updateAward;
    }

    @GetMapping("/")
    @ApiOperation("Get all awards")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<List<Award>> getAward(){
        return new ResponseEntity<>(getAward.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @ApiOperation("Get award by ID")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<Award> getAwardById(@PathVariable Long id){
        return getAward.findById(id)
                .map(award -> new ResponseEntity<>(award, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    ResponseEntity<Award> replaceUser(@RequestBody AwardPutDto newUser, @PathVariable Long id){
        return new ResponseEntity<>(updateAward.update(newUser, id), HttpStatus.OK);
    }


}
