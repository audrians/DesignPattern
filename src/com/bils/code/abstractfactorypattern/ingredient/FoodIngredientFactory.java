package com.bils.code.abstractfactorypattern.ingredient;

/**
 * Created by nabilla on 4/19/16.
 */
public interface FoodIngredientFactory {

    Kecap createKecap();

    SambalKacang createSambalKacang();

    Sayur createSayur();
}
