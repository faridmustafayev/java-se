package sevenLesson.bounds.equals;

public class Person {

    public int age;
    public String name;

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        Person person = (Person) obj;
        return (age == person.age) && (name.equals(person.name));
    }
}