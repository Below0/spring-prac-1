package com.spring.practice.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api")
@RestController
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello Spring!";
    }
}
