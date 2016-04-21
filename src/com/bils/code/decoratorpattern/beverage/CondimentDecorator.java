package com.bils.code.decoratorpattern.beverage;

/**
 * Created by nabilla on 4/7/16.
 */
public abstract class CondimentDecorator extends Beverage {

    private Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public abstract String getDescription();
}
