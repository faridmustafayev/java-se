package firstLesson;

public class Main {
    public static void main(String[] args) {

        Person javid = new Person("Javid", 34, "Aze2");
        Person orxan = new Person("Orxan", 34, "Aze32");

        System.out.println(javid == orxan);               // Referenclerin beraberliyini yoxlayir odaki yanlisdir false verir

        System.out.println("-------------------");

        System.out.println(javid.equals(orxan));

        System.out.println("-------------------");

        System.out.println(javid.age == orxan.age);      // nomre hamida ferqli olur deye onlari yoxlayiriq yaslari, ya da name hisseleri yox

        System.out.println("-------------------");
        System.out.println("-------------------");
        System.out.println("-------------------");


        Child child = new Child("Afgan", 24, "Aze45");
        test(child);

        Person person = new Child("Farid", 21, "ksk");
//        test2(person);    // compiler error verme sebebi down castingdir deye. Child data type verilmelidir


    }

    public static void test(Person person){

    }

    public static void test2(Child child) {
        child.agla();
    }

}


