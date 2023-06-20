package com.example.springtest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

    @Value("${message.hello}")
    private String message;

    @GetMapping("/test")
    public String helloWorld() {
        System.out.println("hello");
        return message;
    }
}
