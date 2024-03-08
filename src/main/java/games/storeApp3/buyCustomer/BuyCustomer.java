package games.storeApp3.buyCustomer;

import games.storeApp3.product.Product;
import games.storeApp3.shopping.NameProduct;
import games.storeApp3.shopping.ShoppingImpl;

public class BuyCustomer {

    public void buyProductCustomer(NameProduct nameProduct, int count) {

        if (ShoppingImpl.productMap.containsKey(nameProduct)) {
            Product product = ShoppingImpl.productMap.get(nameProduct);
            product.setCount(product.getCount() - count);
        }
        else {
            throw new RuntimeException("not available from that product ");
        }

    }
}
