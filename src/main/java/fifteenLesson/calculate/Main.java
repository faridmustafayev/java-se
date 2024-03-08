package fifteenLesson.calculate;

public class Main {
    public static void main(String[] args) {

        System.out.println(calculateSalary(500));

    }

    public static int calculateSalary(Integer paramVar) {

        int percentage = 20;

        paramVar -= (paramVar * percentage) / 100;

        return paramVar;
    }
}
