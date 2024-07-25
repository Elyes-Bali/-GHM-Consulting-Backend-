package com.example.project.backend.controllers;

import com.example.project.backend.dtos.SignupRequest;
import com.example.project.backend.dtos.UserDTO;
import com.example.project.backend.services.AuthService;
import com.example.project.backend.services.AuthServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sign")
public class SignupUserController {
    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<?> createUser(@RequestBody SignupRequest signupRequest){
        UserDTO createUser = authService.createUser(signupRequest);
        if (createUser == null)
            return new ResponseEntity<>("User is not created, try again later", HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(createUser, HttpStatus.CREATED);
    }

}
