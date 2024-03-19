package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bicycle implements Vehical{
    @Override
    public void move()
    {
        System.out.println("Bicycle is Moving ...");



    }

    public Bicycle() {

    }

    @Override
    public String toString() {
        return " Bicycle{}";
    }
}
