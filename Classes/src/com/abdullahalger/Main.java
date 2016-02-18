package com.abdullahalger;

public class Main {

    public static void main(String[] args) {
        // state
        // behaviour

        Car ferrari = new Car();
        Car ford = new Car();

        ferrari.setModel("Spider");
        ford.setModel("F350");

        System.out.println(ferrari.getModel());
        System.out.println(ford.getModel());

    }
}
