package seventeenLesson.stream.terminalOperations;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("Farid1", "Javid2", "Elsen344");

        // count()
        System.out.println(names.stream().count());

        System.out.println("------------------------------------");

        // max and min
        System.out.println(names.stream().max((a, b)-> a.length() - b.length()).orElseThrow());
        System.out.println(names.stream().max(Comparator.comparingInt(String::length)).orElseThrow());

        System.out.println("------------------------------------");

        // findAny and findFirst
        System.out.println(names.stream().findAny().orElseThrow());
        System.out.println(names.stream().findFirst().orElseThrow());

        System.out.println("------------------------------------");

        // allMatch, anyMatch, noneMatch
        System.out.println(names.stream().noneMatch(a-> a.equals("Javid2")));

        System.out.println("------------------------------------");

        // foreach
        names.stream().forEach(e-> System.out.println(e.length())); 

        System.out.println("------------------------------------");

        // collect
        Object[] objects = names.stream().toArray();
        List<String> list = names.stream().toList();

        List<String> stringList = names.stream().collect(Collectors.toList());

        Set<String> set = names.stream().collect(Collectors.toSet());
        

    }
}
