package com.abdullahalger;

/**
 * Created by Abdullah-Mac on 2/4/16.
 */
public class DeluxeBurger extends Burger {

    public DeluxeBurger() {
        super("Deluxe Burger", "White", "1 pound of beef", 14.50);
        super.addBurgerAddition1("Chips", 2.00);
        super.addBurgerAddition2("Coke", 2.50);
    }

    @Override
    public void addBurgerAddition1(String name, double price) {
        System.out.println("cannot add additional items");
    }

    @Override
    public void addBurgerAddition2(String name, double price) {
        System.out.println("cannot add additional items");
    }

    @Override
    public void addBurgerAddition3(String name, double price) {
        System.out.println("cannot add additional items");
    }

    @Override
    public void addBurgerAddition4(String name, double price) {
        System.out.println("cannot add additional items");
    }
}
