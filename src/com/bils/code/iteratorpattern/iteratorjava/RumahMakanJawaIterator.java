package com.bils.code.iteratorpattern.iteratorjava;

import java.util.Iterator;

/**
 * Created by nabilla on 3/10/16.
 */
public class RumahMakanJawaIterator implements Iterator {

    private MenuItem[] menuItems;

    private int position = 0;

    public RumahMakanJawaIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position += 1;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }

        if (menuItems[position-1] != null) {
            for (int i=position-1; i < menuItems.length; i++) {
                menuItems[i] = menuItems[i+1];
            }
            menuItems[menuItems.length-1] = null;
        }
    }
}
