package com.abdullahalger;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Rott", 10, 100, 2, 4, 1, 20, "short black");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
