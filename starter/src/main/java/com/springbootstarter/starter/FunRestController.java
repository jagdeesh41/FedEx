package com.springbootstarter.starter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FunRestController
{
    @Value("${name}")
    private String coachName;
    @Value("${name}")
    private String teamName;
    @Value("${coach.lope}")
    private String coach;
    @GetMapping("/")
    public String sayHello()
    {
        return coach;
    }
}