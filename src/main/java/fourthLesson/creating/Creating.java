package fourthLesson.creating;

public class Creating {

    public static void check() {

        String name = "Farid";  // literal
        System.out.println("-----------------------------");

        String name2 = new String("Farid"); // redundant
        System.out.println("------------------------------");

        char[] helloArray = {'h', 'e', 'l', 'l', 'o', '.'};
        System.out.println(helloArray);
        System.out.println("------------------------------");

        String helloString = new String(helloArray);
        System.out.println(helloString);
        System.out.println("-----------------------------");

        for (char hey : helloArray) {
            System.out.print(hey);
        }
        System.out.println();

        for (char value : "hello.".toCharArray()) {
            System.out.print(value);
        }
        System.out.println();

        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        String name3 = "Farid";
        String name4 = "Farid";

        System.out.println(name3 == name4);
        System.out.println(name3.equals(name4));

    }

}
