package org.example;

public class Bicycle implements Vehicle{

    private String name;

    public Bicycle() {
    }

    Bicycle(String name)
    {
        this.name=name;

    }

    @Override
    public void move() {

        System.out.println(this.name+" Bicycle is Moving ");

    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
