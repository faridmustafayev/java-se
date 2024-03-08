package fullRepeat.lessonSix;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(21, "Ceyhun"));
        students.add(new Student(24, "Oruc"));
        students.add(new Student(23, "Elsen"));
        students.add(new Student(21, "Barid"));
        students.add(new Student(22, "Taleh"));

        Collections.sort(students);
        students.forEach(System.out::println);


    }
}

class Student implements Comparable<Student> {

    public int compareTo(Student student) {
        if (this.age.equals(student.age))
            return this.name.compareTo(student.name);

        return this.age.compareTo(student.age);
    }

    public Integer age;
    public String name;

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}