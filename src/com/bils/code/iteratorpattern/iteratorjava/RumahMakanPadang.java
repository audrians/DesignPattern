package com.bils.code.iteratorpattern.iteratorjava;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by nabilla on 3/10/16.
 */
public class RumahMakanPadang implements Menu {

    private ArrayList<MenuItem> menuItems;

    public RumahMakanPadang() {
        menuItems = new ArrayList();
        addItem("Rendang", "Daging sapi dimasak pedas", 15000, false);
        addItem("Lontong Sayur", "Lontong yang disiram dengan sayur labu siam", 12000, true);
        addItem("Sate Padang", "Daging kambing yang dibakar dan disiram saus padang", 18000, false);
    }

    private void addItem(String name, String desc, double price, boolean vege) {
        menuItems.add(new MenuItem(name, desc, price, vege));
    }

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
