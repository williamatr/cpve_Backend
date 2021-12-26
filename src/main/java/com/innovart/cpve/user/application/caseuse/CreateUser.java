package com.innovart.cpve.user.application.caseuse;

import com.innovart.cpve.user.persistence.entity.User;
import com.innovart.cpve.user.application.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class CreateUser {
    private UserService userService;

    public CreateUser(UserService userService) {this.userService = userService;}

    public User save(User newUser) {
        return userService.save(newUser);
    }

    public User saveUser(User newUser) {
        return userService.saveUser(newUser);
    }

}
