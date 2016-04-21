package com.bils.code.abstractfactorypattern;

import com.bils.code.abstractfactorypattern.creator.IndonesiaFoodFactory;
import com.bils.code.abstractfactorypattern.creator.WarungStore;
import com.bils.code.abstractfactorypattern.product.GadoGado;

public class Main {

    public static void main(String[] args) {
	// write your code here

        WarungStore warungIndonesiaFactory = new IndonesiaFoodFactory();
        GadoGado gadoGado = warungIndonesiaFactory.orderGadoGado("with sayur");
        System.out.println("Order: " + gadoGado.getName());
    }
}
