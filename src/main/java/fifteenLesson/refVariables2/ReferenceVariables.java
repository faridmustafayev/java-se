package fifteenLesson.refVariables2;

import java.util.function.Predicate;

public class ReferenceVariables {

    public Integer instanceVar;
    public static Integer staticVar = 26;


    public static void main(String[] args) {

        checking(25);

    }

    public static void checking(Integer paramVar) {

        int param = 25;

        Predicate<Integer> predicate = para-> staticVar > 20;
        
        System.out.println(predicate.test(staticVar));


    }
}
