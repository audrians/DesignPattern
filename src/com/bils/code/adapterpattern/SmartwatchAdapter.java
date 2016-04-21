package com.bils.code.adapterpattern;

/**
 * Created by nabilla on 2/26/16.
 */

public class SmartwatchAdapter implements Smartphone {

    private Smartwatch smartwatch;

    public SmartwatchAdapter(Smartwatch smartwatch) {
        this.smartwatch = smartwatch;
    }

    @Override
    public void showHomeScreen() {
        smartwatch.showFaceWatch();
    }

    @Override
    public void openApp() {
        smartwatch.openApp();
    }

    @Override
    public void showNotification() {
        smartwatch.showNotification();
    }
}
