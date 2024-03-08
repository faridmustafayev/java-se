package lastFullRepeat.storeApp.client;

import lastFullRepeat.storeApp.benefit.Benefit;
import lastFullRepeat.storeApp.product.Product;
import lastFullRepeat.storeApp.storage.Storage;

import java.util.List;
import java.util.NoSuchElementException;

public class ClientImpl implements Client {

    public static final Long PRODUCT_PRICE = 10L;

    public ClientImpl() {
        Storage.of();
    }

    @Override
    public void buyProduct(Integer productId) {

        Product product = new Product(productId);

        if (!Storage.getProducts().contains(product))
            throw new NoSuchElementException("hemin id li product yoxdur : " + productId);

        Storage.getProducts().remove(product);

        Benefit.addToBenefit(PRODUCT_PRICE);

    }

    @Override
    public List<Product> getProducts() {
        return Storage.getProducts();
    }

}
