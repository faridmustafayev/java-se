package games.storeApp2.storage;

import games.storeApp2.store.Boss;

public class Storage {

    public static void storageProduct() {
        System.out.println("My storage: ");

        Boss.productMap.forEach((e1, e2) -> System.out.println(e1 + " : " + e2));
    }
}
