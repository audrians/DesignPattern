package com.bils.code.decoratorpattern.condiment;

import com.bils.code.decoratorpattern.beverage.Beverage;
import com.bils.code.decoratorpattern.beverage.CondimentDecorator;

/**
 * Created by nabilla on 4/7/16.
 */
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getComponentCost() {
        return 0.10 + getBeverage().cost();
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", Milk";
    }
}
