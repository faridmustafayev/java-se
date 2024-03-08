package lastFullRepeat.storeApp.benefit;

public class Benefit {

    private static int benefit;

    public static void addToBenefit(Long price) {
        benefit += price;
    }

    public static int getBenefit() {
        return benefit;
    }

    public static void setBenefit(int benefit) {
        Benefit.benefit = benefit;
    }
}
