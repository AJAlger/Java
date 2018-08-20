package com.abdullahalger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.print(sumFirstAndLastDigit(10));
        System.out.println(getEvenDigitSum(1234));
    }

    public static boolean isPalindrome(int number) {

        int palindrome = number;
        int reverse = 0;

        while(palindrome != 0) {
            int lastDigit = palindrome % 10;
            reverse = reverse * 10 + lastDigit;
            palindrome /= 10;
        }

        return number == reverse;
    }

    public static int sumFirstAndLastDigit(int number) {

        int reverse = 0;
        int lastDigit = 0;

        while(number != 0) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        return lastDigit % 10 + number % 10;
    }

//    public static int sumFirstAndLastDigit(int number) {
//        int x = number;
//        int reverse = 0;
//        int num = number % 10;
//        int last = 0;
//        while (number != 0) {
//            last = number % 10;
//            reverse = reverse * 10;
//            reverse = reverse + last;
//            number = number / 10;
//        }
//        if (x < 0) {
//            return -1;
//        } else {
//            return (last % 10 + num % 10);
//        }
//    }

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int total = 0;
        int reverse = 0;

        while(number != 0) {
            int last = number % 10;

            if (last % 2 == 0) {
                total += last;
            }
            reverse = reverse * 10;
            reverse = reverse + last;
            number = number / 10;
        }

        return total;
    }

}
