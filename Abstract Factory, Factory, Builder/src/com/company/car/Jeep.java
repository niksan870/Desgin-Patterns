package com.company.car;

public class Jeep implements Car {
    private boolean ledLights;
    private boolean GPS;
    private boolean climatic;
    private boolean suspension;
    private float price = 20000;

    public Jeep(boolean ledLights, boolean GPS, boolean climatic, boolean suspension) {
        this.ledLights = ledLights;
        this.GPS = GPS;
        this.climatic = climatic;
        this.suspension = suspension;
    }

    @Override
    public String toString() {
        String str = "";
        if (ledLights || GPS || suspension || climatic) {
            str += " It also comes with ";
        }
        if (ledLights) {
            price += 599.99;
            str += "Led lights, ";
        }
        if (GPS) {
            price += 999.99;
            str += "GPS, ";
        }
        if (suspension) {
            price += 599.99;
            str += "Enhanced Suspension, ";
        }
        if (climatic) {
            price += 1099.99;
            str += "Climatic.";
        }
        return str;
    }

    @Override
    public String getCar() {
        return "There is the Jeep";
    }

    @Override
    public double getPrice() {
        return price;
    }

    public static class JeepBuilder{
        private boolean ledLights;
        private boolean GPS;
        private boolean climatic;
        private boolean suspension;


        public JeepBuilder() {
        }

        public JeepBuilder setLedLights(boolean ledLights) {
            this.ledLights = ledLights;
            return this;
        }

        public JeepBuilder setGPS(boolean GPS) {
            this.GPS = GPS;
            return this;
        }

        public JeepBuilder setClimatic(boolean climatic) {
            this.climatic = climatic;
            return this;
        }

        public JeepBuilder setSuspension(boolean suspension) {
            this.suspension = suspension;
            return this;
        }

        public Jeep build() {
            return new Jeep(ledLights, GPS, climatic, suspension);
        }
    }
}