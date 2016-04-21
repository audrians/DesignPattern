package com.bils.code.factorypattern.simplefactory;

/**
 * Created by nabilla on 2/5/16.
 */
public class PepperoniPizza extends Pizza {

    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        dough = "Thick Dough";
        sauce = "Tomato souce";

        topping.add("Mozarella Cheese");
    }
}
