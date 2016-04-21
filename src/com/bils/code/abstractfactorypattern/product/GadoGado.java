package com.bils.code.abstractfactorypattern.product;

import com.bils.code.abstractfactorypattern.ingredient.Kecap;
import com.bils.code.abstractfactorypattern.ingredient.SambalKacang;
import com.bils.code.abstractfactorypattern.ingredient.Sayur;

/**
 * Created by nabilla on 4/19/16.
 */
public abstract class GadoGado {

    private String name;

    public Kecap kecap;

    public SambalKacang sambalKacang;

    public Sayur sayur;

    public abstract void prepare();

    public void cook() {
        System.out.println("Cook for 20 minutes");
    }

    public void box() {
        System.out.println("Placing gado-gado in box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "";
    }
}
