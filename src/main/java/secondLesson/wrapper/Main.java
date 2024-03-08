package secondLesson.wrapper;

public class Main {
    public static void main(String[] args) {

        Integer integer1 = Integer.valueOf(127);
        Integer integer2 = Integer.valueOf(127);

        System.out.println(integer1 == integer2);
        System.out.println(integer1.equals(integer2));

        System.out.println("-------------------------------");

        Integer number = Integer.valueOf(5);

        int i = number.intValue();

        MyInteger myInt = new MyInteger(4);
        myInt.intValue();

        Float aFloat = Float.valueOf(3.3f);

        aFloat.floatValue();
        aFloat.describeConstable();

    }
}
