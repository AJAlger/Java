package com.abdullahalger;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by Abdullah-Mac on 2/27/16.
 */
public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        addInOrder(placesToVisit, "Seattle");

        addInOrder(placesToVisit, "Olympia");

        addInOrder(placesToVisit, "Tacoma");

        addInOrder(placesToVisit, "Anacortes");

        addInOrder(placesToVisit, "Shelton");

        printList(placesToVisit);

        addInOrder(placesToVisit, "Forks");

        addInOrder(placesToVisit, "Tacoma");

        printList(placesToVisit);

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

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

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