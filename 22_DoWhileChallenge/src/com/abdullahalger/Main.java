package com.abdullahalger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumDigits(32123));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int total = 0;

        do {

            total += number % 10;
            number /= 10;

        } while(number > 0);

        return total;
    }
}
