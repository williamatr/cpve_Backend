package com.innovart.cpve.rol.web.controller;

import com.innovart.cpve.rol.application.caseuse.GetRol;
import com.innovart.cpve.rol.persistence.entity.Rol;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rol")
public class RolRestController {

    @Autowired
    private GetRol getRol;

    public RolRestController(GetRol getRol) {
        this.getRol = getRol;
    }

    @GetMapping("/")
    @ApiOperation("Get all roles")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<List<Rol>> getRol(){
        return new ResponseEntity<>(getRol.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @ApiOperation("Get rol by ID")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<Rol> getRolById(@PathVariable Long id){
        return getRol.getById(id)
                .map(user -> new ResponseEntity<>(user, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
