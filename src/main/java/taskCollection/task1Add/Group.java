package taskCollection.task1Add;

import java.util.ArrayList;
import java.util.List;

public class Group {

    public String groupName;
    public int groupNumber;

    public Group(String groupName, int groupNumber) {
        this.groupName = groupName;
        this.groupNumber = groupNumber;
    }

    List<Student> students = new ArrayList<>();

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", groupNumber=" + groupNumber +
                ", students=" + students +
                '}';
    }
}
