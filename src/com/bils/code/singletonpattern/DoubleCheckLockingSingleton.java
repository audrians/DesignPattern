package com.bils.code.singletonpattern;

/**
 * Created by nabilla on 4/20/16.
 */
public class DoubleCheckLockingSingleton {

    private volatile static DoubleCheckLockingSingleton instance;

    private DoubleCheckLockingSingleton() {
        print();
    }

    public static DoubleCheckLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }

    private void print() {
        System.out.println("Double Check Locking Singleton pattern implementation");
    }
}
