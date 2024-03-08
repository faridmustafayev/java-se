package sevenLesson.bounds.test;

public class Main {
    public static void main(String[] args) {

        Person javid = null;
        System.out.println(checked(javid));

    }

    public static boolean checked(Person p) {
        if (p != null && p.age >= 18)
            return true;
        else return false;
    }
}