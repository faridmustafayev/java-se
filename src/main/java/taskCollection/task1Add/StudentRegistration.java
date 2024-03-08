package taskCollection.task1Add;

import java.util.Scanner;

public class StudentRegistration {

    public static void register() {

        Group group1 = new Group("group-1", 1);
        Group group2 = new Group("group-2", 2);
        Group group3 = new Group("group-3", 3);
        Group group4 = new Group("group-4", 4);

        while (true) {

            Scanner input = new Scanner(System.in);

            System.out.print("enter student's name: ");
            String name = input.nextLine();

            System.out.print("enter student's age: ");
            int age = input.nextInt();

            System.out.print("enter student's group: ");
            int group = input.nextInt();
            input.nextLine();

            if (group == 1) {
                group1.students.add(new Student(name, age));
                System.out.println(group1);
            }
            else if (group == 2) {
                group2.students.add(new Student(name, age));
                System.out.println(group2);
            }
            else if (group == 3) {
                group3.students.add(new Student(name, age));
                System.out.println(group3);
            }
            else if (group == 4) {
                group4.students.add(new Student(name, age));
                System.out.println(group4);
            }
            else {
                System.out.println("exception: (there are four groups) ");
            }

            if (group != 1 && group != 2 && group != 3 && group != 4) {
                break;
            }

        }

        System.out.println("--------------------------------------");

        System.out.println("information about the first group .. ");
        System.out.println(group1);
        System.out.println("student's count: " + group1.students.size());

        System.out.println("--------------------------------------");

        System.out.println("information about the second group .. ");
        System.out.println(group2);
        System.out.println("student's count: " + group2.students.size());

        System.out.println("--------------------------------------");

        System.out.println("information about the third group .. ");
        System.out.println(group3);
        System.out.println("student's count: " + group3.students.size());

        System.out.println("--------------------------------------");

        System.out.println("information about the four group .. ");
        System.out.println(group4);
        System.out.println("student's count: " + group4.students.size());

        System.out.println("--------------------------------------");


    }

}
