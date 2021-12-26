package com.innovart.cpve.training.web.controller;

import com.innovart.cpve.training.application.caseuse.CreateTraining;
import com.innovart.cpve.training.application.caseuse.GetTraining;
import com.innovart.cpve.training.persistence.entity.Training;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/training")
public class TrainingRestController {

    GetTraining getTraining;
    CreateTraining createTraining;

    public TrainingRestController(GetTraining getTraining, CreateTraining createTraining) {
        this.getTraining = getTraining;
        this.createTraining = createTraining;
    }

    @GetMapping("/{id}")
    @ApiOperation("Get training By ID")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<Training> getTrainingById(@PathVariable Long id){
        return getTraining.getById(id)
                .map(training -> new ResponseEntity<>(training, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/byuser/{id}")
    @ApiOperation("Get reply By IdPost")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<List<Training>> getTrainingByIdUser(@PathVariable Long id){
        return new ResponseEntity<>(getTraining.getByIdUser(id), HttpStatus.OK);
    }

    @PostMapping("/save/")
    @ApiOperation("Save training")
    @ApiResponse(code=200, message = "CREATED")
    ResponseEntity<Training> createTraining(@RequestBody Training newTraining) {
        return new ResponseEntity<>(createTraining.saveTraining(newTraining), HttpStatus.CREATED);
    }

    @GetMapping("/page/")
    @ApiOperation("gets all trainings, paged")
    @ApiResponse(code=200,message="OK")
    public ResponseEntity<List<Training>> getPageTraining(@RequestParam int page, @RequestParam int size){
        return new ResponseEntity<>(getTraining.getPage(page, size), HttpStatus.OK);
    }

}
