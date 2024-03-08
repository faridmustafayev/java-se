package lastFullRepeat.storeApp.storage;

import lastFullRepeat.storeApp.product.Headphone;
import lastFullRepeat.storeApp.product.Phone;
import lastFullRepeat.storeApp.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private static List<Product> products = new ArrayList<>();

    public static void of() {
        products.add(new Headphone(1, "headphone1", true));
        products.add(new Headphone(2, "headphone2", false));
        products.add(new Phone(3, "samsung", "13"));
        products.add(new Phone(4, "iphone", "15"));
    }

    public static void add(Product product) {
        products.add(product);
    }

    public static List<Product> getProducts() {
        return products;
    }

    public static void setProducts(List<Product> products) {
        Storage.products = products;
    }
}
