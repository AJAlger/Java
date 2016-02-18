package com.abdullahalger;

/**
 * Created by Abdullah-Mac on 2/1/16.
 */
public class Ferrari extends Car {

    private int roadServiceMonths;

    public Ferrari(int roadServiceMonths) {
        super(4, 4, 2, "Red", 2, "2016", false, "coupe", "Spider", 6, true);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newSpeed = getCurrentVelocity() + rate;
        if (newSpeed == 0) {
            stop();
            changeGear(1);
        } else if (newSpeed > 0 && newSpeed <= 10) {
            changeGear(1);
        } else if (newSpeed > 10 && newSpeed <= 20) {
            changeGear(2);
        } else if (newSpeed > 20 && newSpeed <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if (newSpeed > 0) {
            changeVelocity(newSpeed, getCurrentDirection());
        }
    }
}
