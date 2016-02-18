package com.abdullahalger;

/**
 * Created by Abdullah-Mac on 1/31/16.
 */
public class Car {
    // create variables that are accessible anywhere within the class that can be seen
    // member variables => fields
    // make the access modifier private, unlike the main class of public
    // private keeps it encapsulized, which is key to OOP
    // hide the fields and methods from being accessed publicly.

    // fields for the class - state component
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    // create object that will take the blueprint and make an object

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("spider") || validModel.equals("f350")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

    public String getModel() {
        return this.model;
    }

}
