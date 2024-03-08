package secondLesson.recursive;

public class Recursive {

    public static int factorial(int n) {
        if (n < 0) {
            throw new RuntimeException("a negative number does not have a factorial");
        } else if (n == 0) {
            return 1;
        }else {
            return n * factorial(n - 1);
        }
    }

    public static void factorialForLoop(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println(result);
    }

}
