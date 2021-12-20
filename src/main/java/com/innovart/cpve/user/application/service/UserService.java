package com.innovart.cpve.user.application.service;

import com.innovart.cpve.user.persistence.dto.UserDropDto;
import com.innovart.cpve.user.persistence.dto.UserGetDto;
import com.innovart.cpve.user.persistence.dto.UserPostDto;
import com.innovart.cpve.user.persistence.dto.UserPutDto;
import com.innovart.cpve.user.persistence.entity.User;
import com.innovart.cpve.user.application.repository.UserRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class UserService{

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User save(User newUser) {
        return userRepository.save(newUser);
    }

    public User update(UserPutDto newUserPutDto, Long id) {
        return userRepository.findById(id)
                .map(
                        user -> {
                            user.setIdRol(newUserPutDto.getIdRol());
                            user.setEmail(newUserPutDto.getEmail());
                            user.setPhone(newUserPutDto.getPhone());
                            user.setName(newUserPutDto.getName());
                            user.setLastName(newUserPutDto.getLastName());
                            user.setCountry(newUserPutDto.getCountry());
                            user.setCity(newUserPutDto.getCity());
                            user.setStateActive(newUserPutDto.getStateActive());
                            return userRepository.save(user);
                        }
                ).get();
    }

    public User logicalDelete(UserDropDto newUserDropDto, Long id) {
        return userRepository.findById(id)
                .map(
                        user -> {
                            user.setStateActive(newUserDropDto.getStateActive());
                            return userRepository.save(user);
                        }
                ).get();
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public User saveUser(UserPostDto newUser) {
        User userNew = new User();
        userNew.setIdRol(newUser.getIdRol());
        userNew.setUsername(newUser.getUsername());
        userNew.setEmail(newUser.getEmail());
        userNew.setPhone(newUser.getPhone());
        userNew.setName(newUser.getName());
        userNew.setLastName(newUser.getLastName());
        userNew.setCountry(newUser.getCountry());
        userNew.setCity(newUser.getCity());
        userNew.setPassword(newUser.getPassword());
        userNew.setStateActive(1);
        userNew.setGrant("user");
        userNew.setRegistrationDate(LocalDateTime.now());
        return userRepository.save(userNew);
    }

    public Optional<UserGetDto> findUserDtoByName(String name) {
        return userRepository.findUserDtoByName(name);
    }

    public UserGetDto findUserDtoById(Long id) {
        Optional<User> userById = userRepository.findById(id);
        UserGetDto userDtoById = new UserGetDto(userById);
        return userDtoById;

    }

    public List<UserGetDto> getPageUsers(@RequestParam int page, @RequestParam int size) {
        List<User> usersList = userRepository.findAll(PageRequest.of(page,size, Sort.by("idUser").ascending())).getContent();

        List<UserGetDto> userDtoList = new ArrayList<UserGetDto>();
        for (User user : usersList){
            userDtoList.add(new UserGetDto(user));
        }

        return userDtoList;
    }

}
