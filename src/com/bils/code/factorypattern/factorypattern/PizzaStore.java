package com.bils.code.factorypattern.factorypattern;

/**
 * Created by nabilla on 2/5/16.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = null;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.bake();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
