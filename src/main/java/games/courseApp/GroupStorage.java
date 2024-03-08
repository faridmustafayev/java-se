package games.courseApp;

public class GroupStorage {

    Group g1 = new Group(1, "group-1", new Teacher("Javid", "higher", 28));
    Group g2 = new Group(2, "group-2", new Teacher("Cefer", "bachelors", 18));
    Group g3 = new Group(3, "group-3", new Teacher("Namiq", "higher", 32));
    Group g4 = new Group(4, "group-4", new Teacher("Xezer", "bachelors", 19));



        @Override
    public String toString() {
        return "CreateGroups{" +
                "\ng1=" + g1 +
                ", \ng2=" + g2 +
                ", \ng3=" + g3 +
                ", \ng4=" + g4 +
                '}';
    }
}
