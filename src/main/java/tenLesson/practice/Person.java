package tenLesson.practice;

import java.util.Objects;


public class Person {

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
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", fin='" + fin + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        Person person = (Person) obj;
        return ((age.equals(person.age)) && (fin.equals(person.fin)));
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, fin);
    }
}