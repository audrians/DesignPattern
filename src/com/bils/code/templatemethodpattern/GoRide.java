package com.bils.code.templatemethodpattern;

/**
 * Created by nabilla on 3/4/16.
 */
public class GoRide extends Gojek {

    public GoRide() {
        pay = new PayCash();
    }

    @Override
    public void orderGojek() {
        System.out.println("You ordered ojek for your transportation");
    }

    @Override
    public void deliveredToCustomer() {
        System.out.println("You've been arrive to your destination location");
    }
}
