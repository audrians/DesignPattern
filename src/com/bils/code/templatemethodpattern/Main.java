package com.bils.code.templatemethodpattern;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("-----Go Food------");
        GoFood goFood = new GoFood();
        goFood.processSteps();

        System.out.println("-----Go Mart------");
        GoMart goMart = new GoMart();
        goMart.setPay(new PayCredit());
        goMart.processSteps();

        System.out.println("-----Go Ride------");
        GoRide goRide = new GoRide();
        goRide.processSteps();
    }
}
