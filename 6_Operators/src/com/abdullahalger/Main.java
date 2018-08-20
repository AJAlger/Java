package com.abdullahalger;

public class Main {

    public static void main(String[] args) {

        boolean isAlien = false;
        if (isAlien)
            System.out.println("Not an alien!");

        int topScore = 100;
        if (topScore >= 100)
            System.out.println("You got the high score!");

        int secondTopScore = 95;

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of the tests is true");

        int newVal = 50;
        if (newVal == 50)
            System.out.println(newVal + " is true");

        boolean isCar = true;
        if (isCar) {
            System.out.println("this should not happen");
        } else {
            System.out.println("this is false");
        }

        boolean wasCar = isCar;
        System.out.println(wasCar);


        double numFirst = 20d;
        double numSecond = 80d;

        double total = (numFirst + numSecond) * 25d;

        System.out.println(total);

        double remainderOfTotal = total % 40;

        System.out.println(remainderOfTotal);

        if (remainderOfTotal <= 20)
            System.out.println("Total was over the limit!");

    }
}
