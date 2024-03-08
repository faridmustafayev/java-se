package tenLesson.set.hashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Farid");
        names.add("Efqan");
        names.add("eli");

        System.out.println(names);

        List<String> result = new ArrayList<>(names);

        Collections.sort(result);

        System.out.println(result);


    }
}

