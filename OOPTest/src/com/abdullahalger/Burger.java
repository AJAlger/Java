package com.abdullahalger;

/**
 * Created by Abdullah-Mac on 2/4/16.
 */
public class Burger {

    private String name;
    private String breadRolltype;
    private String meat;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;


    public Burger(String name, String breadRolltype, String meat, double price) {
        this.name = name;
        this.breadRolltype = breadRolltype;
        this.meat = meat;
        this.price = price;
    }

    public void addBurgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addBurgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addBurgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addBurgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeBurger() {
        double burgerPrice = this.price;
        System.out.println(this.name + " hamburger with " + this.meat + " on a " + this.breadRolltype + " bun is " + this.price);
        if (this.addition1Name != null) {
            burgerPrice += addition1Price;
            System.out.println("Added " + this.addition1Name + " at an extra " + this.addition1Price);
        }
        if (this.addition2Name != null) {
            burgerPrice += addition2Price;
            System.out.println("Added " + this.addition2Name + " at an extra " + this.addition2Price);
        }
        if (this.addition3Name != null) {
            burgerPrice += addition3Price;
            System.out.println("Added " + this.addition3Name + " at an extra " + this.addition3Price);
        }
        if (this.addition4Name != null) {
            burgerPrice += addition4Price;
            System.out.println("Added " + this.addition4Name + " at an extra " + this.addition4Price);
        }
        return burgerPrice;
    }
}
