package com.bils.code.strategypattern.duck;

/**
 * Created by nabilla on 3/20/16.
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can fly with wing");
    }
}
