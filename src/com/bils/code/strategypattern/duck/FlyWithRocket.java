package com.bils.code.strategypattern.duck;

/**
 * Created by nabilla on 3/20/16.
 */
public class FlyWithRocket implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm fly with rocket");
    }
}
