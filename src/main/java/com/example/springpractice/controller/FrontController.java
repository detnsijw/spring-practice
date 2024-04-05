package com.example.springpractice.controller;

import com.example.springpractice.model.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FrontController {
//
//    private final List<User> users = new ArrayList<>() {{
//        add(new User("Alexey", 19));
//        add(new User("Mike", 38));
//        add(new User("Alexander", 43));
//    }};
//
//    @GetMapping("/users")
//    public String getUsers(Model model){
//        model.addAttribute("users", users);
//        return "users";
//    }

    @GetMapping("/test")
    public String get(Model model){
        model.addAttribute("key", "Hello World!");
        model.addAttribute("user", new User("Marshall", 19));
        return "test";
    }
}
