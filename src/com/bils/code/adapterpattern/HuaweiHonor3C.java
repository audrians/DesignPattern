package com.bils.code.adapterpattern;

/**
 * Created by nabilla on 2/26/16.
 */
public class HuaweiHonor3C implements Smartphone {

    @Override
    public void showHomeScreen() {
        System.out.println("Home Screen is showing");
    }

    @Override
    public void openApp() {
        System.out.println("Complex App is opening");
    }

    @Override
    public void showNotification() {
        System.out.println("Phone notification is showing");
    }
}
