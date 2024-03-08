package sixteenLesson.optional.oldStyle;

import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        System.out.println(car.getMode());


        if (car.engine != null)
            System.out.println(car.engine.getSize());
        else
            throw new NoSuchElementException("that is not here such element");

    }
}
