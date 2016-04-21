package com.bils.code.abstractfactorypattern.ingredient;

/**
 * Created by nabilla on 4/19/16.
 */
public class CaliforniaIngredientFactory implements FoodIngredientFactory {

    @Override
    public Kecap createKecap() {
        return new KecapRajaRasa();
    }

    @Override
    public SambalKacang createSambalKacang() {
        return new SambalKacangBlender();
    }

    @Override
    public Sayur createSayur() {
        return new SayurSupermarket();
    }
}
