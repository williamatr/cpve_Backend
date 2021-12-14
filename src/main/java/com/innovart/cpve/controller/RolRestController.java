package com.innovart.cpve.controller;

import com.innovart.cpve.rol.application.caseuse.GetRol;
import com.innovart.cpve.entity.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rol")
public class RolRestController {

    @Autowired
    private GetRol getRol;

    public RolRestController(GetRol getRol) {
        this.getRol = getRol;
    }

    @GetMapping("/")
    List<Rol> getRol(){
        return getRol.getAll();
    }



}
