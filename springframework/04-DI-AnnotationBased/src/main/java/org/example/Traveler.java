package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Traveler
{
    private Vehical vehical;

    @Autowired
    public Traveler(@Qualifier("bicycle") Vehical vehical)
    {

        this.vehical=vehical;
        System.out.println("im assigned"+this.vehical);


    }

    public void startJourney()
    {
        this.vehical.move();

    }

    public Traveler() {
        System.out.println("im called no para");
    }
}
