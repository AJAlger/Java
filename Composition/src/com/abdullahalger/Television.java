package com.abdullahalger;

/**
 * Created by Abdullah-Mac on 2/2/16.
 */
public class Television {

    public String manufacturer;
    public int width;
    public int height;
    public String type;

    public Television(String manufacturer, int width, int height, String type) {
        this.manufacturer = manufacturer;
        this.width = width;
        this.height = height;
        this.type = type;
    }

    public void tvPowerButton() {
        System.out.println("Turning TV on");
    }

    public void changeChannel(int channel) {
        System.out.println("Changing the tv channel to channel " + channel);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getType() {
        return type;
    }
}
