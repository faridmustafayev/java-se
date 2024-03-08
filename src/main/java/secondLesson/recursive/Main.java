package secondLesson.recursive;

public class Main {
    public static void main(String[] args) {

        int total = Recursive.factorial(5);
        System.out.println(total);

        System.out.println("---------------------------");

        Recursive.factorialForLoop(4);

    }
}
