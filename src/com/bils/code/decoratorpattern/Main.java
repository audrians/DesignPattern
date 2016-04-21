package com.bils.code.decoratorpattern;

import com.bils.code.decoratorpattern.beverage.Beverage;
import com.bils.code.decoratorpattern.coffee.DarkRoast;
import com.bils.code.decoratorpattern.condiment.Milk;
import com.bils.code.decoratorpattern.condiment.Mocha;
import com.bils.code.decoratorpattern.size.Grande;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Beverage beverage1 = new DarkRoast(new Grande());
        beverage1 = new Milk(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println("Order: " + beverage1.getDescription());
        System.out.println("total price: " + beverage1.cost());
    }
}
