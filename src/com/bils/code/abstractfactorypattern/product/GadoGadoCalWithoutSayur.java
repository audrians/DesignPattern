package com.bils.code.abstractfactorypattern.product;

import com.bils.code.abstractfactorypattern.ingredient.CaliforniaIngredientFactory;

/**
 * Created by nabilla on 4/19/16.
 */
public class GadoGadoCalWithoutSayur extends GadoGado {

    private CaliforniaIngredientFactory californiaIngredientFactory;

    public GadoGadoCalWithoutSayur(CaliforniaIngredientFactory californiaIngredientFactory) {
        this.californiaIngredientFactory = californiaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        kecap = californiaIngredientFactory.createKecap();
        sambalKacang = californiaIngredientFactory.createSambalKacang();
    }
}
