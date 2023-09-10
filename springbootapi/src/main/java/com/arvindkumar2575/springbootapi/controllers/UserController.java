package com.arvindkumar2575.springbootapi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arvindkumar2575.springbootapi.entities.User;
import com.arvindkumar2575.springbootapi.services.UserService;

@RestController
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

}
