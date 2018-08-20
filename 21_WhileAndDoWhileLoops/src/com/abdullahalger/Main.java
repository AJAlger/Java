package com.abdullahalger;

public class Main {

    public static void main(String[] args) {
//        int count = 0;
//        while (count != 5) {
//            System.out.println("count is " + count);
//            count++;
//        }
//        count = 1;
//        while (true) {
//            if (count == 5) {
//                break;
//            }
//            System.out.println("count is " + count);
//            count++;
//        }
//
//        count = 1;
//        do {
//            System.out.println("count value is " + count);
//            count++;
//        } while (count != 6);

        int evenCount = 0;
        int number = 100;
        int finishNumber = 200;
        while (number < finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }

//            else if (evenCount >= 5) {
//                break;
//            }
            System.out.println(number);
            number++;
            evenCount++;
        }
        System.out.println(evenCount);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

}
