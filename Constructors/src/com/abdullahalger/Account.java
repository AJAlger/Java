package com.abdullahalger;

/**
 * Created by Abdullah-Mac on 1/31/16.
 */
public class Account {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    public Account() {
        // setting a default
        this("33444", 0, "Default name", "email Default", "phone Default");
    }

    public Account(String accountNumber, double accountBalance, String customerName, String emailAddress, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {return this.accountNumber;}

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {return this.accountBalance;}

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {return this.customerName;}

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {return this.emailAddress;}

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {return this.phoneNumber;}

    public void deposit(double depositAmount) {
        this.accountBalance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " added to account.\nBalance is now: " + this.accountBalance);
    }

    public void withdrawal(double withdrawAmount) {
        if (withdrawAmount > this.accountBalance) {
            System.out.println("Insufficient funds");
        } else {
            this.accountBalance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " processed.\nRemaining balance is: " + this.accountBalance);
        }
    }
}
