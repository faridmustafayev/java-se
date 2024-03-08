package thirdLesson.method.variableHiding;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.age);

        System.out.println("------------");

        System.out.println(person.getAge());


    }
}
