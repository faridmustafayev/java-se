package nineLesson.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        students.add("2");
        students.add("1");
        students.add("3");

        Collections.sort(students);

        System.out.println(students);

        System.out.println("-------------------------");
        System.out.println("-------------------------");

        List<String> strings = List.of("a", "b", "c");
        System.out.println(strings);

        System.out.println("-------------------------");
        System.out.println("-------------------------");

        String[] strings1 = {"b", "a", "c"};

        List<String> str = Arrays.asList(strings1);
        System.out.println(str);


    }
}
