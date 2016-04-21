package com.bils.code.strategypattern.character;

/**
 * Created by nabilla on 3/20/16.
 */
public class Queen extends Character {

    public Queen() {
        weaponBehavior = new ArrowAndBow();
    }

    @Override
    public void fight() {
        System.out.println(".. from the weapon, I'm a Queen.");
    }
}
