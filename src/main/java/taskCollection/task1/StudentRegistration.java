package taskCollection.task1;

import taskCollection.task1.groups.Group1;
import taskCollection.task1.groups.Group2;
import taskCollection.task1.groups.Group3;
import taskCollection.task1.groups.Group4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRegistration {

//    public String findAndReturnVieo(String id, String ipAddress){
//        if (database.videoexists(id)){
//            Video video =  database.readVideo(id);
            // sender.sendVideoToThisAddress(vidfeo,ipAddress);
//        }
//    }

    public static void register() {

        List<Group1> group1 = new ArrayList<>();
        List<Group2> group2 = new ArrayList<>();
        List<Group3> group3 = new ArrayList<>();
        List<Group4> group4 = new ArrayList<>();

        int studentCount1 = 0;
        int studentCount2 = 0;
        int studentCount3 = 0;
        int studentCount4 = 0;

        while (true) {

            Scanner input = new Scanner(System.in);

            System.out.print("enter your name: ");
            String name = input.nextLine();

            System.out.print("enter your group: ");
            int groupN = input.nextInt();

            Students students = new Students(name, groupN);

            if (students.getGroupN() == 1) {

                group1.add(new Group1(name, groupN));

                System.out.println(group1);
                studentCount1++;
            }
            else if (students.getGroupN() == 2) {

                group2.add(new Group2(name, groupN));

                System.out.println(group2);
                studentCount2++;
            }
            else if (students.getGroupN() == 3) {

                group3.add(new Group3(name, groupN));

                System.out.println(group3);
                studentCount3++;
            }
            else if (students.getGroupN() == 4) {

                group4.add(new Group4(name, groupN));

                System.out.println(group4);
                studentCount4++;
            }

            if (students.getGroupN() != 1 && students.getGroupN() != 2 && students.getGroupN() != 3 && students.getGroupN() != 4) {
                break;
            }
        }
        System.out.println("-----------------------------");

        System.out.println("information in group 1");
        System.out.println(group1);
        System.out.println("number of students in the group1: " + studentCount1);

        System.out.println("-----------------------------");

        System.out.println("information in group 2");
        System.out.println(group2);
        System.out.println("number of students in the group2: " + studentCount2);

        System.out.println("-----------------------------");

        System.out.println("information in group 3");
        System.out.println(group3);
        System.out.println("number of students in the group3: " + studentCount3);

        System.out.println("-----------------------------");

        System.out.println("information in group 4");
        System.out.println(group4);
        System.out.println("number of students in the group4: " + studentCount4);

    }

}
