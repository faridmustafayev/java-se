package lastFullRepeat.storeApp2.report;

import lastFullRepeat.storeApp2.benefit.Benefit;
import lastFullRepeat.storeApp2.storage.Storage;

public class Report {

    public static void showBenefit() {
        System.out.println("benefit is: " + Benefit.getBenefit());
    }

    public static void showProducts() {
        Storage.getMap().forEach((e1, e2)-> System.out.println(e1 + " : " + e2));
    }

}
