package eightLesson.designPatterns.creational.prototype;

public class Main {
    public static void main(String[] args) {

        ConcretePrototype prototype = new ConcretePrototype("Prototype", 21);

        ConcretePrototype clonedObject = (ConcretePrototype) prototype.clone();


        System.out.println(prototype.getAge() == clonedObject.getAge());

    }
}
