package com.bils.code.abstractfactorypattern.creator;

import com.bils.code.abstractfactorypattern.ingredient.CaliforniaIngredientFactory;
import com.bils.code.abstractfactorypattern.product.GadoGado;
import com.bils.code.abstractfactorypattern.product.GadoGadoCalWithSayur;
import com.bils.code.abstractfactorypattern.product.GadoGadoCalWithoutSayur;

/**
 * Created by nabilla on 4/19/16.
 */
public class CaliforniaFoodFactory extends WarungStore {

    @Override
    public GadoGado createGadoGado(String type) {
        GadoGado gadoGado = null;
        CaliforniaIngredientFactory californiaIngredientFactory = new CaliforniaIngredientFactory();

        if (type.equals("with sayur")) {
            gadoGado = new GadoGadoCalWithSayur(californiaIngredientFactory);
            gadoGado.setName("Gado-gado California with sayur");
        } else {
            gadoGado = new GadoGadoCalWithoutSayur(californiaIngredientFactory);
            gadoGado.setName("Gado-gado California without sayur");
        }
        return gadoGado;
    }
}
