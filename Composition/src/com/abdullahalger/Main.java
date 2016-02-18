package com.abdullahalger;

public class Main {

    public static void main(String[] args) {
//        Dimensions dimensions = new Dimensions(20, 20, 5);
//        Case theCase = new Case("2208", "Dell", "240", dimensions);
//
//        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1140));
//
//        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "V2.44");
//
//        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//        thePC.powerUp();

        Windows windows = new Windows();
        Television television = new Television("Sony", 46, 46, "Smart TV");

        LivingRoom livingRoom = new LivingRoom(television, windows);

        livingRoom.turnOnTV();
        livingRoom.changeTVChannel(4);
        livingRoom.openingWindow();
        livingRoom.lockingWindow();
    }
}
