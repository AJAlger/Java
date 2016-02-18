package com.abdullahalger;

public class Main {

    public static void main(String[] args) {
        Burger burger = new Burger("base", "brown", "beef", 4.50);
        burger.addBurgerAddition1("lettuce", 0.25);
        burger.addBurgerAddition2("mayo", 0.10);
        burger.addBurgerAddition3("cheese", 0.25);
        burger.addBurgerAddition4("onion", 0.15);
        System.out.println("total price: " + burger.itemizeBurger());

        System.out.println("// ----------------------------- //");
        HealthyBurger healthyBurger = new HealthyBurger("vegeburger", 5.67);
        healthyBurger.addHealthyExtra1("lettuce", 0.25);
        healthyBurger.addBurgerAddition1("cheese", 0.25);
        System.out.println("total price: " + healthyBurger.itemizeBurger());
        System.out.println("// ----------------------------- //");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addBurgerAddition3("lettuce", 2);
        deluxeBurger.itemizeBurger();


    }
}
