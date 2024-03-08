package sixteenLesson.test;

public class Child extends Parent {

    public String name;

    {
        name = "Farid";
        System.out.println("iib: " + name);
    }

    public static String surname;

    static {
        surname = "Mustafayev";
        System.out.println("sib: " + surname);
    }
    public Child(String name) {
        super(21);
        this.name = name;
        System.out.println("child constructor");
    }

}
