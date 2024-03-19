package org.example;

public class Bike implements Vehicle{

    String name;

    public Bike(String name)
    {
        this.name=name;

    }
    @Override
    public void move() {
        System.out.println(this.name+" Bike is Moving");

    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                '}';
    }
}
