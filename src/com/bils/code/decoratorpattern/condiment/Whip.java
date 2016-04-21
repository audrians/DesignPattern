package com.bils.code.decoratorpattern.condiment;

import com.bils.code.decoratorpattern.beverage.Beverage;
import com.bils.code.decoratorpattern.beverage.CondimentDecorator;

/**
 * Created by nabilla on 4/7/16.
 */
public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", Whip";
    }

    @Override
    public double getComponentCost() {
        return 0.10 + getBeverage().cost();
    }
}
