package com.bils.code.iteratorpattern.iteratorjava;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by nabilla on 3/10/16.
 */
public class RumahMakanBali implements Menu {

    private Hashtable menuItems = new Hashtable();

    public RumahMakanBali() {
        addItem("Ayam Betutu", "Olahan ayam berlimpah rempah-rempah pedas", 18000, false);
        addItem("Sate Lilit", "Sate daging cincang lilit", 19000, false);
        addItem("Rujak kuah pindang", "Rujak mangga dengan siraman kuah pindang pedas", 20000, true);
    }

    private void addItem(String name, String desc, double price, boolean vege) {
        MenuItem menuItem = new MenuItem(name, desc, price, vege);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
