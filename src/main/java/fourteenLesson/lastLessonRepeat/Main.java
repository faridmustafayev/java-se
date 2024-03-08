package fourteenLesson.lastLessonRepeat;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        // 1
        test(e-> System.out.println(e), "Hello1");

        // 2
        test(System.out::println, "Hello2");

        // 3
        test(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        }, "Hello3");

        // 4
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        test(consumer, "Hello4");

        // 5
        Consumer<String> consumer1 = new Consumerator<>();
        test(consumer1, "Hello5");
    }

    public static void test(Consumer<String> consumer, String text) {
        consumer.accept(text);
    }
}

class Consumerator<T> implements Consumer<T> {
    public void accept(T t) {
        System.out.println(t);
    }
}