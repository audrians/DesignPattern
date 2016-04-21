package com.bils.code.adapterpattern;

public class Main {

    public static void main(String[] args) {
	// write your code here

        HuaweiHonor3C huawei = new HuaweiHonor3C();
        MotoG360 moto = new MotoG360();

        Smartphone smartwatchAdapter = new SmartwatchAdapter(moto);
        smartwatchAdapter.showHomeScreen();
        smartwatchAdapter.openApp();
        smartwatchAdapter.showNotification();

        showBehavior(huawei);
        showBehavior(smartwatchAdapter);
    }

    private static void showBehavior(Smartphone smartphone) {
        smartphone.showHomeScreen();
        smartphone.openApp();
        smartphone.showNotification();
    }
}
