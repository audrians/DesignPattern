package com.bils.code.adapterpattern;

/**
 * Created by nabilla on 2/26/16.
 */
public class MotoG360 implements Smartwatch {

    @Override
    public void showFaceWatch() {
        System.out.println("Face watch is showing");
    }

    @Override
    public void openApp() {
        System.out.println("Simple App is opening");
    }

    @Override
    public void showNotification() {
        System.out.println("Watch notification is showing");
    }
}
