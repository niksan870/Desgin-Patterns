package com.company.car;

public class SUV implements Car {
    @Override
    public String getCar() {
        return "There is the SUV";
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
