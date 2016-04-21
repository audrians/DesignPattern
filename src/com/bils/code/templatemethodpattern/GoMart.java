package com.bils.code.templatemethodpattern;

/**
 * Created by nabilla on 3/4/16.
 */
public class GoMart extends Gojek {

    public GoMart() {
        pay = new PayCash();
    }

    @Override
    public void orderGojek() {
        System.out
            .println("You ordered some stuffs from our market and success added stuffs to cart");
    }

    @Override
    public void deliveredToCustomer() {
        System.out.println("Your stuffs is coming and arrive to your location");
    }

}
