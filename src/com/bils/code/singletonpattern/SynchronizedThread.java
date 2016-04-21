package com.bils.code.singletonpattern;

/**
 * Created by nabilla on 4/20/16.
 */
public class SynchronizedThread {

    private static SynchronizedThread instance;

    private SynchronizedThread() {
        print();
    }

    public static SynchronizedThread getInstance() {
        if (instance == null) {
            instance = new SynchronizedThread();
        }
        return instance;
    }

    private void print() {
        System.out.println("Synchronized Thread pattern implementation");
    }
}
