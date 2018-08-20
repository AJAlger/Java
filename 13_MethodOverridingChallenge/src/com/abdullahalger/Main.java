package com.abdullahalger;

public class Main {

    public static void main(String[] args) {

        //getDurationString(61, 00);
        getDurationString(9893912L);
    }

    public static int getDurationString(long minutes, long seconds) {

        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            System.out.println("Invalid value");
            return -1;
        }

        long hours = 0;

        if (minutes >= 60) {
            hours = minutes / 60;
            minutes = minutes % 60;
        }

        System.out.printf("%02dh, %02dm, %02ds", hours, minutes, seconds);
        return 0;
    }

    public static int getDurationString(long seconds) {

        if (seconds < 0) {
            System.out.println("Invalid Value");
            return -1;
        }

        long minutes = seconds / 60;
        seconds = seconds % 60;

        return getDurationString(minutes, seconds);
    }
}
