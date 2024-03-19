package org.example;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class Car implements Vehical{

    @Override
    public void move() {
        System.out.println("Car is Moving ...");
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{}";
    }
}
