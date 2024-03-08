package eightLesson.designPatterns.creational.prototype.copyConstructor;

public class Main {
    public static void main(String[] args) {

        Person javid = new Person(28, "Javid");

        Person javid2 = new Person(javid);

        System.out.println(javid2);

    }
}
