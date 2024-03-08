package eightLesson.solid.i.good;

public interface UserDetails {
    User loadByUserName(String username);
}

interface UserDetailsManager {
    boolean addUser();
    boolean deleteUser(String username);
    boolean revokeUser(String username);
}

class User implements UserDetails {
    @Override
    public User loadByUserName(String username) {
        return null;
    }

    String username;
}