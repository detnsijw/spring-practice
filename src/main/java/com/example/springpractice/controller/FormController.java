package com.example.springpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    @GetMapping("/hello")
    public String hello(
            @RequestParam(required = false) String name,
            Model model
    ) {
        System.out.println(name);
        model.addAttribute("name", name);
        return "hello";
    }
}
