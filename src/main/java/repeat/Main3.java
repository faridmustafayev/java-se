package repeat;

public class Main3 {
    public static void main(String[] args) {

        int[][] numbers = {{3, 4}, {5, 8, 2}, {1, 3}};

        for (int[] number : numbers) {
            for (int index = 0; index < number.length; index++) {
                System.out.print(number[index] + " ");
            }
            System.out.println();
        }


        System.out.println("-----------");


        int x = 20;

        while (x > 0) {
            do {
                x -= 2;
            }while (x > 5);
            x--;
            System.out.print(x + " ");
        }


    }
}
