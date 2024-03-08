package taskCollection.task3;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Person> personSet = new TreeSet<>();

        personSet.add(new Person(21, "Farid"));
        personSet.add(new Person(20, "Taleh"));
        personSet.add(new Person(22, "Taleh"));

        System.out.println(personSet);

    }
}
