package fourteenLesson.syntax;

public class Lambda {
    public static void main(String[] args) {

        test(()-> {});


        test2("Farid", "Hello", (e1, e2)-> System.out.println(e1 + " : " + e2));


    }

    public static void test(TestInterface testInterface) {
        testInterface.testInterface();
    }

    public static void test2(String text1, String text2, Test test) {
        test.test(text1, text2);
    }
}

@FunctionalInterface
interface TestInterface {
    void testInterface();
}

@FunctionalInterface
interface Test {
    void test(String text1, String text2);
}