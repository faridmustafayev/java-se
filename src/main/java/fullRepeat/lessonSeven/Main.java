package fullRepeat.lessonSeven;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("ELsen");
        names.add("Murad");
        names.add("ELsen");

        names.removeIf(e-> {return e.equals("Elsen");});
        names.forEach(System.out::println);

    }


}

