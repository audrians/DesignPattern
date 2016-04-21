package com.bils.code.strategypattern.duck;

/**
 * Created by nabilla on 3/20/16.
 */
public class Squack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I can squack");
    }
}
