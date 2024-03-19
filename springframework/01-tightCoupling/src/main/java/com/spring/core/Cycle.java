package com.spring.core;

public class Cycle
{
    String name;
    public Cycle(String name)
    {
        this.name=name;

    }

    public void move()
    {
        System.out.println("Im am cycling and moving");
    }

    @Override
    public String toString() {
        return "Cycle{" +
                "name='" + name + '\'' +
                '}';
    }
}
