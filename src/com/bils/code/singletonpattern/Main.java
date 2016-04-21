package com.bils.code.singletonpattern;

public class Main {

    public static void main(String[] args) {

//        SynchronizedThread.getInstance();
//        LazilySingleton.getInstance();
//        EigerlySingleton.getInstance();
        DoubleCheckLockingSingleton.getInstance();
    }
}
