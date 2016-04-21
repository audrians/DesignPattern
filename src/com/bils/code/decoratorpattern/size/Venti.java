package com.bils.code.decoratorpattern.size;

/**
 * Created by nabilla on 4/18/16.
 */
public class Venti implements Size {

    @Override
    public String getSizeDescription() {
        return " Venti";
    }

    @Override
    public double cost() {
        return 0.5;
    }
}
