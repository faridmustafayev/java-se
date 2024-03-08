package elevenLesson.map;

public class Person {

    public String name;

    public Person(String name) {
        this.name = name;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "name: " + name;
    }
}
