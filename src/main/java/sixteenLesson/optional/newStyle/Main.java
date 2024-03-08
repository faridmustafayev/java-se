package sixteenLesson.optional.newStyle;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional<String> optional = Optional.of("Javid");
        Optional<String> optionalEmpty = Optional.empty();


        Car car = new Car();

        if (car.getEngine().isPresent()) {
            System.out.println(car.getEngine().get());
            System.out.println(car.getEngine().orElseThrow());
            System.out.println(car.getEngine().orElseThrow(()-> new NoSuchElementException("element yoxdur")));
            System.out.println(car.getEngine().orElse(new Engine()));
            System.out.println(car.getEngine().orElseGet(()-> new Engine()));
        }


        new Car().getEngine().ifPresent(a-> System.out.println(a.getSize()));

//        if(car.getEngine().isPresent())
//            car.getEngine().map (a-> {return new Car(a.getSize() + 10);});


    }
}
