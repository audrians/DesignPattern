package com.bils.code.decoratorpattern.coffee;

import com.bils.code.decoratorpattern.beverage.Beverage;
import com.bils.code.decoratorpattern.size.Size;

/**
 * Created by nabilla on 4/7/16.
 */
public class DarkRoast extends Beverage {

    public DarkRoast(Size sizeGlass) {
        super(sizeGlass);
        description = "Dark Roast Cofee";
    }

    @Override
    public double getComponentCost() {
        return 0.99;
    }
}
