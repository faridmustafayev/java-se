package sevenLesson.upAndDownCasting;

public class Test {
    public static void main(String[] args) {

        Parent parent = new Child();

//        Child child = (Child) parent;

        test(new Child());

    }


    public static void test(Parent parent) {
        if (parent instanceof Child c) {
            System.out.println(c.age);
        }
        else {
            System.out.println("nothing");
        }
    }



}
