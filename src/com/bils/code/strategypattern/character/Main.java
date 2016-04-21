package com.bils.code.strategypattern.character;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("====== Character King =======");
        Character king = new King();
        king.characterWeapon();
        king.fight();

        System.out.println("====== Character Queen =======");
        Character queen = new Queen();
        queen.characterWeapon();
        queen.fight();

        System.out.println("====== Character Knight =======");
        Character knight = new Knight();
        knight.characterWeapon();
        knight.fight();

        System.out.println("====== Character Another Knight =======");
        Character knight2 = new Knight();
        knight2.setWeaponBehavior(new Sword());
        knight2.characterWeapon();
        knight2.fight();

        System.out.println("====== Character Troll =======");
        Character troll = new Troll();
        troll.characterWeapon();
        troll.fight();
    }
}
