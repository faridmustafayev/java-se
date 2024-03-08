package sevenLesson.var;


public class Test {
    public static void main(String[] args) {

        var custom = new MyCustomClassForPrintingSomething();

        var name = "Farid";
        var age = 21;

        System.out.println("----------------------------");
        System.out.println("----------------------------");

        String[] names = {"Farid", "Tabriz", "El-khan"};
        test2(names);

        System.out.println("----------------------------");
        test2("Farid", "Tabriz", "El khan");
        test2("Farid", 21, 23, 24);
        test2(names);



    }

    public static void test(String[] names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void test2(String... names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void test2(String name, Integer... ages) {
        for (Integer age : ages) {
            System.out.println(age);
        }
    }
}
