package com.abdullahalger;

/**
 * Created by Abdullah-Mac on 2/2/16.
 */
public class LivingRoom {

    private Television television;
    private Windows windows;

    public LivingRoom(Television television, Windows windows) {
        this.television = television;
        this.windows = windows;
    }

    public void turnOnTV() {
        System.out.println("Sitting in the livingroom watching TV");
        television.tvPowerButton();
    }

    public void changeTVChannel(int channel) {
        System.out.println("I don't like this channel. What should I watch?");
        television.changeChannel(channel);
    }

    public void openingWindow() {
        System.out.println("Opening the window for some air");
        open();
        windows.isOpened(true);
    }

    public void lockingWindow() {
        System.out.println("Locking the window.");
        lock();
        windows.isOpened(false);
    }

    private void lock() {
        windows.isLocked(true);
    }

    private void open() {
        windows.isLocked(false);
    }

}
