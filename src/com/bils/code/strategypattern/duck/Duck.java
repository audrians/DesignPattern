package com.bils.code.strategypattern.duck;

/**
 * Created by nabilla on 3/20/16.
 */
public abstract class Duck {

    public FlyBehavior flyBehavior;

    public QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void flyPerform() {
        flyBehavior.fly();
    }

    public void quackPerform() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
