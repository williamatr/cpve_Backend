package com.innovart.cpve.rol.application.service;

import com.innovart.cpve.entity.Rol;
import com.innovart.cpve.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService {

    @Autowired
    private RolRepository rolRepository;

    public RolService(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    public List<Rol> getAllRoles(){
        return rolRepository.findAll();
    }

}
