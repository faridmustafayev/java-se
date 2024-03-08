package thirteenLesson.four;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Person javid = new Person(28, "Javid", 83);

        Consumer<Person> consumerAge = e-> {if (e.age > 18) System.out.println("maybe");};

        test(javid, consumerAge);
        test(javid, e-> {if (e.weight > 75) System.out.println("higher wight");});

    }

    public static void test(Person person, Consumer<Person> consumer) {
        consumer.accept(person);
    }

}

class Person {
    public Integer age;
    public String name;
    public Integer weight;

    public Person(Integer age, String name, Integer weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }
}