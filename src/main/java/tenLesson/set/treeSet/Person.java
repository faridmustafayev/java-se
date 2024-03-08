package tenLesson.set.treeSet;

import java.util.Objects;

public class Person implements Comparable<Object> {

    @Override
    public int compareTo(Object o) {
        Person person = (Person) o;
        return this.age.compareTo(person.getAge());
    }

    public Integer age;
    public String fin;

    public Person(int age, String fin) {
        this.age = age;
        this.fin = fin;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getFin() {
        return fin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return (age == person.age && Objects.equals(fin, person.fin));
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", fin='" + fin + '\'' +
                '}';
    }
}
