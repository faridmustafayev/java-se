package thirteenLesson.fourAdd;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Animal bird = new Animal("Bird", 2, true);

        Predicate<Animal> predicateLegCount = e-> e.legCount == 2;

        test(bird, predicateLegCount);
        test(bird, e-> !e.name.equals("Bird"));


    }

    public static void test(Animal animal, Predicate<Animal> predicate) {
        System.out.println(predicate.test(animal));
    }

}

class Animal {
    public String name;
    public Integer legCount;
    public boolean fly;

    public Animal(String name, Integer legCount, boolean fly) {
        this.name = name;
        this.legCount = legCount;
        this.fly = fly;
    }
}