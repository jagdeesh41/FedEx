package com.springbootstarter.starter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements  Coach{

    @Value("${motto}")
    private String motto;
    @Override
    public String getMotto()
    {
        return motto;
    }
}
