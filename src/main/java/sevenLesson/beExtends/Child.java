package sevenLesson.beExtends;

public class Child extends Parent {

    public String name;
    public Child(int age, String name) {
        super(age);
        this.name = name;
    }

}