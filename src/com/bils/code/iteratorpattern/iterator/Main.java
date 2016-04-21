package com.bils.code.iteratorpattern.iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        RumahMakanPadang rumahMakanPadang = new RumahMakanPadang();
        RumahMakanJawa rumahMakanJawa = new RumahMakanJawa();

        Waiterss waiterss = new Waiterss(rumahMakanJawa, rumahMakanPadang);
        waiterss.printMenu();
    }
}
