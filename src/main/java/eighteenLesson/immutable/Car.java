package eighteenLesson.immutable;

public final class Car {

    private final String color;
    private final Engine engine;

    public Car(String color, Engine engine) {
        this.color = color;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return new Engine();
    }
}
