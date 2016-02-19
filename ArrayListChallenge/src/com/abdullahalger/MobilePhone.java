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
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }

        this.contacts.add(contact);
        return true;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for (int i = 0; i < this.contacts.size(); i++) {
            System.out.println((i+1) + ". "
                    + this.contacts.get(i).getName() + " -> "
                    + this.contacts.get(i).getNumber());
        }
    }


    private int findContact(String contactName) {
        for (int i = 0; i < this.contacts.size(); i++) {
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

    public String queryContact(Contacts contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }

        return null;
    }

    public Contacts queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.contacts.get(position);
        }
        return null;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " is not found");
            return false;
        }
        this.contacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced by " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contacts contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " is not found");
            return false;
        }
        this.contacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted");
        return true;
    }


}
