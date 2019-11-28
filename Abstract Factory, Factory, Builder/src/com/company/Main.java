package com.company;

import com.company.car.Car;
import com.company.carTires.CarTires;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    protected static boolean quit = false;
    protected static Scanner scanner = new Scanner(System.in);
    protected static String answer = "";
    protected static Car car;
    protected static CarTires carTires;

    public static void main(String[] args) {
        System.out.println("Welcome to the Opel car promoting company, located in Veliko Tarnovo.");

        while (!quit) {
            System.out.println("If you want to buy car one of these cars type - SUV, Sedan, Jeep;");
            String choice = scanner.nextLine();
            CarFactory carFactory = options(choice);
            if (carFactory == null) {
                quit = true;
            }

            carCreation(carFactory);
        }
    }


    public static CarFactory options(String choice) {
        switch (choice.toLowerCase()) {
            case "suv":
                return new SUVFactory();
            case "sedan":
                return new SedanFactory();
            case "jeep":
                return new JeepFactory();
            case "exit":
                System.out.println("Okay thank, have a nice day!");
                return null;
            default:
                System.out.println("There is no such car to sell, have a nice day!");
                return null;
        }
    }

    public static Map sedanCarExtras() {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        System.out.println("Would you like your vehicle to have Led Lights? \n(Type YES or NO)");
        answer = scanner.nextLine();
        map.put("ledLights", processAnswer(answer));

        System.out.println("Would you like your vehicle to have GPS? \n(Type YES or NO)");
        answer = scanner.nextLine();
        map.put("GPS", processAnswer(answer));

        System.out.println("Would you like your vehicle to have Warming Seats? \n(Type YES or NO)");
        answer = scanner.nextLine();
        map.put("warmingSeats", processAnswer(answer));

        System.out.println("Would you like your vehicle to have Autopilot? \n(Type YES or NO)");
        answer = scanner.nextLine();
        map.put("autopilot", processAnswer(answer));

        return map;
    }

    public static Map jeepCarExtras() {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        System.out.println("Would you like your vehicle to have Led Lights? \n(Type YES or NO)");
        answer = scanner.nextLine();
        map.put("ledLights", processAnswer(answer));

        System.out.println("Would you like your vehicle to have GPS? \n(Type YES or NO)");
        answer = scanner.nextLine();
        map.put("GPS", processAnswer(answer));

        System.out.println("Would you like your vehicle to have Climatic? \n(Type YES or NO)");
        answer = scanner.nextLine();
        map.put("climatic", processAnswer(answer));

        System.out.println("Would you like your vehicle to have Enhanced Suspension? \n(Type YES or NO)");
        answer = scanner.nextLine();
        map.put("suspension", processAnswer(answer));

        return map;
    }

    public static Map SUVExtras() {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        System.out.println("Would you like your vehicle to have Led Lights? \n(Type YES or NO)");
        answer = scanner.nextLine();
        map.put("ledLights", processAnswer(answer));

        System.out.println("Would you like your vehicle to have GPS? \n(Type YES or NO)");
        answer = scanner.nextLine();
        map.put("GPS", processAnswer(answer));

        System.out.println("Would you like your vehicle to have Climatic? \n(Type YES or NO)");
        answer = scanner.nextLine();
        map.put("climatic", processAnswer(answer));

        System.out.println("Would you like your vehicle to have Enhanced Suspension? \n(Type YES or NO)");
        answer = scanner.nextLine();
        map.put("suspension", processAnswer(answer));

        return map;
    }

    public static boolean processAnswer(String answer) {
        if (answer.toLowerCase().equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public static void carCreation(CarFactory carFactory) {
        String typeOfVehicle = carFactory.getClass().getName();

        switch (typeOfVehicle) {
            case "com.company.SedanFactory":
                sedanChooser(carFactory);
                break;
            case "com.company.JeepFactory":
                jeepChooser(carFactory);
                break;
            case "com.company.SUVFactory":
                System.out.println("SUV");
                break;
            default:
                break;
        }
    }

    public static void jeepChooser(CarFactory carFactory) {
        Map<String, Boolean> map = jeepCarExtras();

        car = carFactory.makeCar(map.get("ledLights"), map.get("GPS"), map.get("climatic"), map.get("suspension"));
        carTires = carFactory.makeCarTires();

        System.out.println(car.getCar() + ". " + car.toString());
        System.out.println("The price of the car is " + String.format("$%.2f", car.getPrice()).replace("$0.", "$."));
        System.out.println(carTires.getCarTires());
        System.out.println("-There they are!\n");
    }

    public static void SUVChooser(CarFactory carFactory) {
        Map<String, Boolean> map = sedanCarExtras();
        car = carFactory.makeCar(map.get("ledLights"), map.get("GPS"), map.get("warmingSeats"), map.get("autopilot"));

        carTires = carFactory.makeCarTires();

        System.out.println(car.getCar() + ". " + car.toString());
        System.out.println("The price of the car is " + String.format("$%.2f", car.getPrice()).replace("$0.", "$."));
        System.out.println(carTires.getCarTires());
        System.out.println("-There they are!\n");
    }

    public static void sedanChooser(CarFactory carFactory) {
        Map<String, Boolean> map = sedanCarExtras();
        car = carFactory.makeCar(map.get("ledLights"), map.get("GPS"), map.get("warmingSeats"), map.get("autopilot"));

        carTires = carFactory.makeCarTires();

        System.out.println(car.getCar() + ". " + car.toString());
        System.out.println("The price of the car is " + String.format("$%.2f", car.getPrice()).replace("$0.", "$."));
        System.out.println(carTires.getCarTires());
        System.out.println("-There they are!\n");
    }
}