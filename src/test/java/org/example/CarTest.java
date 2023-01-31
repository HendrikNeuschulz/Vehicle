package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest{

    @Test
    void testAccelerate() {
        Car car = new Car();
        car.setVelocity(60);
        int expectedSpeed = 60;

        int result = car.accelerate(60);
        assertEquals(expectedSpeed, result);
    }
}