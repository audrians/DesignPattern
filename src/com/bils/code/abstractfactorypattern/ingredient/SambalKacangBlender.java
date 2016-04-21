package com.bils.code.abstractfactorypattern.ingredient;

/**
 * Created by nabilla on 4/19/16.
 */
public class SambalKacangBlender implements SambalKacang {

    public SambalKacangBlender() {
        desc();
    }

    @Override
    public void desc() {
        System.out.println("Sambel Kacang Blender");
    }
}
