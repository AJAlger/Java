package com.abdullahalger;

/**
 * Created by Abdullah-Mac on 2/3/16.
 */
public class Windows {

    public Windows() {
    }

    public void isOpened(boolean window) {
        if (window) {
            System.out.println("Window is opened");
        } else {
            System.out.println("Window is closed");
        }
    }

    public void isLocked(boolean lock) {
        if (lock) {
            System.out.println("Window is locked");
        } else {
            System.out.println("Window is unlocked");
        }
    }

}
