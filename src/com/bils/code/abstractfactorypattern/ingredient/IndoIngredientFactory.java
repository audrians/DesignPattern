package com.bils.code.abstractfactorypattern.ingredient;

/**
 * Created by nabilla on 4/19/16.
 */
public class IndoIngredientFactory implements FoodIngredientFactory {

    @Override
    public Kecap createKecap() {
        return new KecapBango();
    }

    @Override
    public SambalKacang createSambalKacang() {
        return new SambelKacangTumbuk();
    }

    @Override
    public Sayur createSayur() {
        return new SayurPasar();
    }
}
