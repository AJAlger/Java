package com.abdullahalger;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	    //printMegaBytesAndKiloBytes(1024);
	    //bark(true, 1);
        //areEqualByThreeDecimalPlaces(3.1756, 3.175);

        hasEqualSum(1, -1, 0);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else if (kiloBytes == 0) {
            System.out.println("0 KB = 0 MB and 0 KB");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainderKiloBytes = kiloBytes % 1024;
            System.out.printf("%d KB = %d MB and %d KB", kiloBytes, megaBytes, remainderKiloBytes);
        }
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if ((hourOfDay < 8 || hourOfDay > 22) && barking) {
            return true;
        }
        return false;
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);

    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {

        firstNum = firstNum * 1000;
        secondNum =  secondNum * 1000;

        int a1 = (int) firstNum;
        int a2 = (int) secondNum;

        return a1 == a2;
    }


    public static boolean hasEqualSum(int a, int b, int c) {

        return a + b == c;
    }


    public static boolean hasTeen(int a, int b, int c) {

        if (a > 12 && a < 20) {
            return true;
        }

        else if (b > 12 && b < 20) {
            return true;
        }

        else if (c > 12 && c < 20) {
            return true;
        } else {

            return false;
        }

    }
}
