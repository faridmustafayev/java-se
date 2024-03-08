package games.storeApp.shopping;

import games.storeApp.enumProduct.NameProduct;

public interface StoreApp {
    void saleProduct(NameProduct nameProduct, int count);
    void storageProduct();
}

interface Store {
    void buyProduct(NameProduct nameProduct, int count);
}