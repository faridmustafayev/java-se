package fourteenLesson.builtins;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class FunctionF1 {
    public static void main(String[] args) {

        Consumer<String> consumer = name-> System.out.println(name + " hello");

        BiConsumer<String, String> biConsumer = (e1, e2)-> System.out.println(e1 + " : " + e2);

        Supplier<String> supplier = () -> "String";

        Function<String, Integer> function = name-> name.length();


        Predicate<Integer> predicate = age-> age > 18;

        UnaryOperator<String> unaryOperator = unary-> unary + " test";

        List<String> names = new ArrayList<>();

        names.add("javid2");
        names.add("royal");
        names.add("namiq222");

        Collections.sort(names, (e1, e2)-> e1.length() - e2.length());
        names.forEach((name)-> System.out.println(name + " hello"));

        System.out.println("------------------------");

        for (String name : names) {
            System.out.println(name + " hello");
        }

        System.out.println("------------------------");

        System.out.println(names.removeIf(e-> e.startsWith("r")));

    }


}