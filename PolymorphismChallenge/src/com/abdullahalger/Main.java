package com.abdullahalger;

class Car {

    private boolean engine;
    private int cyllinders;
    private int wheels;
    private String name;

    public Car(int cyllinders, String name) {
        this.engine = true;
        this.cyllinders = cyllinders;
        this.wheels = 4;
        this.name = name;
    }

    public void startEngine() {
        System.out.println("Engine started");
    }

    public void accelerate() {
        System.out.println("Accelerating ...");
    }

    public void brake() {
        System.out.println("Braking ...");
    }

    public int getCyllinders() {
        return cyllinders;
    }

    public String getName() {
        return name;
    }
}

class Ferrari extends Car {
    public Ferrari(int cyllinders, String name) {
        super(cyllinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Ferrari starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Ferrari accelerating ...");
    }

    @Override
    public void brake() {
        System.out.println("Ferrari braking ...");
    }
}

class Ford extends Car {
    public Ford(int cyllinders, String name) {
        super(cyllinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Ford starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Ford accelerating ...");
    }

    @Override
    public void brake() {
        System.out.println("Ford braking ...");
    }
}

class Lamborghini extends Car {
    public Lamborghini(int cyllinders, String name) {
        super(cyllinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Lambo starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Lambo accelerating ...");
    }

    @Override
    public void brake() {
        System.out.println("Lambo braking ...");
    }
}


public class Main {

    public static void main(String[] args) {

        Car car = new Car(4, "Simple car");
        car.startEngine();
        car.accelerate();
        car.brake();

        Ferrari ferrari = new Ferrari(8, "California");
        ferrari.startEngine();
        ferrari.accelerate();
        ferrari.brake();

        Ford ford = new Ford(8, "F350");
        ford.startEngine();
        ford.accelerate();
        ford.brake();

        Lamborghini lamborghini = new Lamborghini(12, "Aventador");
        lamborghini.startEngine();
        lamborghini.accelerate();
        lamborghini.brake();

    }

}
