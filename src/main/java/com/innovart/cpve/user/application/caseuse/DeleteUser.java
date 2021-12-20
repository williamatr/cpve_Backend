package com.innovart.cpve.user.application.caseuse;

import com.innovart.cpve.user.persistence.dto.UserDropDto;
import com.innovart.cpve.user.persistence.entity.User;
import com.innovart.cpve.user.application.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class DeleteUser {
    private UserService userService;

    public DeleteUser(UserService userService) {
        this.userService = userService;
    }

    public User delete(UserDropDto newUser, Long id) {
        return userService.logicalDelete(newUser, id);
    }
}
