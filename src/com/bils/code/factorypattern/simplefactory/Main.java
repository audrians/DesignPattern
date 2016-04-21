package com.bils.code.factorypattern.simplefactory;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        pizzaStore.orderPizza("cheese");
    }
}
