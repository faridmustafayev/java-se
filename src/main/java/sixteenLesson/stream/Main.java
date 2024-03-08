package sixteenLesson.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<String> stringStream = Stream.empty();

        Stream<String> stream = Stream.of("Farid", "Murad", "Tabriz");
        System.out.println(stream.collect(Collectors.joining(" : ")));

        System.out.println("--------------------------------");

        List<String> stringList = List.of("a", "b", "c");
        for (String string : stringList) {
            string += " : ";
            System.out.print(string);
        }
        System.out.println();

        System.out.println("--------------------------------");

        List<String> letters = List.of("a", "b", "c");
        String lettere = "";

        for (String letter : letters) {
            lettere += letter + " : ";
        }
        System.out.println(lettere);

        System.out.println("--------------------------------");

        String result = letters.stream().collect(Collectors.joining(":"));
        System.out.println(result);

        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        List<Student> students = new ArrayList<>();

        students.add(new Student("Farid", 21));
        students.add(new Student("Javid", 28));
        students.add(new Student("Farid", 22));
        students.add(new Student("Elsen", 23));
        students.add(new Student("Farid", 21));

        List<Student> studentsTemp = new ArrayList<>();

        for (Student student : students) {
            if (!(studentsTemp.contains(student)))
                studentsTemp.add(student);
            else
                System.out.println("already was added: " + student);
        }

        studentsTemp.forEach(System.out::println);

        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        students.stream().distinct().forEach(System.out::println);

    }
}
