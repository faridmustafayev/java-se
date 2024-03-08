package taskCollection.task2;

import java.util.HashSet;
import java.util.Set;

public class User {

    public String name;
    public Set<Phone> phones = new HashSet<>();

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                '}';
    }

}
