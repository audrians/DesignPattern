package com.bils.code.singletonpattern;

/**
 * Created by nabilla on 4/20/16.
 */
public class LazilySingleton {

    private static LazilySingleton instance;

    private LazilySingleton() {
        print();
    }

    public static LazilySingleton getInstance() {
        if (instance == null) {
            instance = new LazilySingleton();
        }
        return instance;
    }

    private void print() {
        System.out.println("LazilySingleton pattern implementation");
    }
}
