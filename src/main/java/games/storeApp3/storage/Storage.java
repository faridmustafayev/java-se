package games.storeApp3.storage;

import games.storeApp3.shopping.ShoppingImpl;

public class Storage {

    public static void storage() {
        System.out.println("My storage: ");
        ShoppingImpl.productMap.forEach((e1, e2)-> System.out.println(e1 + " | " + e2));
    }
}
