package seventeenLesson.ofAndNullable;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        String name = null;

        Optional<String> optional2 = Optional.ofNullable(name);
        System.out.println(optional2);

        if (optional2.isPresent())
            System.out.println(optional2.orElseThrow());


    }
}
