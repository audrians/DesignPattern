package com.bils.code.factorypattern.simplefactory;

/**
 * Created by nabilla on 2/5/16.
 */
public class CheesePizza extends Pizza {

    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "thin crust dough";
        sauce = "cheese sauce";

        topping.add("Gratted Regiano Cheese");
    }
}
