package games.courseApp;

import java.util.ArrayList;
import java.util.List;

public class Group {
    public int groupNumber;
    public String groupName;
    Teacher teachers;
    List<Student> students = new ArrayList<>();


    public Group(int groupNumber, String groupName, Teacher teachers) {
        this.groupNumber = groupNumber;
        this.groupName = groupName;
        this.teachers = teachers;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupNumber=" + groupNumber +
                ", groupName='" + groupName + '\'' +
                ", students=" + students +
                ", teachers=" + teachers +
                '}';
    }
}
