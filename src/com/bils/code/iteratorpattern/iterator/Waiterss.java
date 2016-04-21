package com.bils.code.iteratorpattern.iterator;

/**
 * Created by nabilla on 3/9/16.
 */
public class Waiterss {

    private RumahMakanJawa rumahMakanJawa;

    private RumahMakanPadang rumahMakanPadang;

    public Waiterss(RumahMakanJawa rumahMakanJawa, RumahMakanPadang rumahMakanPadang) {
        this.rumahMakanJawa = rumahMakanJawa;
        this.rumahMakanPadang = rumahMakanPadang;
    }

    public void printMenu() {
        Iterator rmPadangIterator = rumahMakanPadang.createIterator();
        Iterator rmJawaIterator = rumahMakanJawa.createIterator();
        System.out.println("Menu Makanan Padang");
        printMenu(rmPadangIterator);
        System.out.println("Menu Makanan Jawa");
        printMenu(rmJawaIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + "," + menuItem.getDescription() + "," + menuItem.getPrice());
        }
    }
}
