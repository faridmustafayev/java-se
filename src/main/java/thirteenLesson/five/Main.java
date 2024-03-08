package thirteenLesson.five;

public class Main {
    public static void main(String[] args) {

        Checker<Integer> checker = e-> e > 18;

        test(checker);

    }

    public static void test(Checker<Integer> checker) {
        System.out.println(checker.check(21));
    }

}

@FunctionalInterface
interface Checker<T> {
    boolean check(T t);
}