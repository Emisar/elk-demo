package com.example.elkdemo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class DefaultController {

    @GetMapping("/")
    public String index() {
        return "Hello World!";
    }
}
