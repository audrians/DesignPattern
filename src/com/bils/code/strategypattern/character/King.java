package com.bils.code.strategypattern.character;

/**
 * Created by nabilla on 3/20/16.
 */
public class King extends Character {

    public King() {
        weaponBehavior = new Sword();
    }

    @Override
    public void fight() {
        System.out.println(".. from the weapon, I'm a King.");
    }
}
