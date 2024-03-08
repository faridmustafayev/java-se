package tenLesson.linkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> numbers = new LinkedList<>();

        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("3");

        System.out.println(numbers);
        System.out.println(numbers.get(2));

    }
}
