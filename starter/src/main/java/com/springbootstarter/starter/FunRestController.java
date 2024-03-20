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
    private Utils utils;
    @Value("${name}")
    private String coachName;
    @Value("${name}")
    private String teamName;

    @Autowired
    public FunRestController(@Qualifier("BasketCoach") Coach coach)
    {
        this.coach = coach;
    }

    @Autowired
    public FunRestController(Utils utils)
    {
        this.utils = utils;
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
}