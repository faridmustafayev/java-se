package eightLesson.designPatterns.creational.prototype;

public class ConcretePrototype implements Prototype {
    private String name;
    private int age;


    public ConcretePrototype(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.name, this.age);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
