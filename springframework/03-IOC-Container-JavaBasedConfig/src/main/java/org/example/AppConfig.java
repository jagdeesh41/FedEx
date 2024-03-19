package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean
    public Vehicle par()
    {
        return new Car();
    }

    @Bean
    public Vehicle bike()
    {
        return new Bike();
    }


    @Bean
    public Vehicle cycle()
    {
        return new Bicycle();
    }

    @Bean
    public Traveller traveller()
    {
        return new Traveller(par());//DI
    }





}
