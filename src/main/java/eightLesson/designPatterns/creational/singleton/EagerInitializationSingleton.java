package eightLesson.designPatterns.creational.singleton;

public class EagerInitializationSingleton {

    public String name = "Javid";

    private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();

    private EagerInitializationSingleton(){

    }

    public static EagerInitializationSingleton getInstance() {
        return instance;
    }

}
