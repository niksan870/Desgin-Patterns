package com.company;

import com.company.car.Car;
import com.company.car.SUV;
import com.company.carTires.CarTires;
import com.company.carTires.SUVTires;

class SUVFactory implements CarFactory {
    @Override
    public CarTires makeCarTires() {
        return new SUVTires();
    }

    @Override
    public Car makeCar(boolean b, boolean b1, boolean b2, boolean b3) {
        return null;
    }
}
