package com.innovart.cpve.user.application.caseuse;

import com.innovart.cpve.user.persistence.entity.User;
import com.innovart.cpve.user.application.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UpdateUser {
    private UserService userService;

    public UpdateUser(UserService userService) { this.userService = userService; }

    public User update(User newUser, Long id) {
        return userService.update(newUser, id);
    }
}
