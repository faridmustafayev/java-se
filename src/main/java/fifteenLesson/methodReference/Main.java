package fifteenLesson.methodReference;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------------------------------------");

        Consumer<String> consumer = str-> System.out.println(str);
        Consumer<String> consumer1 = System.out::println;
        Consumer<String> consumer2 = str-> {
            System.out.println("javid");
            System.out.println(str);
        };

        System.out.println("------------------------------------------------");

        BiPredicate<String, String> biPredicate = (e1, e2)-> e1.startsWith(e2);
        BiPredicate<String, String> biPredicate1 = String::startsWith;

        System.out.println(biPredicate.test("cavid", "c"));
        System.out.println(biPredicate.test("c", "cavid"));

        System.out.println("------------------------------------------------");

        BiPredicate<String, String> biPredicate2 = (e1, e2)-> e1.equalsIgnoreCase(e2);
        BiPredicate<String, String> biPredicate3 = String::equalsIgnoreCase;

        System.out.println("------------------------------------------------");

        Function<String, Integer> function = p -> p.length();
        Function<String, Integer> function1 = String::length;

        System.out.println("------------------------------------------------");

        String nameOfPerson = "cavid";
        Predicate<String> predicate = name-> nameOfPerson.equals(name);
        Predicate<String> predicate1 = nameOfPerson::equals;

        System.out.println("------------------------------------------------");

        String name = " ";
        System.out.println(name.isBlank());
        System.out.println(name.isEmpty());
    }
}
