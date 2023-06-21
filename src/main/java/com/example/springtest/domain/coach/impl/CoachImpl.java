package com.example.springtest.domain.coach.impl;

import com.example.springtest.domain.coach.Coach;
import org.springframework.stereotype.Service;

@Service
class CoachImpl implements Coach {

    @Override
    public String getDailyWorkout() {
        return "run 5k today";
    }
}