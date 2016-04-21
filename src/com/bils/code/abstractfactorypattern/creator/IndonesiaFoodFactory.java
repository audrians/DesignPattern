package com.bils.code.abstractfactorypattern.creator;

import com.bils.code.abstractfactorypattern.ingredient.IndoIngredientFactory;
import com.bils.code.abstractfactorypattern.product.GadoGado;
import com.bils.code.abstractfactorypattern.product.GadoGadoIndoWithSayur;
import com.bils.code.abstractfactorypattern.product.GadoGadoIndoWithoutSayur;

/**
 * Created by nabilla on 4/19/16.
 */
public class IndonesiaFoodFactory extends WarungStore {

    @Override
    public GadoGado createGadoGado(String type) {
        GadoGado gadoGado = null;
        IndoIngredientFactory indonesianFoodFactory = new IndoIngredientFactory();

        if (type.equals("with sayur")) {
            gadoGado = new GadoGadoIndoWithSayur(indonesianFoodFactory);
            gadoGado.setName("Gado-gado Indonesia with sayur");
        } else {
            gadoGado = new GadoGadoIndoWithoutSayur(indonesianFoodFactory);
            gadoGado.setName("Gado-gado Indonesia without sayur");
        }
        return gadoGado;
    }
}
