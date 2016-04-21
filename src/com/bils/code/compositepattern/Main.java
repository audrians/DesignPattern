package com.bils.code.compositepattern;

/**
 * Created by nabilla on 3/11/16.
 */
public class Main {

    public static void main(String[] args) {
        MenuComponent rmPadangMenu = new Menu("Menu Padang", "Padang");
        MenuComponent rmJawaMenu = new Menu("Menu Jawa", "Jawa");
        MenuComponent rmBaliMenu = new Menu("Menu Bali", "Bali");

        MenuComponent allMenu = new Menu("All Menu", "All menu");
        allMenu.add(rmPadangMenu);
        allMenu.add(rmJawaMenu);
        allMenu.add(rmBaliMenu);

        rmPadangMenu.add(new MenuItem("Rendang", "Daging sapi dimasak pedas", 15000, false));
        rmPadangMenu.add(new MenuItem("Lontong Sayur", "Lontong yang disiram dengan sayur labu siam", 12000, true));
        rmPadangMenu.add(new MenuItem("Sate Padang", "Daging kambing yang dibakar dan disiram saus padang", 18000, false));

        rmJawaMenu.add(new MenuItem("Pecel", "Salad yang disiram dengan sambal kacang", 16000, true));
        rmJawaMenu.add(new MenuItem("Gudeg", "Isi buah nangka yang direbus dengan gula dan santan", 20000, true));
        rmJawaMenu.add(new MenuItem("Rujak Cingur", "Salad yang dicampur dengan daging dari bibir sapi", 17000, false));

        rmBaliMenu.add(new MenuItem("Ayam Betutu", "Olahan ayam berlimpah rempah-rempah pedas", 18000, false));
        rmBaliMenu.add(new MenuItem("Sate Lilit", "Sate daging cincang lilit", 19000, false));
        rmBaliMenu.add(new MenuItem("Rujak kuah pindang", "Rujak mangga dengan siraman kuah pindang pedas", 20000, true));

        Waiterss waiterss = new Waiterss(allMenu);
        waiterss.printMenu();
        waiterss.printMenuVegetarian();
    }
}
