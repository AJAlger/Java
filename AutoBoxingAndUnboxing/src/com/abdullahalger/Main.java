package com.abdullahalger;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // autoboxing

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

//        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
//        for (int i = 0; i <= 10; i++) {
//            // i taking primitive type and converting to class Integer to use as a class
//            intArrayList.add(Integer.valueOf(i));
//            // autoboxing - converting (base integer type int)
//            // and converting it to an integer
//        }
//
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i + " ---> " + intArrayList.get(i).intValue());
//            // unboxing - converting it back to an integer from the class
//        }

        // Best to do it this way
        Integer myIntValue = 56; // Integer.valueOf(56) --> this happens at compile time
        int myInt = myIntValue; // myInt.intValue(); ---> this is what it's doing at compile time

        //////////////////// DOUBLE //////////////////////////

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(dbl); // was inside parens Double.valueOf(dbl)
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i); // was at the end of get .doubleValue()
            System.out.println(i + " ---> " + value);
        }

    }
}
