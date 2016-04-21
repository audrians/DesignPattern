package com.bils.code.factorypattern.factorypattern;

public class Main {

    public static void main(String[] args) {
	// write your code here

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyPizza = nyStore.orderPizza("cheese");
        System.out.println("Pesan " + nyPizza.getName());

        Pizza chicagoPizza = chicagoStore.orderPizza("cheese");
        System.out.println("Pesan " + chicagoPizza.getName());
    }
}
