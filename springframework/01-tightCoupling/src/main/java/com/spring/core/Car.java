package com.spring.core;

public class Car
{
    String name;
    public Car(String name)
    {
        this.name=name;

    }

    public Car() {
    }

    public void move()
    {
        System.out.println("Car is moving");
    }
    public void horn()
    {
        System.out.println("poi poi poi");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}

