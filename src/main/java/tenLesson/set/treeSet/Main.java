package tenLesson.set.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Integer> sortedSet = new TreeSet<>();

        sortedSet.add(4);
        sortedSet.add(2);
        sortedSet.add(3);
        sortedSet.add(1);

        System.out.println(sortedSet);

        System.out.println("--------------------------");
        System.out.println("--------------------------");


        Set<Person> personSet = new TreeSet<>();

        personSet.add(new Person(23, "5"));
        personSet.add(new Person(21, "5"));
        personSet.add(new Person(22, "5"));

        System.out.println(personSet);

    }
}
