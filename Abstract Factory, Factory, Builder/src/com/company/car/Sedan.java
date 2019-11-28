package com.company.car;

public class Sedan implements Car {
    private boolean ledLights;
    private boolean GPS;
    private boolean warmingSeats;
    private boolean autopilot;
    private float price = 20000;

    public Sedan(boolean ledLights, boolean GPS, boolean warmingSeats, boolean autopilot) {
        this.ledLights = ledLights;
        this.GPS = GPS;
        this.warmingSeats = warmingSeats;
        this.autopilot = autopilot;
    }

    @Override
    public String toString() {
        String str = "";
        if (ledLights || GPS || warmingSeats || autopilot) {
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
        if (warmingSeats) {
            price += 599.99;
            str += "Warming Seats, ";
        }
        if (autopilot) {
            price += 1099.99;
            str += "Autopilot.";
        }
        return str;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String getCar() {
        return "There is the Sedan";
    }


    public static class SedanBuilder{
        private boolean ledLights;
        private boolean GPS;
        private boolean warmingSeats;
        private boolean autopilot;

        public SedanBuilder() {}

        public SedanBuilder setLedLights(boolean ledLights){
            this.ledLights = ledLights;
            return this;
        }

        public SedanBuilder setGPS(boolean GPS){
            this.GPS = GPS;
            return this;
        }

        public SedanBuilder setWarmingSeats(boolean warmingSeats){
            this.warmingSeats = warmingSeats;
            return this;
        }

        public SedanBuilder setAutopilot(boolean autopilot){
            this.autopilot = autopilot;
            return this;
        }


        public Sedan build() {
            return new Sedan(ledLights, GPS, warmingSeats, autopilot);
        }
    }
}
