package taskCollection.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 0;

        System.out.print("enter user's name: ");
        String name = input.nextLine();

        User user = new User(name);

        while (counter < 4) {

            System.out.print("User enter any number for checking: ");
            String phoneNumber = input.nextLine();

            if (user.phones.contains(new Phone(phoneNumber))) {
                System.out.println("there is already this number in the system ");
                break;
            }
            else {
                user.phones.add(new Phone(phoneNumber));
                System.out.println(user.phones);
                counter++;
            }

        }

        System.out.println("------------------------------------------------------");
        System.out.println("The numbers listed below were received by --> " + name);
        System.out.println(user.phones);

    }
}
