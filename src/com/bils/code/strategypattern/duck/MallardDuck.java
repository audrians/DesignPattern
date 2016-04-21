package com.bils.code.strategypattern.duck;

/**
 * Created by nabilla on 3/20/16.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm the real duck");
    }
}
