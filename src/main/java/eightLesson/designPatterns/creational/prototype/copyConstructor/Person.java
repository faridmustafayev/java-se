package eightLesson.designPatterns.creational.prototype.copyConstructor;

public class Person {

    public int age;
    public String name;


    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person(Person person) {
        this.age = person.age;
        this.name = person.name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
