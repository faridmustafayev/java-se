package hackerRank;

public class CatsAndMouse2 {
    public static void main(String[] args) {



    }

    public static String catsAndMouse(int x, int y, int z) {

        String name = null;

        int num1 = Math.abs(z - x);
        int num2 = Math.abs(z - y);

        if (num1 < num2) {
            name = "Cat A";
        } else if (num1 == num2) {
            name = "Mouse C";
        }else {
            name = "Cat B";
        }


        return name;


    }

}
