package twelveLesson.copyOnWrite;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class Main {
    public static void main(String[] args) {

        Set<String> students = new CopyOnWriteArraySet<>();

        students.add("birinci");
        students.add("ikinci");

        for (String name : students) {
            System.out.println(students.remove("birinci"));
        }

        students.forEach(System.out::println);
    }
}
