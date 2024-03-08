package lastFullRepeat.storeApp.client;

import lastFullRepeat.storeApp.product.Product;

import java.util.List;

public interface Client {
    void buyProduct(Integer productId);
    List<Product> getProducts();


}
