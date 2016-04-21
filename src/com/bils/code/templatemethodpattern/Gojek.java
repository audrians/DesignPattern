package com.bils.code.templatemethodpattern;

/**
 * Created by nabilla on 3/4/16.
 */
public abstract class Gojek {

    public Pay pay;

    public final void processSteps() {
        orderGojek();
        waitingForDriver();
        deliveringByDriver();
        deliveredToCustomer();
        payPerform();
        giveRating();
    }

    public abstract void orderGojek();

    public abstract void deliveredToCustomer();

    private void deliveringByDriver() {
        System.out.println("Driver is going to customer location from origin location");
    }

    private void waitingForDriver() {
        System.out.println("Please wait a while, we will contact you if you get a driver");
    }

    private void giveRating() {
        System.out.println("You've given rating for app and driver, Thanks for ordering!");
    }

    public void payPerform() {
        pay.payStatus();
    }

    public void setPay(Pay pay) {
        this.pay = pay;
    }
}
