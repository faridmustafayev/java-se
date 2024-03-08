package fifteenLesson.calculate2;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

       if (calculateSalary(300)) {
           System.out.println("varli");
       }else {
           System.out.println("kasib");
       };

    }

    public static boolean calculateSalary(Integer salary) {

        int percentage = 20;

        salary -= (salary * percentage) / 100;

        Predicate<Integer> predicate = p -> p > 120;

        return predicate.test(salary);
    }
}