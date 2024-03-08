package tasks.checkNumber;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Set<User> strings = new HashSet<>();

        System.out.print("enter phone number: ");
        String phoneNumbers = input.nextLine();

        System.out.print("enter name: ");
        String name = input.nextLine();

        User user = new User(name, phoneNumbers);

        if (phoneNumbers.equals(user.getPhoneNumber())) {

            System.out.println("the system has a number ");
        }
        else {
            strings.add(new User(name, phoneNumbers));
        }

        System.out.println(strings);

    }
}