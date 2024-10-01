package com.amalitech.intermediate_lab3.controller;

import com.amalitech.intermediate_lab3.model.Users;
import com.amalitech.intermediate_lab3.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    @Autowired
    private UsersService jwtUserDetailsService;

    @PostMapping("/register")
    public Users registerUser (@RequestBody Users user){
        return jwtUserDetailsService.save(user);
    }
}
