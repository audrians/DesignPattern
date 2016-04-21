package com.bils.code.abstractfactorypattern.ingredient;

/**
 * Created by nabilla on 4/19/16.
 */
public class SambelKacangTumbuk implements SambalKacang {

    public SambelKacangTumbuk() {
        desc();
    }

    @Override
    public void desc() {
        System.out.println("Sambel Kacang Tumbuk");
    }
}
