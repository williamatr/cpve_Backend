package com.innovart.cpve.rol.application.repository;

import com.innovart.cpve.rol.persistence.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
}
