package com.innovart.cpve.springScurity.service;


import com.innovart.cpve.user.application.service.UserService;
import com.innovart.cpve.user.persistence.dto.UserLogDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CpveUserDetailService implements UserDetailsService {

    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String userLogDto) throws UsernameNotFoundException {
        UserLogDto user = userService.getUserByUsername(userLogDto);

        return new User(user.getUsername(), "{noop}"+user.getPassword(), buildGrante(user.getGrant()));
    }

    public List<GrantedAuthority> buildGrante(String grant){
        List<GrantedAuthority> auths = new ArrayList<>();
        auths.add(new SimpleGrantedAuthority(grant));
        System.out.println(auths);
        return auths;
    }
}
