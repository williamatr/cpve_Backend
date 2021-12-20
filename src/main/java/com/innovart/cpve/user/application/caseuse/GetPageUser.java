package com.innovart.cpve.user.application.caseuse;

import com.innovart.cpve.user.persistence.dto.UserGetDto;
import com.innovart.cpve.user.application.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
public class GetPageUser {

    private UserService userService;

    public GetPageUser(UserService userService) {
        this.userService = userService;
    }

    public List<UserGetDto> getPage(@RequestParam int page, @RequestParam int size) {
        return userService.getPageUsers(page, size);
    }

}
