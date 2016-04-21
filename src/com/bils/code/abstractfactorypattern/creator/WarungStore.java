package com.bils.code.abstractfactorypattern.creator;

import com.bils.code.abstractfactorypattern.product.GadoGado;

/**
 * Created by nabilla on 4/19/16.
 */
public abstract class WarungStore {

    public GadoGado orderGadoGado(String type) {
        GadoGado gadoGado = null;

        gadoGado = createGadoGado(type);
        gadoGado.prepare();
        gadoGado.cook();
        gadoGado.box();

        return gadoGado;
    }

    public abstract GadoGado createGadoGado(String type);


}
