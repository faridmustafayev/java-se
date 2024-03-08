package games.storeApp2.store;

import games.storeApp2.enumProduct.NameProduct;
import games.storeApp2.product.Product;

public class Customer implements StoreAppBelongsCustomer {
    public void buyProductCustomer(NameProduct nameProduct, int count) {

        if (count > 0) {

            Product product = Boss.productMap.get(nameProduct);
            if (Boss.productMap.containsKey(nameProduct)) {
                product.setCount(product.getCount() - count);
            } else {
                throw new RuntimeException("this product is not storage");
            }

        }
    }
}


