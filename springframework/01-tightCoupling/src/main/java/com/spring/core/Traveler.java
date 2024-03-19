package com.spring.core;

public class Traveler
{
//    private Car car;
//    private Bike bike;
    private Cycle cycle;
    public Traveler()
    {

//        car=new Car("porsche");
//        System.out.println(car);
//        bike=new Bike("Hero");
//        System.out.println(bike);
        cycle=new Cycle("Avon");
        System.out.println(cycle);



    }

    public void startJourney()
    {

//        this.car.move();
//        this.bike.move();
        this.cycle.move();
    }
}
