package com.bils.code.factorypattern.factorypattern;

/**
 * Created by nabilla on 2/5/16.
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY style sauce and cheese pizza";
        dough = "Thin crust dough";
        sauce = "Marinata Sauce";

        topping.add("Reggiano Cheese");
    }
}
