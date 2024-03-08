package lastFullRepeat.storeApp.client;

import lastFullRepeat.storeApp.product.Headphone;
import lastFullRepeat.storeApp.report.Report;
import lastFullRepeat.storeApp.worker.Worker;
import lastFullRepeat.storeApp.worker.WorkerImpl;

public class ClientCall {
    public static void call() {

        Client client = new ClientImpl();
        Report.displayProducts();
        System.out.println("------- ");
        client.buyProduct(1);
        client.buyProduct(3);

        Report.displayProducts();
        Report.showBenefit();

        Worker worker = new WorkerImpl();
        worker.addProduct(new Headphone(5, "headphone3", true));

        Report.displayProducts();

    }
}
