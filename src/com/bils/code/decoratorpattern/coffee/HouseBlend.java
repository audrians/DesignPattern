package com.bils.code.decoratorpattern.coffee;

import com.bils.code.decoratorpattern.beverage.Beverage;
import com.bils.code.decoratorpattern.size.Size;

/**
 * Created by nabilla on 4/7/16.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(Size sizeGlass) {
        super(sizeGlass);
        description = "House Blend Coffee";
    }

    @Override
    public double getComponentCost() {
        return 0.89;
    }
}
