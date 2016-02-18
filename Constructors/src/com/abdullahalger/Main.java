package com.abdullahalger;

public class Main {

    public static void main(String[] args) {
//        Account myAccount = new Account();//("12345", 10000, "Abdullah", "abdullahalger@me.com", "555-1212");
//
//        myAccount.withdrawal(400);
//        myAccount.withdrawal(100);
//        myAccount.deposit(1200000);
//        myAccount.withdrawal(1209500);

        VipCustomer myVip = new VipCustomer("Abdullah", 1000);
        System.out.println(myVip.getName() + "\n" + myVip.getEmail() + "\ncredit limit: " + myVip.getCreditLimit());
    }
}
