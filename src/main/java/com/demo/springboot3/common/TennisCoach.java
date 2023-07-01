package com.demo.springboot3.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("In Constructor : " + getClass().getSimpleName());
    }

    // Define our init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff(): + " + getClass().getSimpleName());
    }

    // Define our destroy method
    @PreDestroy
    public void doMyCleanStuff(){
        System.out.println("In doMyCleanStuff(): + " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand";
    }
}
