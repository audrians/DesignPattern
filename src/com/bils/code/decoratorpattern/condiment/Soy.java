package com.bils.code.decoratorpattern.condiment;

import com.bils.code.decoratorpattern.beverage.Beverage;
import com.bils.code.decoratorpattern.beverage.CondimentDecorator;

/**
 * Created by nabilla on 4/7/16.
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return getBeverage().getDescription() + ", Soy";
    }

    @Override
    public double getComponentCost() {
        return 0;
    }
}
