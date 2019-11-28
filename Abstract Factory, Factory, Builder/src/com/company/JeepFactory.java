package com.company;

import com.company.car.Car;
import com.company.car.Jeep;
import com.company.carTires.CarTires;
import com.company.carTires.JeepTires;

class JeepFactory implements CarFactory {
    @Override
    public Car makeCar(boolean ledLights, boolean GPS, boolean climatic, boolean suspension) {
        Car newCar = new Jeep.JeepBuilder()
                .setLedLights(ledLights)
                .setGPS(GPS)
                .setClimatic(climatic)
                .setSuspension(suspension)
                .build();

        return newCar;
    }

    @Override
    public CarTires makeCarTires() {
        return new JeepTires();
    }
}
