package com.example.project.backend.dtos;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String email;
    private String password;

}
