package sixLesson.firstProgram;

public class Main {
    public static void main(String[] args) {

        System.out.println("begin main()");
        printPerson();
        System.out.println("end main()");


    }

    public static void printPerson() {
        System.out.println("begin printPerson()");
        int age = getAge();
        System.out.println("between name and age");
        String name = getName();
        System.out.println("end printPerson()");
    }


    public static int getAge() {
        System.out.println("inside age: ");
        return 21;
    }

    public static String getName() {
        System.out.println("inside name: ");
        return "Farid";
    }


}