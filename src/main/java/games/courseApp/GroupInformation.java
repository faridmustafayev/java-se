package games.courseApp;

public class GroupInformation {

    public static void information(GroupStorage createGroup) {

        System.out.println("-----------------------------------");
        System.out.println("information about groups");
        System.out.println(createGroup);

        System.out.println("-----------------------------------");
        System.out.println("Number of students in group 1: " + createGroup.g1.students.size());
        System.out.println("Number of students in group 2: " + createGroup.g2.students.size());
        System.out.println("Number of students in group 3: " + createGroup.g3.students.size());
        System.out.println("Number of students in group 4: " + createGroup.g4.students.size());

        System.out.println("-----------------------------------");



    }
}
