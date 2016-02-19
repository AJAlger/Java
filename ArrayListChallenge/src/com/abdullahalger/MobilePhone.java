package com.abdullahalger;

import java.util.ArrayList;

/**
 * Created by Abdullah-Mac on 2/19/16.
 */
public class MobilePhone {

    private ArrayList<Contacts> contacts;

    public MobilePhone() {
        this.contacts = new ArrayList<Contacts>();
    }

    public boolean addNewContact(Contacts contact) {
        if (findContact(contact.getName()) > 0) {
            System.out.println("Contact is already on file");
            return false;
        }

        contact.add(contact);
        return true;
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.contacts.size; i++) {
            Contacts contact = this.contacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(Contacts contact) {
        return this.contacts.indexOf(contact);

    }

    public boolean updateContact(Contacts oldContact, Contacts newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " is not found");
            return false;
        }
        this.contacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced by " + newContact.getName());
    }

    public void removeContact() {

    }

    public static void searchContact() {

    }
}
