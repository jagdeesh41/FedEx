package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike implements  Vehical{
    @Override
    public void move() {
        System.out.println("Bike is moving");

    }

    public Bike() {

    }

    @Override
    public String toString() {
        return " Bike{}";
    }
}
