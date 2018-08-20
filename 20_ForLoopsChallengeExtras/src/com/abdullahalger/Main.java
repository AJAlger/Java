package com.abdullahalger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Total: " + sumOdd(1, 100));
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }

        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0 || end <= start) {
            return -1;
        }

        int total = 0;

        for (int i = start; i < end; i++) {
            if (isOdd(i)) {
                total += i;
            }
        }

        return total;
    }
}
