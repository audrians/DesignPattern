package com.bils.code.decoratorpattern.beverage;

import com.bils.code.decoratorpattern.size.Size;

import java.util.Observable;

/**
 * Created by nabilla on 4/7/16.
 */
public abstract class Beverage extends Observable {

    public String description = "Unknown Beverage";

    private Size sizeGlass;

    private double costTotal;

    public abstract double getComponentCost();

    public Beverage() {
    }

    public Beverage(Size sizeGlass) {
        this.sizeGlass = sizeGlass;
    }

    public Size getSizeGlass() {
        return sizeGlass;
    }

    public double cost() {
        costTotal = getComponentCost() + getCostSizeGlass();
        measurementHasChanged();
       return costTotal;
    }

    private double getCostSizeGlass() {
        if (getSizeGlass() == null) {
            return 0.0;
        }
        return getSizeGlass().cost();
    }

    public String getDescription() {
        return description + getSizeGlass().getSizeDescription();
    }

    public void measurementHasChanged() {
        setChanged();
        notifyObservers();
    }
}
