package org.example;

public class Car implements Vehicle{

    private String name;

    public Car(String name)
    {
        this.name=name;

    }
    @Override
    public void move()
    {
        System.out.println(this.name+" Car is moving ");

    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
