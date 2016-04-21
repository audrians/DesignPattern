package com.bils.code.strategypattern.character;

/**
 * Created by nabilla on 3/20/16.
 */
public abstract class Character {

    public WeaponBehavior weaponBehavior;

    public Character() {
    }

    public void characterWeapon() {
        weaponBehavior.useWeapon();
    }

    public abstract void fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
