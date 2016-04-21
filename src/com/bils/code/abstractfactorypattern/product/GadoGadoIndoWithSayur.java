package com.bils.code.abstractfactorypattern.product;

import com.bils.code.abstractfactorypattern.ingredient.IndoIngredientFactory;

/**
 * Created by nabilla on 4/19/16.
 */
public class GadoGadoIndoWithSayur extends GadoGado {

    private IndoIngredientFactory indoIngredientFactory;

    public GadoGadoIndoWithSayur(IndoIngredientFactory indoIngredientFactory) {
        this.indoIngredientFactory = indoIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        kecap = indoIngredientFactory.createKecap();
        sambalKacang = indoIngredientFactory.createSambalKacang();
        sayur = indoIngredientFactory.createSayur();
    }
}
