package com.abdullahalger;

/**
 * Created by Abdullah-Mac on 2/1/16.
 */
public class Fish extends Animal {

    private int gills;
    private int fins;
    private int eyes;

    public Fish(String name, int brain, int body, int size, int weight, int gills, int fins, int eyes) {
        super(name, 1, 2, size, weight);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }

    private void rest() {

    }

    private void moveMuscles() {

    }

    private void moveBackFin() {

    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
