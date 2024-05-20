package com.example.adminkaz.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/health")
    public String checkHealth() {
        return "Status OK";
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to the Spring Boot Application!";
    }
}