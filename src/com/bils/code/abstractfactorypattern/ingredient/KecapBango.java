package com.bils.code.abstractfactorypattern.ingredient;

/**
 * Created by nabilla on 4/19/16.
 */
public class KecapBango implements Kecap {

    public KecapBango() {
        desc();
    }

    @Override
    public void desc() {
        System.out.println("Kecap Bango");
    }
}
