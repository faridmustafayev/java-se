package eightLesson.solid.d.bad;

public class Car {
    EngineH engine;

    public Car() {
        engine = new EngineH();
    }

    public void startEngine(){
        engine.start();
    }
}
