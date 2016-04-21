package com.bils.code.strategypattern.duck;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("====== Mallard Duck =======");
        Duck mallard = new MallardDuck();
        mallard.flyPerform();
        mallard.quackPerform();
        mallard.display();

        System.out.println("====== Rubber Duck =======");
        Duck rubber = new RubberDuck();
        rubber.flyPerform();
        rubber.quackPerform();
        rubber.display();

        System.out.println("====== Another Rubber Duck with Rocket =======");
        Duck anotherRubber = new RubberDuck();
        anotherRubber.setFlyBehavior(new FlyWithRocket());
        anotherRubber.flyPerform();
        anotherRubber.quackPerform();
        anotherRubber.display();
    }
}
