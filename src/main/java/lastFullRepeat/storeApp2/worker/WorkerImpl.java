package lastFullRepeat.storeApp2.worker;

import lastFullRepeat.storeApp2.enumFor.ProductType;
import lastFullRepeat.storeApp2.product.Product;
import lastFullRepeat.storeApp2.storage.Storage;

import java.util.List;

public class WorkerImpl implements Worker {
    public void addProduct(ProductType productType, List<Product> products) {
        Storage.add(productType, products);
    }
}
