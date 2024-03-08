package games.storeApp.shopping;

import games.storeApp.enumProduct.NameProduct;
import games.storeApp.product.Product;

import static games.storeApp.shopping.StoreAppImpl.productMap;

public class StoreImpl implements Store {

    @Override
    public void buyProduct(NameProduct nameProduct, int count) {
        Product product = productMap.get(nameProduct);

        if (!productMap.containsKey(nameProduct)) {
            productMap.put(nameProduct, new Product(nameProduct.name(), count));
        }
        else {
            product.setCount(product.getCount() + count);
        }
    }

    public void buy() {
        buyProduct(NameProduct.SOFA, 13);
        buyProduct(NameProduct.CANDLESTICK, 21);
        buyProduct(NameProduct.CHAIR, 32);
    }
}