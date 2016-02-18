package com.abdullahalger;

/**
 * Created by Abdullah-Mac on 2/2/16.
 */
public class Car extends Vehicle {

    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
