package com.abdullahalger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int total = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                total += i;
                count++;
                System.out.println("Found Number: " + i);
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("Count: " + count);
        System.out.println("Total: " + total);
    }

}
