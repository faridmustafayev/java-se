package lastFullRepeat.storeApp2.main;

import lastFullRepeat.storeApp2.client.Client;
import lastFullRepeat.storeApp2.client.ClientImpl;
import lastFullRepeat.storeApp2.enumFor.ProductType;
import lastFullRepeat.storeApp2.product.Headphone;
import lastFullRepeat.storeApp2.report.Report;


public class Main {
    public static void main(String[] args) {

        Client client = new ClientImpl();
        Report.showProducts();
        Report.showBenefit();
        client.buyProduct(ProductType.HEADPHONE, new Headphone(1, "headphone1", true));
        System.out.println("---");

        System.out.println("---");



    }
}
