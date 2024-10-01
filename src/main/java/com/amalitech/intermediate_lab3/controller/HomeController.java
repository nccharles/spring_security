package com.amalitech.intermediate_lab3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String handleWelcome() {
        return "Welcome to Intermediate Lab3";
    }
}
