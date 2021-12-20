package com.innovart.cpve.rol.application.service;

import com.innovart.cpve.rol.persistence.entity.Rol;
import com.innovart.cpve.rol.application.repository.RolRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolService {

    private RolRepository rolRepository;

    public RolService(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    public List<Rol> getAllRoles(){
        return rolRepository.findAll();
    }

    public Optional<Rol> getById(Long id){
        return rolRepository.findById(id);
    }

}
