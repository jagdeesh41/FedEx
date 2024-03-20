package com.springbootstarter.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController
{
    private Coach coach;
    private Coach newCoach;
    private Utils utils;


    @Value("${name}")
    private String coachName;
    @Value("${name}")
    private String teamName;

    @Autowired
    public FunRestController(@Qualifier("method1")Coach coach,Utils utils,@Qualifier("method1")Coach myCoach)
    {
        System.out.println("im invoked"+getClass().getSimpleName());
        this.coach = coach;
        this.newCoach=myCoach;
        this.utils=utils;
    }
    @GetMapping("/")
    public String get()
    {
        return "hi";

    }

    @GetMapping("/motto")
    public String getMotto()
    {
        return coach.getMotto()+" "+utils.ans;
    }

    @GetMapping("/check")
    public String getresult()
    {
        return "comparing beans :"+(this.newCoach==this.coach);
    }

    public FunRestController() {
    }
}