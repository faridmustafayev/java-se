package fourthLesson.concatenation;

public class Concatenation {

    public static void check() {

        System.out.println("a" + "b" + 3);
        System.out.println(2 + 3 + "a");
        System.out.println("------------------------");

        String name = "Fa";
        name = name.concat("rid");
        System.out.println(name);
        System.out.println("------------------------");

        String name2 = "Fa";
        name2.concat("rid");
        System.out.println(name2);

    }

}
