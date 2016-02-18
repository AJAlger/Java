package com.abdullahalger;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Ink level = " + printer.tonerLevel());
        printer.fillToner(50);
        System.out.println("Ink level = " + printer.tonerLevel());
        printer.fillToner(50);
        System.out.println("Ink level = " + printer.tonerLevel());
        printer.print(3);
        System.out.println("Pages printed = " + printer.getPagesPrinted());
        System.out.println("Ink level = " + printer.tonerLevel());
        printer.fillToner(2);
        System.out.println("Ink level = " + printer.tonerLevel());
        printer.print(200);
        System.out.println("Pages printed = " + printer.getPagesPrinted());
        System.out.println("Ink level = " + printer.tonerLevel());
        System.out.println("//----------------------------------//");
        Printer printer1 = new Printer(100, false);
        System.out.println("Ink level = " + printer1.tonerLevel());
        printer1.fillToner(50);
        printer1.print(3);
        System.out.println("Pages printed = " + printer1.getPagesPrinted());
        System.out.println("Ink level = " + printer1.tonerLevel());
        printer1.print(100);
        System.out.println("Pages printed = " + printer1.getPagesPrinted());
        System.out.println("Ink level = " + printer1.tonerLevel());
        printer1.print(99);
        System.out.println("Pages printed = " + printer1.getPagesPrinted());
        System.out.println("Ink level = " + printer1.tonerLevel());
        printer1.print(97);
        System.out.println("Pages printed = " + printer1.getPagesPrinted());
        System.out.println("Ink level = " + printer1.tonerLevel());

    }
}
