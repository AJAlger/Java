package com.abdullahalger;

public class Main {

    public static void main(String[] args) {

        int myval = 5 / 2;
        float myFloat = 5f / 3f;
        double myDouble = 5d / 3d;

        System.out.println("myint " + myval);
        System.out.println("my float " + myFloat);
        System.out.println("my double " + myDouble);

        double pounds = 200d;
        double kilogramsToPounds = pounds * 0.45359237d;

        System.out.println(kilogramsToPounds);
    }
}
