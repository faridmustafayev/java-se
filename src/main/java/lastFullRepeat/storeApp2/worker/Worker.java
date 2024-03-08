package lastFullRepeat.storeApp2.worker;

import lastFullRepeat.storeApp2.enumFor.ProductType;
import lastFullRepeat.storeApp2.product.Product;

import java.util.List;

public interface Worker {
    void addProduct(ProductType productType, List<Product> products);
}
