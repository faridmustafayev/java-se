package thirteenLesson.six;

public class Main {
    public static void main(String[] args) {

        test(e-> e  > 20);

        System.out.println("---------------------");

        G g = new G();
        test(g);

        System.out.println("---------------------");

        test(new Checker() {
            @Override
            public boolean check(Integer age) {
                return age > 15;
            }
        });

        System.out.println("-----------------------------");
        System.out.println("-----------------------------");

        Checker checker = new Checker() {
            @Override
            public boolean check(Integer age) {
                return age < 35;
            }
        };
        test(checker);

        System.out.println("-----------------------------");
        System.out.println("-----------------------------");

        Checker checker1 = new G();
        test(checker1);

    }

    public static void test(Checker checker) {
        System.out.println(checker.check(21));
    }

}

@FunctionalInterface
interface Checker {
    boolean check(Integer age);
}

class G implements Checker {
    public boolean check(Integer age) {
        return age > 20;
    }
}