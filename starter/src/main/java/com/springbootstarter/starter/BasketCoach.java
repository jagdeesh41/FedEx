package com.springbootstarter.starter;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
@Primary
public class BasketCoach implements Coach{
    @Override
    public String getMotto()
    {
        return "im a basket coach imple";

    }
}
