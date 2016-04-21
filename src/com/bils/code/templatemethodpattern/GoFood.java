package com.bils.code.templatemethodpattern;

/**
 * Created by nabilla on 3/4/16.
 */
public class GoFood extends Gojek {

    public GoFood() {
        pay = new PayCash();
    }

    @Override
    public void orderGojek() {
        System.out.println("You ordered some foods and success added food to cart");
    }

    @Override
    public void deliveredToCustomer() {
        System.out.println("Your food is coming and arrive to your location");
    }
}
