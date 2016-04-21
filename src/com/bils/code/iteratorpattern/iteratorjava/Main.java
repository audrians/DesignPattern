package com.bils.code.iteratorpattern.iteratorjava;

/**
 * Created by nabilla on 3/10/16.
 */
public class Main {

    public static void main(String[] args) {
        RumahMakanPadang rumahMakanPadang = new RumahMakanPadang();
        RumahMakanJawa rumahMakanJawa = new RumahMakanJawa();
        RumahMakanBali rumahMakanBali = new RumahMakanBali();

        Waiterss waiterss = new Waiterss(rumahMakanJawa, rumahMakanPadang, rumahMakanBali);
        waiterss.printMenu();
    }
}
