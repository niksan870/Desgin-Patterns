package com.company;

import com.company.car.Car;
import com.company.carTires.CarTires;

interface CarFactory {
//    public Car makeCar();
    public CarTires makeCarTires();

    Car makeCar(boolean b, boolean b1, boolean b2, boolean b3);
}
