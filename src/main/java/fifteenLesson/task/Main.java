package fifteenLesson.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Farid"));
        students.add(new Student("Oruc"));
        students.add(new Student("Nureddin"));

        System.out.println(collectMap(students));

    }



    public static boolean collectMap (List<Student> students) {

        Map<Integer, List<Student>> resultMap = new HashMap<>();

        int i = 0;

            for ( ; i < students.size(); i++) {
                if (students.get(i).name.length() == i) {
                    System.out.println(i + " : " + students.get(i).name);
                }

            }

        return resultMap.get(i).add(new Student(students.get(i).name));

    }
}

class Student {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
