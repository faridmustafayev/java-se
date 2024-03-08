package tenLesson.practice;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Farid");
        names.add("Javid");
        names.add("Tabriz");

        names.add("Tabriz");

        System.out.println(names);

        System.out.println("---------------------------");
        System.out.println("---------------------------");

        Set<Person> names2 = new HashSet<>();

        names2.add(new Person(28, "5"));
        names2.add(new Person(28, "6"));

        System.out.println(names2);

    }
}