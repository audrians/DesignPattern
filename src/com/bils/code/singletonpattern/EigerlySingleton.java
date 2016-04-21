package com.bils.code.singletonpattern;

/**
 * Created by nabilla on 4/20/16.
 */
public class EigerlySingleton {

    private static EigerlySingleton instance = new EigerlySingleton();

    private EigerlySingleton() {
        print();
    }

    public static EigerlySingleton getInstance() {
        return instance;
    }

    private void print() {
        System.out.println("EigerlySingleton pattern implementation");
    }
}
