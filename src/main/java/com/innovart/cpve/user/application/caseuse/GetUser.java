package com.innovart.cpve.user.application.caseuse;

import com.innovart.cpve.user.persistence.dto.UserGetDto;
import com.innovart.cpve.user.persistence.entity.User;
import com.innovart.cpve.user.application.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class GetUser {

    private UserService userService;

    public GetUser(UserService userService) {
        this.userService = userService;
    }

    public List<User> getAll() {
        return userService.getAllUsers();
    }

    public Optional<User> getById(Long id) {
        return userService.findById(id);
    }

    public UserGetDto getUserDtoById(Long id) {
        return userService.findUserDtoById(id);
    }

    public UserGetDto getByName(String name) {
        return userService.getUserByName(name);
    }
}
