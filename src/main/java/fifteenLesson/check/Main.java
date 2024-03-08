package fifteenLesson.check;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        String name = "alem";

        Predicate<String> predicate = s -> s.startsWith("F");

        System.out.println(predicate.test("Farid"));
    }
}
