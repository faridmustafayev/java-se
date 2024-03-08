package eightLesson.designPatterns.creational.factory;

public class Car {
    public int doorCount;
    public String color;

    public static Car createCar(int doorCount, String color) {
        if (doorCount < 0)
            throw new RuntimeException("count is incorrect");
        return new Car(doorCount, color);
    }

    public Car(int doorCount, String color) {
        this.doorCount = doorCount;
        this.color = color;
    }
}
