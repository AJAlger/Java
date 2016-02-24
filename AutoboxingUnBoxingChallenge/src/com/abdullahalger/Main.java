package com.abdullahalger;

public class Main {

    public static void main(String[] args) {

        // banking application

        // Bank class
        // should have an arraylist of Branches
        // each branch should have an arraylist of Customers

        // Customer class should have an arraylist of Doubles (transactions)

        // Customer:
        // Name, arraylist of doubles

        // Branch:
        // Add a new customer and initial transaction amount
        // Add additional transactions for the customer/branch

        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list of transactions

        // Demonstrate autoboxing and unboxing - on transactions

        // Add data validation, e.g. check if exists or does not exist

        Bank bank = new Bank("National US Bank");

        if (bank.addBranch("Seattle")) {
            System.out.println("Seattle branch created");
        }

        bank.addBranch("Seattle");
        bank.addCustomer("Seattle", "Abdullah", 500.23);
        bank.addCustomer("Seattle", "Omar", 403.76);
        bank.addCustomer("Seattle", "Dana", 305.54);

        bank.addBranch("Tacoma");
        bank.addCustomer("Tacoma", "Janet", 2300.32);
        bank.addCustomer("Tacoma", "Joan", 5003.76);

        bank.addCustomerTransaction("Seattle", "Abdullah", 100.32);
        bank.addCustomerTransaction("Tacoma", "Janet", 43.56);


        bank.listCustomers("Seattle", true);

        if (!bank.addCustomer("Sorenson", "Henry", 4.32)) {
            System.out.println("Error Sorenson branch does not exist");
        }

        if (!bank.addBranch("Seattle")) {

            System.out.println(" Seattle branch already exists");
        }

        if (!bank.addCustomerTransaction("Seattle", "Yester", 3.40)) {
            System.out.println("Customer does not exist");
        }

        if (!bank.addCustomer("Seattle", "Abdullah", 67.32)) {
            System.out.println("Customer Abdullah already exists");
        }

    }
}
