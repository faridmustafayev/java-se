package sixLesson.secondProgram;

public class Main {
    public static void main(String[] args) {

        Car.doorCount = 4;

        Engine engine = new Engine();
        engine.size = 4;

        Car.engine = engine;

        Car car = new Car();
        car.color = "red";
        car.speed = 0;

        car.start();

        car.showSpeed();

        car.brake();

        car.showSpeed();


    }
}
