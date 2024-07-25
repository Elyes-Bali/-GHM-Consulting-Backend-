package com.example.project.backend.controllers;

import com.example.project.backend.dtos.HelloResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
@GetMapping("/hello")
    public HelloResponse hello(){
    return new HelloResponse("Hello from JWT Auth");
}
}
