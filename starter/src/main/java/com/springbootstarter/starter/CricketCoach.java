package com.springbootstarter.starter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements  Coach
{

    @Value("${motto}")
    private String motto;
    @Override
    public String getMotto()
    {
        return motto;
    }
    public CricketCoach()
    {
        System.out.println("im invoked"+getClass().getSimpleName());
    }
}
