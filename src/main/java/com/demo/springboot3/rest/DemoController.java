package com.demo.springboot3.rest;

import com.demo.springboot3.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // Define private field for the dependency
    private final Coach coach;

    @Autowired
    public DemoController(@Qualifier("tennisCoach") Coach coach) {
        System.out.println("In Constructor : " + getClass().getSimpleName());
        this.coach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}
