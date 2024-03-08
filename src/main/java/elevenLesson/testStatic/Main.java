package elevenLesson.testStatic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> strings = new ArrayList<>();

        strings.add(new Person("Farid"));
        strings.add(new Person("Tabriz"));
        strings.add(new Person("Elxan"));

        System.out.println(strings);

    }
}
