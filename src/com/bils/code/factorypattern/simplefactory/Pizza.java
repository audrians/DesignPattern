package com.bils.code.factorypattern.simplefactory;

import java.util.ArrayList;

/**
 * Created by nabilla on 2/5/16.
 */
public abstract class Pizza {

    public String name;

    public String dough;

    public String sauce;

    public ArrayList topping = new ArrayList();

    public void prepare() {
        String prepareText = "";
        prepareText += "Preparing " + name;
        prepareText += "\nTossing dough...";
        prepareText += "\nAdding sauce....";
        prepareText += "\nAdding topping...";
        for (int i=0; i<topping.size(); i++) {
            prepareText += "\n" + topping.get(i);
        }
        System.out.println("prepare: " + prepareText);
    }

    public void bake() {
        System.out.println("bake: Bake for 25 minutes");
    }

    public void cut() {
        System.out.println("cut: Cut the pizza into diagonal slice");
    }

    public void box() {
        System.out.println("box: Place pizza in official PizzaBox");
    }

    public String getName() {
        return name;
    }
}
