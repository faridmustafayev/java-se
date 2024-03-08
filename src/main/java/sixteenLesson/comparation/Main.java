package sixteenLesson.comparation;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Student> studentSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.compareTo(o2);
            }
        });

        studentSet.add(new Student(21, "Farid"));
        studentSet.add(new Student(28, "Javid"));
        studentSet.add(new Student(27, "Nurlan"));

        studentSet.forEach(System.out::println);

        System.out.println("---------------------------------------");

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(21, "Farid"));
        studentList.add(new Student(28, "Javid"));
        studentList.add(new Student(27, "Nurlan"));

        Comparator<Student> comparator = (a, b)-> a.getName().compareTo(b.getName());

        studentList.sort((a, b)-> a.getAge() - b.getAge());
        Collections.sort(studentList);
        studentList.forEach(System.out::println);

    }
}

class Student implements Comparable<Student> {

    @Override
    public int compareTo(Student student) {
        return this.age - student.age;
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