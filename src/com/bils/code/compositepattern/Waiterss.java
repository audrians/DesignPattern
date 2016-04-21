package com.bils.code.compositepattern;

import java.util.Iterator;

/**
 * Created by nabilla on 3/11/16.
 */
public class Waiterss {

    MenuComponent allMenu;

    public Waiterss(MenuComponent allMenu) {
        this.allMenu = allMenu;
    }

    public void printMenu() {
        allMenu.print();
    }

    public void printMenuVegetarian() {
        Iterator iterator = allMenu.createIterator();
        System.out.println("======= Vege Menu =========");

        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();

            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {}
        }
    }
}
