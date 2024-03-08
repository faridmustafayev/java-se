package eightLesson.designPatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {

        EagerInitializationSingleton instance = EagerInitializationSingleton.getInstance();
        System.out.println(instance.name);

        System.out.println("-------------------------------------");

        EnumSingleton instance1 = EnumSingleton.INSTANCE;

        System.out.println("-----------------------------------------");

        System.out.println(EnumSingleton.JAVID);

    }
}
