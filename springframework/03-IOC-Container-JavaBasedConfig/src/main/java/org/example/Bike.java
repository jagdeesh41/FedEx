package org.example;

public class Bike implements Vehicle{

    String name;

    public Bike() {
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
