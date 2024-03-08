package fourthLesson.chaining;

public class Chaining {

    public static void check() {

        String name = "--students";
        name = name.toUpperCase();
        name = name.substring(2);
        name = name.concat("-SE");
        System.out.println(name);

        System.out.println("-----------------");

        String name2 = "--students";
        name2 = name2.toUpperCase().substring(2).concat("-SE");
        System.out.println(name2);

        System.out.println("------------------");

        "Farid".substring(3);

    }

}
