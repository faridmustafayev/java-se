package games.storeApp2.store;

import games.storeApp2.enumProduct.NameProduct;
import games.storeApp2.product.Product;

import java.util.HashMap;
import java.util.Map;

public class Boss implements StoreAppBelongBoss {
    public static Map<NameProduct, Product> productMap;
    public Boss() {
        productMap = new HashMap<>();
    }

    @Override
    public void buyProductBoss(NameProduct nameProduct, int count) {

        if (count > 0) {

            if (!productMap.containsKey(nameProduct)) {
                productMap.put(nameProduct, new Product(nameProduct.name(), count));
            }
            else {
                Product product = productMap.get(nameProduct);
                product.setCount(product.getCount() + count);
            }
        }
        else {
            throw new RuntimeException("count can not be negative .. ");
        }

    }
}
