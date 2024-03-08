package seventeenLesson.stream.intermediateOperations;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<String> persons = Stream.of("Namiq", "Cefer", "Royal", "Farid");

        // filter
        persons
                .filter(person -> person.equalsIgnoreCase("Royal"))
                .forEach(System.out::println);

//        List<String> list = persons
//                .filter(person2-> person2.equals("Royal"))
//                .toList();
//        System.out.println(list);



        // distinct





    }
}
