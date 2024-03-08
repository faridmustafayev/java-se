package games.storeApp.shopping;

import games.storeApp.enumProduct.NameProduct;
import games.storeApp.product.Product;

import java.util.HashMap;
import java.util.Map;

public class StoreAppImpl implements StoreApp {

    static Map<NameProduct, Product> productMap;

    public StoreAppImpl() {
        productMap = new HashMap<>();
    }

    @Override
    public void saleProduct(NameProduct nameProduct, int count) {

        if (productMap.containsKey(nameProduct)) {
            Product product = productMap.get(nameProduct);
            product.setCount(product.getCount() - count);
        }
        else {
            System.out.println("this product is out of stock .. ");
        }
    }

    @Override
    public void storageProduct() {
        System.out.println("My storage: ");
        productMap.forEach((e1, e2)-> System.out.println(e1 + " : " + e2));
    }
}