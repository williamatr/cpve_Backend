package com.innovart.cpve.rol.application.caseuse;

import com.innovart.cpve.entity.Rol;
import com.innovart.cpve.rol.application.service.RolService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetRol {

    private RolService rolService;

    public GetRol(RolService rolService) {
        this.rolService = rolService;
    }

    public List<Rol> getAll() {
        return rolService.getAllRoles();
    }

}
