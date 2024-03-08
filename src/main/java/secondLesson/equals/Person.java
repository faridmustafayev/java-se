package secondLesson.equals;

public class Person {

    public String name;
    public int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "name: " + name + "\nage = " + age;
    }


    public boolean equals(Object obj) {
        Person person = (Person) obj;
        return this.age == person.age;
    }

}