package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ClientApp
{
    public static void main(String[] args)
    {



//        Map<Integer,String> vehicleData=new LinkedHashMap<>();
//        vehicleData.put(1,"1 -> Car");
//        vehicleData.put(2,"2 -> Bicycle");
//        vehicleData.put(3,"3 -> Hero");
//
//        for(Map.Entry<Integer, String> entry :vehicleData.entrySet())
//        {
//            System.out.println(entry.getValue());
//        }
//        System.out.println("Enter vehicle Type: ");
//        Scanner sc=new Scanner(System.in);
//        int vehicleType=sc.nextInt();
//
//        Traveller traveller=new Traveller();
//        switch(vehicleType)
//        {
//            case 1:
//                Vehicle vehicle=new Car("Porsche");
//                traveller=new Traveller(vehicle);
//                traveller.startJourney();
//                break;
//            case 2:
//                traveller=new Traveller(new Bicycle("Avon"));
//                traveller.startJourney();
//                break;
//
//            case 3:
//                traveller=new Traveller(new Bike("Hero"));
//                traveller.startJourney();
//                break;
//
//            default:
//                System.out.println("Enter valid vehicleType");
//                break;
//        }
        //creating Spring IOC container
        //Read the Configuration class
        //Create and manage the Spring beans
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);

        //Retrieve Spring Beans from Spring IOC container

        Car car=applicationContext.getBean(Car.class);
        car.setName("porsche");
        car.move();

        Bike bike=applicationContext.getBean(Bike.class);
        bike.setName("Hero");
        bike.move();

        Bicycle bicycle=applicationContext.getBean(Bicycle.class);

        bicycle.setName("Avon");

        Traveller traveller=applicationContext.getBean(Traveller.class);
        traveller.setVehicle(bicycle);
        traveller.startJourney();


        Map<Integer,String> vehicleData=new LinkedHashMap<>();
        vehicleData.put(1,"1 -> Car");
        vehicleData.put(2,"2 -> Bicycle");
        vehicleData.put(3,"3 -> Hero");

        for(Map.Entry<Integer, String> entry :vehicleData.entrySet())
        {
            System.out.println(entry.getValue());
        }
        System.out.println("Enter vehicle Type: ");
        Scanner sc=new Scanner(System.in);
        int vehicleType=sc.nextInt();

        switch (vehicleType)
        {
            case 1:
                Car vehicle1=applicationContext.getBean(Car.class);
                vehicle1.setName("Porsche");
                Traveller traveller1=applicationContext.getBean(Traveller.class);
                traveller1.setVehicle(vehicle1);
                traveller1.startJourney();
                break;
            case 2:
                Bike vehicle2=applicationContext.getBean(Bike.class);
                vehicle2.setName("Hero");
                Traveller traveller2=applicationContext.getBean(Traveller.class);
                traveller2.setVehicle(vehicle2);
                traveller2.startJourney();
                break;
            case 3:
                Bicycle vehicle3=applicationContext.getBean(Bicycle.class);
                vehicle3.setName("AVON");
                Traveller traveller3=applicationContext.getBean(Traveller.class);
                traveller3.setVehicle(vehicle3);
                traveller3.startJourney();
                break;



        }





















    }



}
