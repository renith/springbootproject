package com.example.globalexceptionhandler.controller;

import exception.UserNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public String getUser(@PathVariable int id) {

        if (id != 1) {
            throw new UserNotFoundException("User not found with id: " + id);
        }

        return "User Found";
    }
}
