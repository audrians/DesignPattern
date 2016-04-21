package com.bils.code.decoratorpattern.condiment;

import com.bils.code.decoratorpattern.beverage.Beverage;
import com.bils.code.decoratorpattern.beverage.CondimentDecorator;

/**
 * Created by nabilla on 4/7/16.
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", Mocha";
    }

    @Override
    public double getComponentCost() {
        return 0.20 + getBeverage().cost();
    }
}
