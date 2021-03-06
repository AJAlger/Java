package com.abdullahalger;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by Abdullah-Mac on 2/27/16.
 */
public class Demo {

    // Linked list demo

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        addInOrder(placesToVisit, "Seattle");
        addInOrder(placesToVisit, "Olympia");
        addInOrder(placesToVisit, "Tacoma");
        addInOrder(placesToVisit, "Anacortes");
        addInOrder(placesToVisit, "Shelton");
        printList(placesToVisit);
        addInOrder(placesToVisit, "Forks");
        addInOrder(placesToVisit, "Levenworth");
        addInOrder(placesToVisit, "Olympia");
        printList(placesToVisit);

        visit(placesToVisit);

//        placesToVisit.add("Seattle");
//        placesToVisit.add("Olympia");
//        placesToVisit.add("Tacoma");
//        placesToVisit.add("Shelton");
//        placesToVisit.add("San Juan Islands");
//
//        printList(placesToVisit);
//        placesToVisit.remove(4);
//        printList(placesToVisit);
//
//        findItem(placesToVisit, "Tacoma");


    }

    private static void printList(LinkedList<String> linkedList) {
        // equivalent to for loop
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            // while the list has an entry
            System.out.println("Now visiting " + i.next());
            // i.next() gives current record then moves to next
        }
        System.out.println("===========================");
    }

    private static void findItem(LinkedList<String> linkedList, String item) {
        System.out.println(linkedList.indexOf(item));
    }

    private static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in the itinerary");
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the end of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }

    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                            "1 - to go to next city\n" +
                            "2 - to go to previous city\n" +
                            "3 - print menu options"
        );
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        // this is just a setup for the list
        // linked list stores a method to the item, the previous item, and the next item
        ListIterator<String> stringListIterator = linkedList.listIterator();
        // need to use .next() to point to the first instance

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                // new city should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                // move on next city

            }
        }
        stringListIterator.add(newCity);
        return true;
    }

}
