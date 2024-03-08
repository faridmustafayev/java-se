package lastFullRepeat.storeApp2.client;

import lastFullRepeat.storeApp2.benefit.Benefit;
import lastFullRepeat.storeApp2.enumFor.ProductType;
import lastFullRepeat.storeApp2.product.Headphone;
import lastFullRepeat.storeApp2.product.Product;
import lastFullRepeat.storeApp2.storage.Storage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientImpl implements Client {

    private static final int PRODUCT_PRICE = 20;

    public ClientImpl() {
        Storage.storage();
    }

    @Override
    public void buyProduct(ProductType productType, Product product) {
        if (!Storage.getMap().containsKey(productType))
            throw new RuntimeException("There is no product with this productType .. ");

        List<Product> products = Storage.getMap().get(productType);
        products.remove(product);

        Benefit.addBenefit(PRODUCT_PRICE);
    }

    @Override
    public Map<ProductType, List<Product>> display() {
        return Storage.getMap();
    }
}
