package com.demo.springboot3.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Inject Properties for : trainer.name and team.name
    @Value("${trainer.name}")
    private String trainer;

    @Value("${team.name}")
    private String team;

    // expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Trainer name : " +trainer + ", Team name: " + team;
    }

    // expose "/" that return "Hello World!"

    @GetMapping("/")
    public String sayhello(){
        return "Hello World!";
    }

    // expose new endpoint for workout

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k!";
    }



}
