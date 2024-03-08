package secondLesson.equals;

public class Main {
    public static void main(String[] args) {

        Person javid = new Person();
        javid.age = 28;

        Person orxan = new Person();
        orxan.age = 28;

        System.out.println(javid == orxan);
        System.out.println(javid.equals(orxan));


        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");


        Person farid = new Person();

        Person ramiz = farid;
        ramiz.age = 23;

        Person namig = farid;
        namig.name = "Namiq";

        System.out.println(farid == ramiz);
        System.out.println(farid.equals(ramiz));
        System.out.println(farid.equals(namig));

        System.out.println(farid.name);


        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");


    }
}
