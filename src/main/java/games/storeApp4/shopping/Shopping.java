package games.storeApp4.shopping;

import games.storeApp4.NameProduct;
import games.storeApp4.product.Product;

import java.util.HashMap;
import java.util.Map;

public class Shopping {

    public Map<NameProduct, Product> productMap;
    public Shopping() {
        productMap = new HashMap<>();
    }

    public void buyProduct(NameProduct nameProduct, double weight, int count) {
        if (count > 0) {
            if (!productMap.containsKey(nameProduct)) {
                productMap.put(nameProduct, new Product(nameProduct.name(), weight, count));

            } else {
                Product product = productMap.get(nameProduct);
                product.setCount(count + product.getCount());
            }
        }else {
            throw new RuntimeException("count can not be negative ... ");
        }
    }

    public void saleProduct(NameProduct nameProduct, double weight, int count) {

        Product product = productMap.get(nameProduct);
        if (productMap.containsKey(nameProduct) && (product.getWeight() == weight)) {
            product.setCount(product.getCount() - count);
        }
        else {
            throw new RuntimeException("satmaq istediyiniz mehsul anbarda yoxdur");
        }

    }





    public void printStorageInfo(){
        System.out.println("My Storage: ");

        productMap
                .forEach( (key, value) -> {
            System.out.println(key + ": " + value);
        });

        System.out.println("--------------------------------------------");
    }

}
