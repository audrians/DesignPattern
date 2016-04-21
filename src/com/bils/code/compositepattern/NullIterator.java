package com.bils.code.compositepattern;

import java.util.Iterator;

/**
 * Created by nabilla on 3/11/16.
 */
public class NullIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
