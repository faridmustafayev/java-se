package secondLesson.passing;

public class Passing {
    public static void main(String[] args) {
        int num = 5;
        test(num);
        System.out.println("outside: " + num);

        System.out.println("--------------------------");
        System.out.println("--------------------------");


        Person person = new Person("Farid", 21);
        test(person);
        System.out.println(person);

    }

    public static void test(int number) {
        number++;
        System.out.println("inside: " + number);
    }

    public static void test(Person person) {

        person.age = 23;    // hamisina tesir edir primitivde, ama non primitivde yox
//        person = null;
        person = new Person("Namiq", 34);

        System.out.println(person);
    }

}
