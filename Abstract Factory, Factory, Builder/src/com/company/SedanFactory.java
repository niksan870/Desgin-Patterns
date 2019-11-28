package com.company;

import com.company.car.Car;
import com.company.car.Sedan;
import com.company.carTires.CarTires;
import com.company.carTires.SedanTires;

class SedanFactory implements CarFactory {
    public Car makeCar(boolean ledLights, boolean GPS, boolean warmingSeats, boolean autopilot) {
        Car newCar = new Sedan.SedanBuilder()
                .setLedLights(ledLights)
                .setGPS(GPS)
                .setWarmingSeats(warmingSeats)
                .setAutopilot(autopilot)
                .build();

        return newCar;
    }

    @Override
    public CarTires makeCarTires()   {
        return new SedanTires();
    }
}