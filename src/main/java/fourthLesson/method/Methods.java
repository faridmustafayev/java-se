package fourthLesson.method;

public class Methods {

    public static void check() {

        String name = "Farid";
        System.out.println(name.length());
        System.out.println("----------------------");

        String animal = "monkey";
        System.out.println(name.charAt(0));   // m
//        System.out.println(name.charAt(5));  // StringIndexOutOfBoundsException
        System.out.println("------------------------");

        String string = "animals";
        System.out.println(string.substring(3));
        System.out.println(string.substring(3, 4));  // 4 daxil deyil
//        System.out.println(string.substring(3, 9));  // error verecek
//        System.out.println(string.substring(3, 2));  // error
        System.out.println(string.substring(3, 3));
        System.out.println("------------------------");

        String lower = "animal";
        System.out.println(lower.toUpperCase());

        String upper = "ANimal";
        System.out.println(upper.toLowerCase());

        System.out.println("------------------------");

        System.out.println("abc".equals("ABC"));  // false
        System.out.println("abc".equals("abc"));
        System.out.println("abc".equalsIgnoreCase("Abc"));

    }

}
