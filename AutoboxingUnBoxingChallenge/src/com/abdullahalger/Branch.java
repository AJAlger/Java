package com.abdullahalger;

import java.util.ArrayList;

/**
 * Created by Abdullah-Mac on 2/20/16.
 */
public class Branch {

    private ArrayList<Customer> customers;

    private String name;

    public Branch(ArrayList<Customer> customers, String name) {
        this.customers = new ArrayList<Customer>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addNewCustomer(String name, double initialAmount) {
        if (findCustomer(name) == null) {
            this.customers.add(new Customer(initialAmount, name));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double amount) {
        Customer existingCustomer = findCustomer(name);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name) {
        for (int i = 0; i < customers.size(); i++) {
            Customer checkCustomer = this.customers.get(i);
            if (checkCustomer.getName().equals(name)) {
                return checkCustomer;
            }
        }
        return null;
    }
}
