package com.bils.code.abstractfactorypattern.ingredient;

/**
 * Created by nabilla on 4/19/16.
 */
public class SayurPasar implements Sayur {

    public SayurPasar() {
        desc();
    }

    @Override
    public void desc() {
        System.out.println("Sayur pasar");
    }

}
