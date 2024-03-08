package fifteenLesson.streamTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Javid"));
        students.add(new Student("Kemale"));
        students.add(new Student("Orxan"));
        students.add(new Student("Firuddin"));
        students.add(new Student("Javid"));

        System.out.println(collectTMap(students));

    }

    public static Map<Integer, List<Student>> collectTMap(List<Student> students) {

        return students.stream().collect(Collectors.groupingBy(p-> p.getName().length()));
    }

}

class Student {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}