package com.bils.code.decoratorpattern.size;

/**
 * Created by nabilla on 4/18/16.
 */
public class Tall implements Size {

    @Override
    public String getSizeDescription() {
        return " Tall";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
