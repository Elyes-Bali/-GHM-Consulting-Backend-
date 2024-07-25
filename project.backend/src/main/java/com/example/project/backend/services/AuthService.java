package com.example.project.backend.services;

import com.example.project.backend.dtos.SignupRequest;
import com.example.project.backend.dtos.UserDTO;
import com.example.project.backend.models.User;

public interface AuthService {
    UserDTO createUser(SignupRequest signupRequest);

}
