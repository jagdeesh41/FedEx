package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


public class ClientApp
{

    public static void main(String[] args)
    {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);

//        Car car=applicationContext.getBean(Car.class);
//
//        car.move();
//
//        Bike bike=applicationContext.getBean(Bike.class);
//
//        bike.move();








    }


}
