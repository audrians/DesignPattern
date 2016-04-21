package com.bils.code.strategypattern.character;

/**
 * Created by nabilla on 3/20/16.
 */
public class Knight extends Character {

    public Knight() {
        weaponBehavior = new Knife();
    }

    @Override
    public void fight() {
        System.out.println(".. from the weapon, I'm a Knight.");
    }
}
