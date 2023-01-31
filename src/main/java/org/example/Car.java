package org.example;

public class Car extends Vehicle{

    @Override
    public int accelerate(int kmh) {
        System.out.println("Das Auto erhöht seine Geschwindigkeit um " + kmh + "km/h und hat nun eine Geschwindigkeit von: " + getVelocity() + "km/h");
        return getVelocity();
    }
}
