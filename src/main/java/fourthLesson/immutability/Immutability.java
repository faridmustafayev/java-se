package fourthLesson.immutability;

public class Immutability {

    public static void check() {

        String name = "Javid";
        String newPass = name.concat(" Teacher");
        System.out.println(name);
        System.out.println(newPass);

    }

}
