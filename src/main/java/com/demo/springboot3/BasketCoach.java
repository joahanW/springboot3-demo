package com.demo.springboot3;

import org.springframework.stereotype.Component;

@Component
public class BasketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice dribble for 40 minutes";
    }
}
