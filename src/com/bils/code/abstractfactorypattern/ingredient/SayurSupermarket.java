package com.bils.code.abstractfactorypattern.ingredient;

/**
 * Created by nabilla on 4/19/16.
 */
public class SayurSupermarket implements Sayur {

    public SayurSupermarket() {
        desc();
    }

    @Override
    public void desc() {
        System.out.println("Sayur Supermarket");
    }
}
