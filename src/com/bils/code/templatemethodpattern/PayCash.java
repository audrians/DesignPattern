package com.bils.code.templatemethodpattern;

/**
 * Created by nabilla on 4/20/16.
 */
public class PayCash implements Pay {

    public PayCash() {
    }

    @Override
    public void payStatus() {
        System.out.println("You paid cash for the driver");
    }
}
