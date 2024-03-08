package fullRepeat.lessonTwo;

public class Main {
    public static void main(String[] args) {

        Child child = new Child(21);


    }

}

class Child extends Person {

    static {
        System.out.println("Farid Mustafayev");
    }
    public Child(int age) {
        super(age);
        System.out.println("child constructor");
    }
}

class Person {

    public int age;
    public static String name;


    static {
        name = "F";
        System.out.println(name);
    }

    public Person(int age) {
        this.age = age;
        System.out.println("Person constructor");
    }


    {
        age = 21;
        System.out.println(age);
    }

}
