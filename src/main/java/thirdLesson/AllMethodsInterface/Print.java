package thirdLesson.AllMethodsInterface;

public interface Print {

    void print(String path);

    default void checkExist(String path) {
        check();
        total();
    }

    default void checkExist2(String path) {
        check();
    }

    private void check() {
        System.out.println("Farid");
    }

    // static, private, private static

    static void test() {
        total();
    }

    static void test2() {
        total();
    }

    private static void total() {
        System.out.println("test");
        System.out.println("test");
        System.out.println("test");
        System.out.println("test");
        System.out.println("test");
        System.out.println("test");
    }

}
