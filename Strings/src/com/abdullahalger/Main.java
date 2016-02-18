package com.abdullahalger;

public class Main {

    public static void main(String[] args) {

        String myString = "this is a string";
        System.out.println(myString);
        myString = myString + ", this is the next string";
        System.out.println(myString);
        myString = myString + "\u00A9 2016";
        System.out.println(myString);

        String numberString = "250.453";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);

        double doubleNum = 120.583;
        lastString = lastString + doubleNum;
        System.out.println(lastString);
    }
}
