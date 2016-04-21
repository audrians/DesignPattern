package com.bils.code.factorypattern.factorypattern;

/**
 * Created by nabilla on 2/5/16.
 */
public class ChicagoStyleCheesePizza extends Pizza{

    private static String TAG = ChicagoStyleCheesePizza.class.getSimpleName();

    public ChicagoStyleCheesePizza() {
        name = "Chicago style deep dish cheese pizza";
        dough = "Thick crust dough";
        sauce = "Tomato Sauce";

        topping.add("Mozzarella Cheese");
    }

    public void cut() {
        System.out.println("cut: Cut the pizza into square slice");
    }
}
