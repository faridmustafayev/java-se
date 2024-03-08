package tenLesson.customDataStructur;

public class Main {
    public static void main(String[] args) {

        String[] names = {"Cavid", "Orxan", "Royal"};
        MyDataStructur myDataStructur = new MyDataStructur(names);

        for (String name : myDataStructur) {
            System.out.println(name);
        }

    }
}
