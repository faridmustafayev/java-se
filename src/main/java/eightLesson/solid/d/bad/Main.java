package eightLesson.solid.d.bad;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.engine.size = 3;
        System.out.println(car.engine.size);

    }
}
