package com.abdullahalger;

public class Main {

    public static void main(String[] args) {

        byte myByte = 20;
        short myShort = 200;
        int myInt = 3000;
        long myLong = 50000L + 10L * (myByte + myShort + myInt);

        System.out.println(myLong);

    }
}
