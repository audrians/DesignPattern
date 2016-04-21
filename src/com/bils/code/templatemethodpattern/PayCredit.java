package com.bils.code.templatemethodpattern;

/**
 * Created by nabilla on 4/20/16.
 */
public class PayCredit implements Pay {

    public PayCredit() {
    }

    @Override
    public void payStatus() {
        System.out.println("You paid with credit for the driver");
    }
}
