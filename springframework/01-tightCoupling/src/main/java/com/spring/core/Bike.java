package com.spring.core;

public class Bike
{
    String name;
    public Bike(String name)
    {
        this.name=name;
    }

    public void move()
    {
        System.out.println("Bike is Moving");
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                '}';
    }
}
