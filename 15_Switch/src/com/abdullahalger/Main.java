package com.abdullahalger;

public class Main {

    public static void main(String[] args) {
//	    int switchValue = 4;
//        switch (switchValue) {
//            case 1:
//                System.out.println("value is 1");
//                break;
//            case 2:
//                System.out.println("value is 2");
//                break;
//            default:
//                System.out.println("was not 1 or 2");
//                break;
//        }

        char letter = 'B';
        switch (letter) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("You chose the letter " + letter);
                break;
            default:
                System.out.println("The letter A, B, C, or D was not chosen");
                break;
        }

        String month = "May";
        switch (month.toLowerCase()) {
            case "march":
                System.out.println("Month is March");
                break;
            case "april":
                System.out.println("Month is April");
                break;
            default:
                System.out.println("Your month is not here");
        }

    }
}
