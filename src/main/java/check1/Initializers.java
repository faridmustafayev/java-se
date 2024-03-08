package check1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Initializers {
    private final static List<String> names = new ArrayList<>();

    public static void main(String[] args) {

        names.add("Farid");

        Set<String> set = new HashSet<>(names);

        set.add("");

        set.forEach(System.out::println);


    }
}
