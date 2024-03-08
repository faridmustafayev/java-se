package eightLesson.solid.d.good;

public class Main {
    public static void main(String[] args) {
        Engine engine = new HybridCar();

        Car car = new Car(engine);

        Engine engine1 = new ElectricCar();
        Car car3 = new Car(engine1);

        car.startEngine();

        car3.startEngine();

    }
}

class HybridCar implements Engine {
    public void start() {
        System.out.println("start hybrid");
    }
}

class ElectricCar implements Engine {
    public void start() {
        System.out.println("start electric");
    }
}
