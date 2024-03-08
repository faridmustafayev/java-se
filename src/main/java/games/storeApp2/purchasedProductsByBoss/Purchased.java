package games.storeApp2.purchasedProductsByBoss;

import games.storeApp2.enumProduct.NameProduct;
import games.storeApp2.store.Boss;

public class Purchased {
    public static void purchased(Boss boss) {
        boss.buyProductBoss(NameProduct.SOFA, 12);
        boss.buyProductBoss(NameProduct.CHAIR, 23);
        boss.buyProductBoss(NameProduct.CANDLESTICK, 34);
    }
}
