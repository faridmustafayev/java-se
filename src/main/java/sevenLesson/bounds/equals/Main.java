package sevenLesson.bounds.equals;

public class Main {
    public static void main(String[] args) {

        Person javid = new Person();
        Person tabriz = javid;
        Person farid = null;

        System.out.println(javid.equals(tabriz));  // true
        System.out.println(tabriz.equals(farid));  // false

    }
}