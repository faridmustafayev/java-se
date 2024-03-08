package lastFullRepeat.storeApp2.client;

import lastFullRepeat.storeApp2.enumFor.ProductType;
import lastFullRepeat.storeApp2.product.Product;

import java.util.List;
import java.util.Map;

public interface Client {

    void buyProduct(ProductType productType, Product products);
    Map<ProductType, List<Product>> display();

}
