package com.innovart.cpve.springScurity.controller;

import com.innovart.cpve.springScurity.JWTUtil;
import com.innovart.cpve.springScurity.dto.AuthenticationRequest;
import com.innovart.cpve.springScurity.dto.AuthenticationResponse;
import com.innovart.cpve.springScurity.service.CpveUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private AuthenticationManager authenticationManager;

    private CpveUserDetailService cpveUserDetailService;

    private JWTUtil jwtUtil;

    public AuthController(AuthenticationManager authenticationManager, CpveUserDetailService cpveUserDetailService, JWTUtil jwtUtil) {
        this.authenticationManager = authenticationManager;
        this.cpveUserDetailService = cpveUserDetailService;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> createToken(@RequestBody AuthenticationRequest request){

        try{

            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
            UserDetails userDetails = cpveUserDetailService.loadUserByUsername(request.getUsername());
            String jwt = jwtUtil.generateToken(userDetails);

            return new ResponseEntity<>(new AuthenticationResponse(jwt), HttpStatus.OK);

        } catch (BadCredentialsException e){

            return new ResponseEntity<>(HttpStatus.FORBIDDEN);

        }



    }

}
