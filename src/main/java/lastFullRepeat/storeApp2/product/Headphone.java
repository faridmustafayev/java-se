package lastFullRepeat.storeApp2.product;

public class Headphone extends Product {
    private boolean wireless;
    public Headphone(Integer productId, String productName, boolean wireless) {
        super(productId, productName);
        this.wireless = wireless;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Headphone{" +
                "wireless=" + wireless +
                "} " + super.toString();
    }
}
