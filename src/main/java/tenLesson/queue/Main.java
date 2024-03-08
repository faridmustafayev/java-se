package tenLesson.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(2);
        queue.add(3);
        queue.add(1);

        queue.remove();

        System.out.println(queue);

        System.out.println("--------------------------");


        Queue<String> queue2 = new PriorityQueue<>();

        queue2.add("a");
        queue2.add("z");
        queue2.add("v");

        queue2.remove();

        System.out.println(queue2);

    }
}
