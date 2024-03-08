package thirdLesson.blocks;

import java.util.Objects;

public class Blocks {

    {  // instance initializer blocks
        age = 23;
        System.out.println("iib1");
    }

    public int age = 21;
    public static String name;

    public Blocks(int age) {
        this.age = age;
        System.out.println("constructor");
    }


    static {  // static block
        name = "Farid";
        System.out.println(name);
    }

    public static void main(String[] args) {


        Blocks blocks = new Blocks(21);



//        int num = 3;
//
//        {
//            System.out.println("Hello");
//            int number = 5;
//            System.out.println(num);
//        }
//
//        {
//            System.out.println();
//            num++;
//            System.out.println(num);
//        }
    }



    {  // instance initializer blocks
        System.out.println("iib2");
    }

    public boolean equals(Object obj) {
        Blocks blocks = (Blocks) obj;
        return (this.age == blocks.age);
    }

    public int hashCode() {
        return Objects.hash(age);
    }

}
