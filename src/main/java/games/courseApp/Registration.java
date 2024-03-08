package games.courseApp;

import java.util.Random;
import java.util.Scanner;

public class Registration {
    static GroupStorage groupStorage = new GroupStorage();
    public static void register() {

        Scanner input = new Scanner(System.in);

        int counter = 0;

        while (counter < 3) {

            System.out.print("enter student's name: ");
            String nameStudent = input.nextLine();

            System.out.print("enter student's age: ");
            int age = input.nextInt();

            System.out.print("enter student's group: ");
            Random random = new Random();
            int randomNumber = random.nextInt(4) + 1;
            System.out.println(randomNumber);
            input.nextLine();

            if (randomNumber == groupStorage.g1.groupNumber) {
                groupStorage.g1.students.add(new Student(nameStudent, age));
            }
            else if (randomNumber == groupStorage.g2.groupNumber) {
                groupStorage.g2.students.add(new Student(nameStudent, age));
            }
            else if (randomNumber == groupStorage.g3.groupNumber) {
                groupStorage.g3.students.add(new Student(nameStudent, age));
            }
            else {
                if (randomNumber == groupStorage.g4.groupNumber) {
                    groupStorage.g4.students.add(new Student(nameStudent, age));
                }
                else {
                    throw new RuntimeException();
                }
            }

            counter++;

        }

    }
}
