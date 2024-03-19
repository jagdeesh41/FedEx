package org.example;

public class Traveller
{
    private Vehicle vehicle;

    public Traveller(Vehicle vehicle)
    {
        this.vehicle=vehicle;





    }

    public Traveller() {
    }

    public void startJourney()
    {
        vehicle.move();


    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
