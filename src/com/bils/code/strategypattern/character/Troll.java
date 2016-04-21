package com.bils.code.strategypattern.character;

/**
 * Created by nabilla on 3/20/16.
 */
public class Troll extends Character {

    public Troll() {
        weaponBehavior = new Axe();
    }

    @Override
    public void fight() {
        System.out.println(".. from the weapon, I'm a Troll.");
    }
}
