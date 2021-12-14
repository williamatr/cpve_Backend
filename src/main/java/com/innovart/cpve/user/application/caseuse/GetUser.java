package com.innovart.cpve.user.application.caseuse;

import com.innovart.cpve.user.persistence.entity.User;
import com.innovart.cpve.user.application.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetUser {

    private UserService userService;

    public GetUser(UserService userService) {
        this.userService = userService;
    }

    public List<User> getAll() {
        return userService.getAllUsers();
    }

}
