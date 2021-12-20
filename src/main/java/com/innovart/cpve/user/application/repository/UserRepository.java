package com.innovart.cpve.user.application.repository;

import com.innovart.cpve.user.persistence.dto.UserGetDto;
import com.innovart.cpve.user.persistence.dto.UserLogDto;
import com.innovart.cpve.user.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {



    @Query("SELECT u.username, u.password, u.grant FROM User u WHERE u.username=:paramUsernameOrEmail " +
            "OR u.email=:paramUsernameOrEmail")
    UserLogDto getByUsernameOrEmail(@Param("paramUsernameOrEmail") String usernameOrEmail);

    UserLogDto findByUsername(String username);

    @Query("SELECT u.idUser, u.idRol, u.email, u.phone, u.name, u.lastName, u.country, " +
            "u.city, u.stateActive FROM User u WHERE u.name=:paramName")
    Optional<UserGetDto> findUserDtoByName(@Param("paramName") String name);


}
