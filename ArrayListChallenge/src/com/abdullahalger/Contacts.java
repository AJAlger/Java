package com.abdullahalger;

/**
 * Created by Abdullah-Mac on 2/19/16.
 */
public class Contacts {

    private String name;
    private String number;

    public Contacts(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    // calling constructor to create a new contact record
    // factory method

    public static Contacts createContact(String name, String number) {
        return new Contacts(name, number);
    }

}
