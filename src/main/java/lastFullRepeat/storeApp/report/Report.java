package lastFullRepeat.storeApp.report;

import lastFullRepeat.storeApp.benefit.Benefit;
import lastFullRepeat.storeApp.storage.Storage;

public class Report {

    public static void showBenefit() {
        System.out.println("benefit is: " + Benefit.getBenefit());
    }

    public static void displayProducts() {
        Storage.getProducts().forEach(System.out::println);
    }
}
