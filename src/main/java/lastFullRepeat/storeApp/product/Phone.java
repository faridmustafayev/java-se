package lastFullRepeat.storeApp.product;

public class Phone extends Product {

    public String version;
    public Phone(Integer productId, String productName, String version) {
        super(productId, productName);
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "version='" + version + '\'' +
                "} " + super.toString();
    }
}
