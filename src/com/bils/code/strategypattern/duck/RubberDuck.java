package com.bils.code.strategypattern.duck;

/**
 * Created by nabilla on 3/20/16.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squack();
    }

    @Override
    public void display() {
        System.out.println("I'm a duck toy");
    }
}
