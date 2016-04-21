package com.bils.code.iteratorpattern.iteratorjava;

import java.util.Iterator;

/**
 * Created by nabilla on 3/9/16.
 */
public class Waiterss {

    private Menu rumahMakanJawa;

    private Menu rumahMakanPadang;

    private Menu rumahMakanBali;

    public Waiterss(Menu rumahMakanJawa, Menu rumahMakanPadang, Menu rumahMakanBali) {
        this.rumahMakanJawa = rumahMakanJawa;
        this.rumahMakanPadang = rumahMakanPadang;
        this.rumahMakanBali = rumahMakanBali;
    }

    public void printMenu() {
        Iterator rmPadangIterator = rumahMakanPadang.createIterator();
        Iterator rmJawaIterator = rumahMakanJawa.createIterator();
        Iterator rmBaliIterator = rumahMakanBali.createIterator();
        System.out.println("Menu Makanan Padang");
        printMenu(rmPadangIterator);
        System.out.println("Menu Makanan Jawa");
        printMenu(rmJawaIterator);
        System.out.println("Menu Makanan Bali");
        printMenu(rmBaliIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + "," + menuItem.getDescription() + "," + menuItem.getPrice());
        }
    }
}
