package com.abdullahalger;

import java.util.ArrayList;

/**
 * Created by Abdullah-Mac on 2/20/16.
 */
public class Customer {

    private ArrayList<Double> transactions;
    private String name;

    public Customer(double initialAmount, String name) {
        this.transactions = new ArrayList<Double>();
        this.name = name;
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }


}
