package com.bils.code.abstractfactorypattern.ingredient;

/**
 * Created by nabilla on 4/19/16.
 */
public class KecapRajaRasa implements Kecap {

    public KecapRajaRasa() {
        desc();
    }

    @Override
    public void desc() {
        System.out.println("Kecap Raja Rasa");
    }
}
