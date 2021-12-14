package com.innovart.cpve.user.application.service;

import com.innovart.cpve.user.persistence.entity.User;
import com.innovart.cpve.user.application.repository.UserRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class UserService{

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public List<User> getPageUsers(@RequestParam int page, @RequestParam int size) {
        return userRepository.findAll(PageRequest.of(page,size, Sort.by("idUser").ascending())).getContent();
    }

    public User save(User newUser) {
        return userRepository.save(newUser);
    }

    public User update(User newUser, Long id) {
        return userRepository.findById(id)
                .map(
                        user -> {
                            user.setUsername(newUser.getUsername());
                            user.setEmail(newUser.getEmail());
                            user.setPhone(newUser.getPhone());
                            user.setName(newUser.getName());
                            user.setLastName(newUser.getLastName());
                            user.setPassword(newUser.getPassword());
                            user.setCountry(newUser.getCountry());
                            user.setCity(newUser.getCity());
                            return userRepository.save(user);
                        }
                ).get();
    }

    public User logicalDelete(User newUser, Long id) {
        return userRepository.findById(id)
                .map(
                        user -> {
                            user.setStateActive(newUser.getStateActive());
                            return userRepository.save(user);
                        }
                ).get();
    }

}
