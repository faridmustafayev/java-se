package eightLesson.designPatterns.creational.singleton;

public enum EnumSingleton {

    JAVID,
    INSTANCE;

    EnumSingleton() {
        System.out.println("enum constructor");
    }

}
