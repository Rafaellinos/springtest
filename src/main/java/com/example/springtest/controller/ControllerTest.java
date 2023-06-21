package com.example.springtest.controller;

import com.example.springtest.domain.coach.Coach;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

    private final Coach coach;

    public ControllerTest(Coach coach) {
        this.coach = coach;
    }

    @Value("${message.hello}")
    private String message;

    @GetMapping("/test")
    public String helloWorld() {
        System.out.println("hello");
        return message;
    }

    @GetMapping("/coach")
    public String getCoachDailyWorkout() {
        return this.coach.getDailyWorkout();
    }
}
