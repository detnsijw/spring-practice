package com.example.springpractice.controller;

import com.example.springpractice.model.Product;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    private final List<Product> products = new ArrayList<>(){{
        add(new Product("Toyota Camry 75", 17300000));
        add(new Product("Chevrolet Cobalt", 5690000));
        add(new Product("Mercedes-Benz CLS 63 AMG", 22500000));
    }};

    @GetMapping("/products")
    public String getProducts(Model model){
        model.addAttribute("products", products);
        return "products";
    }
}
