package games.storeApp4;

import games.storeApp4.shopping.Shopping;

public class Main {
    public static void main(String[] args) {

        Shopping shopping = new Shopping();

        shopping.buyProduct(NameProduct.SOFA, 120, 5);

        shopping.buyProduct(NameProduct.SOFA, 120, 5);

        shopping.buyProduct(NameProduct.CANDLESTICK,200,30);

        shopping.printStorageInfo();

        System.out.println("------------------------------------");

        shopping.saleProduct(NameProduct.SOFA, 120, 4);

        shopping.printStorageInfo();
    }
}
