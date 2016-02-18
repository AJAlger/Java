package com.abdullahalger;

/**
 * Created by Abdullah-Mac on 2/4/16.
 */
public class HealthyBurger extends Burger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "Brown Rye", meat, price);
    }

    public void addHealthyExtra1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyExtra2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeBurger() {
        double burgerPrice = super.itemizeBurger();
        if (this.healthyExtra1Name != null) {
            burgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " at an extra " + this.healthyExtra1Price);

        }
        if (this.healthyExtra2Name != null) {
            burgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " at an extra " + this.healthyExtra2Price);
        }
        return burgerPrice;
    }
}
