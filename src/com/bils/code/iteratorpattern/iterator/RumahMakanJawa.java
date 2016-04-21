package com.bils.code.iteratorpattern.iterator;

/**
 * Created by nabilla on 3/9/16.
 */
public class RumahMakanJawa {

    private static final int MAX_MENU = 3;

    private MenuItem[] menuItems;

    private int position = 0;

    public RumahMakanJawa() {
        menuItems = new MenuItem[3];
        addItem("Pecel", "Salad yang disiram dengan sambal kacang", 16000, true);
        addItem("Gudeg", "Isi buah nangka yang direbus dengan gula dan santan", 20000, true);
        addItem("Rujak Cingur", "Salad yang dicampur dengan daging dari bibir sapi", 17000, false);
    }

    private void addItem(String name, String desc, double price, boolean vege) {
        if (position < MAX_MENU) {
            menuItems[position] = new MenuItem(name, desc, price, vege);
            position += 1;
        } else {
            System.out.println("List menu item is full, item can't add to list menu.");
        }
    }

    public Iterator createIterator() {
        return new RumahMakanJawaIterator(menuItems);
    }
}
