package repeat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {


        int x = 0;

        for(int y = 0, z = 4 ; x < 5 && y < 10 ; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.println(x);


        int[] values = {3, 4, 2};


        for (Iterator<Integer> i = Arrays.stream(values).iterator(); i.hasNext(); ) {
            int value = i.next();
            System.out.print(value + ", ");
        }

        System.out.println();

        List<String> names = Arrays.asList("Farid", "Javid");

        for (int index = 0; index < names.size(); index++) {
            String name = names.get(index);

            if (index > 0) {
                System.out.print(", ");
            }
            System.out.print(name);
        }


    }

}
