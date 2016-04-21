package com.bils.code.factorypattern.factorypattern;

/**
 * Created by nabilla on 2/5/16.
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        }

        return pizza;
    }
}
