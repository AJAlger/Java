package com.abdullahalger;

/**
 * Created by Abdullah-Mac on 2/1/16.
 */
public class Vehicle {

    private int wheels;
    private int doors;
    private int lights;
    private String color;
    private int size;
    private String year;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(int wheels, int doors, int lights, String color, int size, String year) {
        this.wheels = wheels;
        this.doors = doors;
        this.lights = lights;
        this.color = color;
        this.size = size;
        this.year = year;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void move(int speed, int direction) {
        currentDirection = direction;
        currentVelocity = speed;
        System.out.println("vehicle.move " + currentVelocity + " towards " + currentDirection);
    }

    public void steer(int direction) {
        this.currentDirection = direction;
        System.out.println("Vehicle.steer at " + currentDirection);
    }

    public void stop() {
        this.currentVelocity = 0;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getLights() {
        return lights;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public String getYear() {
        return year;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
