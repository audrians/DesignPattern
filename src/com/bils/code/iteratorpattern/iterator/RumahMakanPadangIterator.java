package com.bils.code.iteratorpattern.iterator;

import java.util.ArrayList;

/**
 * Created by nabilla on 3/9/16.
 */
public class RumahMakanPadangIterator implements Iterator {

    private ArrayList<MenuItem> menuItems;

    private int position = 0;

    public RumahMakanPadangIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size() && menuItems.get(position) != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position += 1;
        return menuItem;
    }
}
