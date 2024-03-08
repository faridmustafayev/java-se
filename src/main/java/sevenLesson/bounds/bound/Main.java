package sevenLesson.bounds.bound;

public class Main {
    public static void main(String[] args) {

        Unbound<String> unbound1 = new Unbound<>();
        unbound1.setT("String");
        test(unbound1);

        System.out.println("---------------------------------");

        Unbound<String> upper = new Unbound<>();
        unbound1.setT("string");
//        testUpper(upper);

        Unbound<Integer> upper2 = new Unbound<>();
        upper2.setT(21);
        testUpper(upper2);

        System.out.println("---------------------------------");

        Unbound<Integer> lower = new Unbound<>();
        lower.setT(24);
        testLower(lower);


    }

    public static void test(Unbound<?> unbound) {
        System.out.println(unbound.getT());
    }

    public static void testUpper(Unbound<? extends Number> unbound) {
        System.out.println(unbound.getT());
    }

    public static void testLower(Unbound<? super Integer> unbound) {
        System.out.println(unbound.getT());
    }

}
