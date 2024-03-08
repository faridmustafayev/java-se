package secondLesson.staticImport;

import java.util.Scanner;
//import java.util.Scanner.*;

import static java.lang.Math.*;

import static secondLesson.staticImport.StaticImport.name;
import static secondLesson.staticImport.StaticImport.test;



public class Main {
    String name;
    public static void main(String[] args) {

        java.util.Scanner input = new Scanner(System.in);

        System.out.println(secondLesson.staticImport.StaticImport.name);

        System.out.println("------------------------------------");

        Main main = new Main();
        System.out.println(main.name);

        test();

        double number = sqrt(5.3);


    }
}