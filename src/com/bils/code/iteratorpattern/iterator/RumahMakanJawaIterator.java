package com.bils.code.iteratorpattern.iterator;

/**
 * Created by nabilla on 3/9/16.
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
}
