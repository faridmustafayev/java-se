package lastFullRepeat.storeApp2.storage;

import lastFullRepeat.storeApp2.enumFor.ProductType;
import lastFullRepeat.storeApp2.product.Headphone;
import lastFullRepeat.storeApp2.product.Phone;
import lastFullRepeat.storeApp2.product.Product;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    private static Map<ProductType, List<Product>> map = new HashMap<>();

    public static void storage() {
        map.put(ProductType.HEADPHONE, Arrays.asList(new Headphone(1, "headphone1", true)
                , new Headphone(4, "headphone2", false)));

        map.put(ProductType.PHONE, Arrays.asList(new Phone(2, "samsung", "13")
                , new Phone(5, "iphone", "15")
                , new Phone(7, "nokia", "12")));

    }

    public static void add(ProductType productType, List<Product> products) {
        map.put(productType, products);
    }

    public static Map<ProductType, List<Product>> getMap() {
        return map;
    }

    public static void setMap(Map<ProductType, List<Product>> map) {
        Storage.map = map;
    }
}
