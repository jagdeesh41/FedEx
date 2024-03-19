package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ClientApp
{
    public static void main(String[] args)
    {



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


        switch(vehicleType)
        {
            case 1:
                Traveller traveller=new Traveller(new Car("Porsche"));
                traveller.startJourney();
                break;
            case 2:
                Traveller traveller1=new Traveller(new Bicycle("Avon"));
                traveller1.startJourney();
                break;

            case 3:
                Traveller traveller2=new Traveller(new Bike("Hero"));
                traveller2.startJourney();
                break;

            default:
                System.out.println("Enter valid vehicleType");
                break;
        }



    }



}
