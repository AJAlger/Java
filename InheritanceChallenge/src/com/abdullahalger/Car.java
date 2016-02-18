package com.abdullahalger;

/**
 * Created by Abdullah-Mac on 2/1/16.
 */
public class Car extends Vehicle {

    private boolean convertable;
    private String type;
    private String brand;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(int wheels, int doors, int lights, String color, int size, String year, boolean convertable, String type, String brand, int gears, boolean isManual) {
        super(wheels, doors, lights, color, size, year);
        this.convertable = convertable;
        this.type = type;
        this.brand = brand;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear set to " + currentGear);
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeveolcity val: " + speed + " and " + direction);
        move(speed, direction);
    }



}
