package lastFullRepeat.storeApp.worker;

import lastFullRepeat.storeApp.product.Product;
import lastFullRepeat.storeApp.storage.Storage;

public class WorkerImpl implements Worker {

    public void addProduct(Product product) {
        Storage.add(product);
    }
}
