package elevenLesson.testStatic;

public class Person {
    public static String name;

    public Person(String name2) {
        name = name2;
    }

    @Override
    public String toString() {
        return "name: " + name;
    }
}
