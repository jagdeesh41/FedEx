package com.springbootstarter.starter;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = {"com.springbootstarter.starter"})
@Configuration
public class AppConfig
{
    @Bean
    public Coach method1()
    {
        return new SwimmingCoach();

    }





}
