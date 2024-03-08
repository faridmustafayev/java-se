package fifthLesson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("---------------------------");

//        uncheckedException();

        System.out.println("---------------------------");

//        checkedException();

        System.out.println("---------------------------");

//        error();

        System.out.println("---------------------------");

//        report();

//        a();
//        System.out.println("program davam edir");


//        try {
//            FileReader fr1 = new FileReader("/path/test.dox");
//        }catch (FileNotFoundException exception) {
//            System.out.println(exception.getMessage());
//        }

        System.out.println("------------------------------");

        System.out.println("a");
        Custom custom = new Custom();
        try (custom) {
            System.out.println("inside try");
        }
        System.out.println("b");

    }

    public static void a() {
        System.out.println("a");
        b();
    }

    public static void b() {
        System.out.println("b start");

        try {
            int[] array = new int[-2];
            System.out.println(array[5]);
        }catch (ArrayIndexOutOfBoundsException | NegativeArraySizeException exception){
            System.out.println(exception.getMessage());
        }

        System.out.println("b end");

    }

    public static void report() throws IOException {


    }

    public static void uncheckedException() {

        //ArrayIndexOutOfBoundsException
//        int[] array = new int[3];
//        System.out.println(array[5]);

        //NegativeArraySizeException
//        int[] a = new int[-3];

        // ArithmeticException
//        System.out.println(5 / 0);

        // NullPointerException
//        String name = null;
//        System.out.println(name.concat(""));

    }

    public static void checkedException() {

        // FileNotFoundException
        try {
            FileReader fileReader = new FileReader("olmayan/ skajs");
            System.out.println(fileReader);
        }
        catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }

        // handle et
        // throws upper

    }

    public static void error() {

        //StackOverLowError
//        Test test = new Test();

        //OutOfMemoryError   // Java heap space
//        List<byte[]> list = new ArrayList<>();
//        int index = 1;
//        while (true) {
//            byte[] b = new byte[1048576];
//            list.add(b);
//        }

    }

}