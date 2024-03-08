package games.storeApp3.shopping;

import games.storeApp3.product.Product;

import java.util.HashMap;
import java.util.Map;

public class ShoppingImpl extends Shopping {

    public static Map<NameProduct, Product> productMap;
    public ShoppingImpl() {
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
            throw new RuntimeException("product count can not be negative ... ");
        }
    }

    @Override
    public void purchasedBoss() {
        buyProductBoss(NameProduct.SOFA, 23);
        buyProductBoss(NameProduct.CHAIR, 12);
        buyProductBoss(NameProduct.CANDLESTICK, 17);
    }


}