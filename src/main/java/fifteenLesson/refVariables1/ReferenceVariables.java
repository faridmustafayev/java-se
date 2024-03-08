package fifteenLesson.refVariables1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ReferenceVariables {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(21));
        studentList.add(new Student(15));
        studentList.add(new Student(23));

        test(studentList, student -> System.out.println(student + " "));


    }

    public static void test(List<Student> studentList, Consumer<Student> consumer) {
        studentList.forEach(consumer);
    }
}

class Student {
    public int age;

    public Student(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }
}