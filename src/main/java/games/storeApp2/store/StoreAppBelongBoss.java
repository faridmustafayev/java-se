package games.storeApp2.store;

import games.storeApp2.enumProduct.NameProduct;

public interface StoreAppBelongBoss {
    void buyProductBoss(NameProduct nameProduct, int count);
}

interface StoreAppBelongsCustomer {
    void buyProductCustomer(NameProduct nameProduct, int count);
}
