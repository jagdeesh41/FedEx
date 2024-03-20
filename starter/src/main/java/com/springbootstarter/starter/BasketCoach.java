package com.springbootstarter.starter;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Primary
@Component
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BasketCoach implements Coach
{

    @Override
    public String getMotto()
    {
        return "im a basket coach imple";

    }

    public BasketCoach()
    {
        System.out.println("im invoked"+getClass().getSimpleName());
    }

    @PostConstruct
    public void doSomeThing()
    {
        System.out.println("im in init method");
    }

    @PreDestroy
    public void cleanupstuff()
    {
        System.out.println("im in destroy method");
    }


}
