package games.storeApp3.main;

import games.storeApp3.buyCustomer.BuyCustomer;
import games.storeApp3.shopping.NameProduct;
import games.storeApp3.shopping.Shopping;
import games.storeApp3.shopping.ShoppingImpl;
import games.storeApp3.storage.Storage;

public class Main {
    public static void main(String[] args) {

        Shopping shopping = new ShoppingImpl();
        shopping.purchasedBoss();

        Storage.storage();

        System.out.println("------------------------------");

        BuyCustomer customer = new BuyCustomer();

        customer.buyProductCustomer(NameProduct.SOFA, 2);
        customer.buyProductCustomer(NameProduct.CHAIR, 4);
        customer.buyProductCustomer(NameProduct.CANDLESTICK, 5);

        Storage.storage();

    }
}
