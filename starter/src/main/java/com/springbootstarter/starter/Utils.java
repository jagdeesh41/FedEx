package com.springbootstarter.starter;

import org.springframework.stereotype.Component;

@Component
public class Utils
{
    public int ans=100;

    public Utils()
    {
        System.out.println("im invoked"+getClass().getSimpleName());



    }
}
