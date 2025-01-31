package com.example.springpractice.controller;

import com.example.springpractice.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final List<User> users = new ArrayList<>();

    @GetMapping
    public List<User> getUser(){
        return users;
    }

    @PostMapping
    public User create(@RequestBody User user){
        users.add(user);
        return user;
    }
}
