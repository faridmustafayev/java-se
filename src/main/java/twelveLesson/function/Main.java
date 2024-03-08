package twelveLesson.function;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Person javid = new Person();
        javid.age = 25;
        javid.name = "Javid";
        javid.weight = 110;

        test(javid);

        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");

        Consumer<Person> consumerWeight = (e) -> {if(e.weight > 75) System.out.println("aqir cekili");};
        Consumer<Person> consumerName = (e) -> {if(e.name.equals("Javid")) System.out.println("Javid ozum");};

        universal(javid, consumerWeight);

        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");

        test4(e -> e > 20);

        System.out.println("-----------------------------");

        G g = new G();
        test4(g);

        G2 g2 = new G2();
        test4(g2);


    }

    public static void test4(Checker<Integer> checker) {
        System.out.println(checker.check(5));
    }

    public static void universal(Person person, Consumer<Person> consumer) {
        consumer.accept(person);
    }


    public static void test(Person person) {
        if (person.age > 20)
            System.out.println("20 den boyukdur yas");
    }

    public static void test2(Person person) {
        if (!person.name.equals("Javid")) {
            System.out.println("hello javid olmayan");
        }
    }

    public static void test3(Person person) {
        if (person.weight > 75)
            System.out.println("aqir cekili");
    }


}